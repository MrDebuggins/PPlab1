FROM openjdk:11
RUN git clone https://github.com/MrDebuggins/PPlab1.git
WORKDIR /out
CMD java -classpath production/untitled104/com.lab1.Main