# init
```
$ docker run --name mysql -e MYSQL_ROOT_PASSWORD=mysql -d -p 3306:3306 mysql
$ mysql -u root -p -h 127.0.0.1 -e 'create database if not exists my_db;'
```
