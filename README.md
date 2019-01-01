# DB構築
```
$ docker run --name mysql -e MYSQL_ROOT_PASSWORD=mysql -d -p 3306:3306 mysql
$ mysql -u root -p -h 127.0.0.1 -e 'create database if not exists my_db;'
```

# App起動
```
$ ./gradlew build
$ java -Dspring.profiles.active=dev -jar build/libs/cd_webapi-0.0.1-SNAPSHOT.jar
```