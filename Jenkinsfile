pipeline {
 agent none

 environment{
   SERVICE_NAME = "mfshell"
   ORGANIZATION_NAME = "myfinance"
   DOCKERHUB_USER = "holgerfischer"
   VERSION = "0.13.${BUILD_ID}"
   REPOSITORY_TAG = "${DOCKERHUB_USER}/${ORGANIZATION_NAME}-${SERVICE_NAME}:${VERSION}"
   NEXUS_URL = "192.168.100.73:31001"
   TARGET_REPO = "http://${NEXUS_URL}/repository/maven-snapshots/"
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
       sh 'docker image build -t ${REPOSITORY_TAG} ./mf-docker-images/docker/mfshell/'
     }
   }

   stage('deploy to cluster'){
     agent any
     steps {
       sh 'kubectl delete job.batch/mfupgrade'
       sh 'envsubst < deploy.yaml | kubectl apply -f -'
     }
   }
 }
}
