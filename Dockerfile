FROM openjdk:11
RUN git clone https://github.com/MrDebuggins/PPlab1.git
WORKDIR /PPlab1
CMD java -cp out/production/untitled104 com.lab1.Main
