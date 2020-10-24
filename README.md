# POS System [Layered-Spring knows Hibernate with Maven]

In this **POS System** has all the functionalities of a POS system, like customer adding,item management,order placing,order viewing and order searching.It consists of five main parts;

    * Manage customers
    * Manage items
    * Placeorders
    * View orders
    * Search orders

## Dependencies

* [JFoenix](https://mvnrepository.com/artifact/com.jfoenix/jfoenix/8.0.10) - is an open source Java library, that implements Google Material Design using Java components.
* [MySQL Connector](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21) - MySQL Connector/J is the official JDBC driver for MySQL.
* [Project Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.12) - Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
                                                                                          Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables and etc;
* [Hibernate Core](https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.4.21.Final) - **Hibernate** reduces lines of code by maintaining object-table mapping(ORM) itself and returns result to application in form of Java objects. It relieves programmer from manual handling of persistent data, hence reducing the development time and maintenance cost.                                                                                          
* [Spring Context](https://mvnrepository.com/artifact/org.springframework/spring-context/5.2.8.RELEASE) - Spring contexts are also called Spring IoC containers, which are responsible for instantiating, configuring, and assembling beans by reading configuration metadata from XML, Java annotations, and/or Java code in the configuration files.
* [Spring ORM](https://mvnrepository.com/artifact/org.springframework/spring-orm/5.2.8.RELEASE) - Benefits of using the Spring Framework to create your ORM DAOs include: Easier testing. Spring's IoC approach makes it easy to swap the implementations and configuration locations of Hibernate SessionFactory instances, JDBC DataSource instances, transaction managers, and mapped object implementations (if needed).

Further this POS System has implemented by using various technologies and frameworks.Click the above link to check those implementations.

[Different Implementations of POS System](https://github.com/poornimavithanage/PointOfSalesSystem-Layered-Architecture/blob/master/README.md)    

## Prerequisites

* Before use this application you must need to install [JAVA](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) runtime environment and [MYSQL](https://www.mysql.com/) database management services.

## Configurations

Find the resource directory from src/main/resources/application.properties and config the below properties with your dialect,database name,user name and password.

`hibernate.dialect=org.hibernate.dialect.<dialect>
 hibernate.connection.url=jdbc:mysql://localhost:3306/<database name>?createDatabaseIfNotExist=true
 hibernate.connection.username=<user name>
 hibernate.connection.password=<password>

## Maven

> Maven is project/build management tool.
  
  Instead of downloading and placing the jars manually in the project, we can use maven to automate the process. We can define the dependency in the **pom.xml (Project object model)**. Maven requires internet to download the jars, which is a one time process.

## Spring

 Spring is the most popular application development framework for enterprise Java.
 The core features of the Spring Framework can be used in developing any Java application, but there are extensions for building web applications on top of the Java EE platform. Spring framework targets to make J2EE development easier to use and promotes good programming practices by enabling a POJO-based programming model.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)


