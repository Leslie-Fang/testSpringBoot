## 介绍
用Spring boot搭建一个基本应用实现用户的注册以及登录功能
* 前端： 用基本的JQuery Ajax+HTML+CSS
* 后端： 用springboot的jdbc template访问mysql数据库

Spring 框架两个核心概念
1. 依赖注入
http://blog.csdn.net/javazejian/article/details/54561302

2. 切面编程
http://longliqiang88.github.io/2015/08/18/Spring%E5%AD%A6%E4%B9%A04%EF%BC%9ASpring%20AOP%EF%BC%88%E9%9D%A2%E5%90%91%E5%88%87%E9%9D%A2%E7%BC%96%E7%A8%8B%EF%BC%89/

## 代码包结构组织
* domain：这一层是用来管理javaBean实体对象的；一个domain为一个对象，对应了一张数据库的表
* dao:数据访问层，对数据库进行访问；持久化层 ORM 框架实现以对象-关系数据库的映射
* service：业务逻辑层，通过调用dao层来对数据库进行访问；
* web：数据显示层；提供RESTful API

web发出请求---domain接收控制数据转向(可以返回也可以进入service)---service验证数据正确性或者是否符合业务要求---dao存入，读出，依次返回

## JDBC访问数据库
使用JDBC： **In this project, we would use JDBC**
http://huster.top/htmls/436.html
https://spring.io/guides/gs/relational-data-access/
http://www.iteye.com/topic/53526

## 部署
将maven打包后的jar文件和依赖的jar文件直接拷贝到服务器上
运行java -jar *.jar 执行我们的应用就可以了

## 本项目下一步计划:
Done: 重构项目目录，实现用户注册和登录的功能

## 下一步单独构建的项目：
* 项目1：使用sapui5前端，如何构建项目结构
* 项目2： Spring boot使用JPA访问数据库
使用JPA：http://www.aidansu.com/2017/spring-boot-mysql-jpa/
* 项目3： 集成sapui5以及odata访问数据库

