## 介绍
用Spring boot搭建一个基本应用

Spring 框架两个核心概念
1. 依赖注入
http://blog.csdn.net/javazejian/article/details/54561302

2. 切面编程
http://longliqiang88.github.io/2015/08/18/Spring%E5%AD%A6%E4%B9%A04%EF%BC%9ASpring%20AOP%EF%BC%88%E9%9D%A2%E5%90%91%E5%88%87%E9%9D%A2%E7%BC%96%E7%A8%8B%EF%BC%89/


## 代码包结构组织
1.domain：这一层是用来管理javaBean实体对象的；一个domain为一个对象，对应了一张数据库的表
2.dao:数据访问层，对数据库进行访问；持久化层 ORM 框架实现以对象-关系数据库的映射
3.service：业务逻辑层，通过调用dao层来对数据库进行访问；
4.web：数据显示层；提供RESTful API
web发出请求---domain接收控制数据转向(可以返回也可以进入service)---service验证数据正确性或者是否符合业务要求---dao存入，读出，依次返回

## 部署
将maven打包后的jar文件和依赖的jar文件直接拷贝到服务器上
运行java -jar *.jar 执行我们的应用就可以了


next Step:
1. 重构dao,domain,web,service的作用

2. 添加对数据库的访问
连接mysql：
方案一：使用JDBC： **In this project, we would use JDBC**
http://huster.top/htmls/436.html
https://spring.io/guides/gs/relational-data-access/
http://www.iteye.com/topic/53526
方案二：使用JPA：http://www.aidansu.com/2017/spring-boot-mysql-jpa/

3. 添加sapui5