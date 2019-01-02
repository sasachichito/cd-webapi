### Concourse構築
```
# 公式docker-compose.ymlからコンテナ起動
$ wget https://raw.githubusercontent.com/starkandwayne/concourse-tutorial/master/docker-compose.yml
$ docker-compose up -d

# Pipelineセット

```

### App用DB構築
```
# 公式MySQLイメージからコンテナ起動
$ docker run --name mysql -e MYSQL_ROOT_PASSWORD=mysql -d -p 3306:3306 mysql
$ mysql -u root -p -h 127.0.0.1 -e 'create database if not exists my_db;'
```

### App起動
```
$ ./gradlew build
$ java -Dspring.profiles.active=dev -jar build/libs/cd_webapi-0.0.1-SNAPSHOT.jar
```

### 公開API
```
# ユーザー一覧
$ curl -w '\n' 'http://localhost:8080/users/' -X GET

# ユーザー情報
$ curl -w '\n' 'http://localhost:8080/users/fugafuga' -X GET

# ユーザー登録
$ curl -w '\n' 'http://localhost:8080/users/XXXXXXXXXXXX' -X POST
```
