FROM centos:latest
RUN yum install java -y
RUN mkdir -p /opt/tomcat
WORKDIR /opt/tomcat
RUN curl -O https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.97/bin/apache-tomcat-9.0.97.tar.gz \
    && tar -xvzf apache-tomcat-9.0.97.tar.gz \
    && mv apache-tomcat-9.0.97/* /opt/tomcat \
    && rm -f apache-tomcat-9.0.97.tar.gz
EXPOSE 9999
CMD ["/opt/tomcat/bin/catalina.sh", "run"]
