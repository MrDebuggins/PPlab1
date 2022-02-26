FROM openjdk:11
RUN git clone https://github.com/MrDebuggins/PPlab1.git
WORKDIR /src
CMD java -classpath com.lab1.Main