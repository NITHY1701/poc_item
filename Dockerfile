From openjdk:8
copy ./target/poc_item-0.0.1-SNAPSHOT.jar poc_item-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","poc_item-0.0.1-SNAPSHOT.jar"]