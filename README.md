# Springboot-basic
Springboot基础框架，可以在此基础上进行拓展


使用的是springboot 1.5.9

maven配置:
```
 <profiles>
    <id>jdk-1.8</id>
    <activation>
      <activeByDefault>true</activeByDefault>
      <jdk>1.8</jdk>
    </activation>
    <properties>
      <maven.compiler.source>1.8</maven.compiler.source>
      <maven.compiler.target>1.8</maven.compiler.target>
      <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
    </properties>
 </profiles>
正常最初级的依赖只需要
```
<parent>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-parent</artifactId>
     <version>2.7.4</version>
     <relativePath/> <!-- lookup parent from repository -->
</parent>
<dependencies>
     <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
     </dependency>
</dependencies>
这个插件可以直接将项目打成jar包，不需要安装tomcat
```
<build>
     <plugins>
     <plugin><!-- 这个插件可以将应用打成一个jar包-->
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <version>2.4.4</version>
     </plugin>
     </plugins>
</build>
他的父项目是
```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.7.4</version>
</parent>
他来掌控springboot应用里的所有依赖的版本 springboot的版本控制中心，以后导入所有的依赖是不需要加版本号（dependencies以外的除开）
