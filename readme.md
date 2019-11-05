简单的springboot自动配置模块实现

调用方在application.properties中配置:
custom.author.enabled=true
custom.authors=dageya

即可实现调用.

关键类:
AuthorAutoConfiguration 生成暴露服务Bean
AuthorProperties 读取配置文件
AuthorServer 对外暴露服务类,调用放可通过@Autowire 或 @Resource注入
spring.factories 

参考:https://www.jianshu.com/p/3fcce1821aee