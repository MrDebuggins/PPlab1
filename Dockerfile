FROM openjdk:11
RUN git clone https://github.com/MrDebuggins/PPlab1.git
WORKDIR /tmp
CMD java com.lab1.Main