FROM java:8
ENV LANG C.UTF-8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ENV JAVA_OPTS="-Xmx128M -Xms128M -Xmn96M -XX:+UseConcMarkSweepGC -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=70 -XX:+ExplicitGCInvokesConcurrentAndUnloadsClasses -XX:+CMSClassUnloadingEnabled -XX:+ParallelRefProcEnabled -XX:+CMSScavengeBeforeRemark -XX:+PrintGCApplicationStoppedTime -XX:+PrintHeapAtGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCDetails -XX:MaxMetaspaceSize=50M -XX:MetaspaceSize=10M -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]