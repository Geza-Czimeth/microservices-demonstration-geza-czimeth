# cloud-config-server

This project is the cloud configuration server for the application. The configuration files are loaded from git repository.

Configuration file is <pre>src\main\resources\application.properties</pre>

### Build

mvn clean install

### Run

java -jar target/cloud-config-server-1.0-SNAPSHOT.jar

Note:
Tested locally with "java 18.0.2 2022-07-19"

