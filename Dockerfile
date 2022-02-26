FROM openjdk:11
RUN git clone C:/Users/onofr/PP/lab1/.git/
WORKDIR /tmp
CMD java com.lab1.Main