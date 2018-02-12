## 介绍
用Spring boot搭建一个基本应用

Spring 框架两个核心概念
1. 依赖注入
http://blog.csdn.net/javazejian/article/details/54561302

2. 切面编程
http://longliqiang88.github.io/2015/08/18/Spring%E5%AD%A6%E4%B9%A04%EF%BC%9ASpring%20AOP%EF%BC%88%E9%9D%A2%E5%90%91%E5%88%87%E9%9D%A2%E7%BC%96%E7%A8%8B%EF%BC%89/


## 代码包结构组织
1.domain：这一层是用来管理javaBean实体对象的；
2.dao:数据访问层，对数据库进行访问；
3.service：业务逻辑层，通过调用dao层来对数据库进行访问；
4.web：数据显示层；
web发出请求---domain接收控制数据转向(可以返回也可以进入service)---service验证数据正确性或者是否符合业务要求---dao存入，读出，依次返回

## 部署
将maven打包后的jar文件和依赖的jar文件直接拷贝到服务器上
运行java -jar *.jar 执行我们的应用就可以了