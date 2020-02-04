# combined_spring_boots_test

See the build.gradle files in each of the projects and DemoApplication in combined for the goodies about how this is done.

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
