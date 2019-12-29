#!/usr/bin/env bash

type=snapshot
port=8080
version=`mvn -q -Dexec.executable="echo" -Dexec.args='${project.version}' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.6.0:exec`

mvn -U clean package -f pom.xml -Dmaven.test.skip=true
docker build -t saas/multi-renter:${version} --build-arg JAR_FILE=target/multi-renter.jar .
if docker ps --format '{{.Names}}' | egrep "^saas-multi-renter-${type}$" &> /dev/null; then
    docker stop saas-multi-renter-${type}
else
    echo "there is no container saas-multi-renter-${type} running"
fi
if docker container ls -a --format '{{.Names}}' | egrep "^saas-multi-renter-${type}$"; then
    docker rm saas-multi-renter-${type}
else
    echo "there is no container saas-multi-renter-${type}"
fi
docker run -m 192M -d -v /opt/logs:/opt/logs/ -v /var/run/docker.sock:/var/run/docker.sock -p ${port}:8080 -p 5005:5005  --restart=always --name=saas-multi-renter-${type} saas/multi-renter:${version}
