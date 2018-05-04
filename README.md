# Rong_Springmvc

一 创建maven项目 
    1、选择create a simple project（...），下一步
	2、Group id 输入src包名，Artifact id 输入项目名称，完成。
二 把maven项目变为动态网站
   1、右击项目properties ，在project facets中操作变为动态网站。
三 搭建spring项目 
    1、配置maven依赖，配置pom.xml写入srpingmvc相关org.springframework： 
    2、maven依赖导入到项目 
    3、在WIB-INF目录下，创建一个spring-mvc-servlet.xml文件，用来配置springmvc 
    4、配置web.xml文件，DispatcherServlet和拦截请求 
    5、WEB-INF下创建一个view文件夹，在view文件夹下，创建一个hello.jsp 
    6、src/main/java下创建控制器 HelloController.java 
    
    
  注意：Maven搭建一个Spring项目，遇到错误：Java.lang.ClassNotFoundException: org.springframework.web.servlet.DispatcherServlet，
可能是因为没有把maven依赖注入项目。
拓展：可以用来做简单的页面跳转，加入jdbc可以查询数据库显示。
