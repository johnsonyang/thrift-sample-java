#!/bin/sh


javac -Xlint:unchecked -classpath .:../libs/libthrift-0.9.0.jar:../libs/slf4j-api-1.7.5.jar ThriftCalcServer.java ThriftCalcServerImpl.java TinyCalc.java -d build
