humantask-userinfo
==================

To use, make sure both the DemoUserInfo.class and user.properties are on the classpath of the jbpm-human-task.war (drop them in the classes directory), and modify the web.xml to include:

```xml
<init-param>
    <param-name>user.info.class</param-name>
    <param-value>org.opusdavei.DemoUserInfo</param-value>
</init-param>
```


