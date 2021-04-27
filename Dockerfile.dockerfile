FROM openjdk:11
ARG csvFilename
COPY $csvFilename ./data.csv
# copies the csv file and java file into container
COPY src/CSVDataPrinter.java ./
# compiles java file during build
RUN javac CSVDataPrinter.java
# when container is run, java code is executed
#RUN echo $csvFilename
CMD ["java", "CSVDataPrinter", "data.csv"]