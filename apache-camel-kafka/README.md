1. Download & Extract Apache Kafka
2. Navigate to the root folder
3. Open a command prompt and type in following command to start ZOOKEEPER
	.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
4. Open another command prompt and type in following command to start KAFKA
	.\bin\windows\kafka-server-start.bat .\config\server.properties
5. Open another command prompt and type following to create a new TOPIC
	.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic javainuse-topic
6. After creating topic type in following in the same command prompt to listen the TOPIC
	.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javainuse-topic --from-beginning
7. Create a maven project
8. Add the dependencies
9. Create the java classes
10. Create a text file in following path or a path u like D:\JMS\TESTDATA\KAFKA
11. Run the application
12. Monitor the listening command prompt
	