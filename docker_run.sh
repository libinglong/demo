#!/usr/bin/env bash

type=snapshot
port=8080
version=`/opt/maven/bin/mvn -q -Dexec.executable="echo" -Dexec.args='${project.version}' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.6.0:exec`

/opt/maven/bin/mvn -U clean package -f pom.xml
/bin/docker build -t saas/houseprice:${version} --build-arg JAR_FILE=houseprice-svc/target/houseprice.jar .
if /bin/docker ps --format '{{.Names}}' | egrep "^saas-houseprice-${type}$" &> /dev/null; then
    /bin/docker stop saas-houseprice-${type}
else
    echo "there is no container saas-houseprice-${type} running"
fi
if /bin/docker container ls -a --format '{{.Names}}' | egrep "^saas-houseprice-${type}$"; then
    /bin/docker rm saas-houseprice-${type}
else
    echo "there is no container saas-houseprice-${type}"
fi
/bin/docker run -d -v /opt/logs:/opt/logs/ -v /var/run/docker.sock:/var/run/docker.sock -p ${port}:8080 -p 5005:5005  --restart=always --name=saas-houseprice-${type} saas/houseprice:${version}
