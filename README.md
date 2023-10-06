# mfshell

build local:
mvn clean install -DtargetRepository=http://192.168.100.73:31001/repository/maven-releases/ -DNEXUS_URL=192.168.100.73:31001
or modify mvn settings: mvn clean install -s settings.xml

to install the application manually with helm: 
helm repo update
helm upgrade -i --cleanup-on-fail mfshell local/mfshell --set stage=prod --devel

or install the complete bundle see repo mfbundle

## rest client

if you want to generate a new restclient for the backend connection:
 start a local backend with default credentials (if you want to modify the backend location please patch myfinance-client-generation/pom)
 run "mvn clean install in folder restclientgeneration

