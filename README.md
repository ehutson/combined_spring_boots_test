# combined_spring_boots_test

To build combined,

```
cd data1
./gradlew build jar publishToMavenLocal

cd ../data2
./gradlew build jar publishToMavenLocal

cd ../combined
./gradlew build bootJar

java -jar build/libs/demo-0.0.1-SNAPSHOT.jar

curl localhost:8080/data1
Hello from data1

curl localhost:8080/data2
Hello from data2
```

To build standalone,

```
cd data1
./gradlew bootJar

java -jar build/libs/data1-standalone-0.0.1-SNAPSHOT.jar

curl localhost:8080/data1
Hello from data1
```
