pipeline {
 agent none

 environment{
   SERVICE_NAME = "mfshell"
   ORGANIZATION_NAME = "myfinance"
   DOCKERHUB_USER = "holgerfischer"
   //Snapshot Version
   VERSION = "0.13.0-alpha.${BUILD_ID}"
   //Release Version
   //VERSION = "0.13.0"
   REPOSITORY_TAG = "${DOCKERHUB_USER}/${ORGANIZATION_NAME}-${SERVICE_NAME}:${VERSION}"
   K8N_IP = "192.168.100.73"
   NEXUS_URL = "${K8N_IP}:31001"
   TARGET_REPO = "http://${NEXUS_URL}/repository/maven-releases/"
   DOCKER_REPO = "${K8N_IP}:31003/repository/mydockerrepo/"
   TARGET_HELM_REPO = "http://${NEXUS_URL}/repository/myhelmrepo/"
 }

 stages{
   stage('preperation'){
    agent {
        docker {
            image 'maven:3.6.3-jdk-8' 
        }
    }      
     steps {
       cleanWs()
       git credentialsId: 'github', url: "https://github.com/${ORGANIZATION_NAME}/${SERVICE_NAME}.git"
     }
   }
   stage('build'){
    agent {
        docker {
            image 'maven:3.6.3-jdk-8' 
        }
    }      
     steps {
       sh '''mvn versions:set -DnewVersion=${VERSION}'''
       sh '''mvn clean deploy -DtargetRepository=${TARGET_REPO} -DNEXUS_URL=${NEXUS_URL}'''
     }
   }
   stage('build and push Images'){
    agent {
        docker {
            image 'docker' 
        }
    }        
     steps {
       sh 'docker image build -t ${REPOSITORY_TAG} ./mf-docker-images/target/docker-prep/mfshell/'
       sh 'docker tag ${REPOSITORY_TAG} ${DOCKER_REPO}${REPOSITORY_TAG}'
       sh 'docker push ${DOCKER_REPO}${REPOSITORY_TAG}'
     }
   }

   stage('deploy to cluster'){
     agent any
     steps {
       // sh 'envsubst < deploy.yaml | kubectl apply -f -'
       sh 'envsubst < ./helm/mfshell/Chart_template.yaml > ./helm/mfshell/Chart.yaml'      
       sh 'helm package helm/mfshell -u -d helmcharts/'
       sh 'curl ${TARGET_HELM_REPO} --upload-file helmcharts/mfshell-${VERSION}.tgz -v'
       sh 'helm upgrade -i --cleanup-on-fail mfshell ./helm/mfshell/ --set repository=${DOCKER_REPO}/${DOCKERHUB_USER}/${ORGANIZATION_NAME}-'
     }
   }
 }
}
