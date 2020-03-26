FROM openjdk:12.0.2-jdk-oracle

VOLUME ["/etc/timezone:/etc/timezone"]
VOLUME ["/etc/localtime:/etc/localtime"]

WORKDIR /app

ADD /target/arch-1.0.jar /app

EXPOSE 80

CMD ["java","-jar","arch-1.0.jar"] 