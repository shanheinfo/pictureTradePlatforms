# 目录
* <a href="#pictureTradePlatforms简介">pictureTradePlatforms简介</a>
* <a href="#使用技术栈">使用技术栈</a>
* <a href="#运行项目">运行项目</a>
* <a href="#生产环境要求">生产环境要求</a>
* <a href="#接口文档">接口文档</a>
* <a href="#生产环境要求">本项目功能架构图</a>

# pictureTradePlatforms简介
pictureTradePlatforms论坛是 newcodeteam 系列的产品<br>
pictureTradePlatforms （图片交易系统）是一个图片交易网站，提供用户上传图片，设置价格进行交易，也提供用户购买其他人的图片，并下载。<br>
基于Java开发的大型单体项目，并且基于 Apache-2.0 license 协议共享，是一个可以商业化运营还能二次开发的商业项目。<br>
由shanhe(山河)开发<br>

## 使用技术栈
本项目基于Java开发，采用MVC模式开发。<br>
后端使用：SpringBoot + Mybatis-plus + Mysql <br>
第三方库:lombok + Swagger + Hutool  <br>
前端使用：boostrap 6 + Thymeleaf 

## 运行项目
idea 打开 pom.xml文件<br>
然后在`src/main/resources`目录里面找到 `database.sql` 文件，将sql导入进数据库，如果已经创建了数据库名，请自己打开sql文件将第一行创建数据库删除，并修改下边的use XX [XX为你的数据库名字]<br>
并在`src/main/resources`里的`application.properties`文件中设置Mysql的账号密码<br>
在 `application.properties` 中配置一下 `file.upload.path=E:\\img\\` 将 `E:\\img\\` 改为你想要存放的硬盘和文件夹。
并将 img.zip 压缩包解压到该文件夹中 ,将里面的 `2024-01-04 文件夹` 拿出来。 
最后等待加载完依赖即可运行。

## 生产环境要求
1. Mysql 5.7 以上
2. Springboot 2+
3. JDK 11 以上
4. Tomcat 8 - 9 
<br>
最好使用docker 进行配置 ，后续也会推出docker环境包

## 接口文档
运行项目之后，然后打开<br>
~~`localhost:8080/doc.html`~~


# 本项目功能架构图
~~![img.png](src/main/resources/assets/img.png)~~
