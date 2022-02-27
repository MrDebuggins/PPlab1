FROM openjdk:11
RUN git clone https://github.com/MrDebuggins/PPlab1.git
WORKDIR /PPlab1/out/production/untitled104
CMD java com.lab1.Main 5
