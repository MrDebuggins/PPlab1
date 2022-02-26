FROM openjdk:11
RUN git clone https://github.com/MrDebuggins/PPlab1.git /tmp
WORKDIR /tmp/src
CMD java com.lab1.Main