package com.lh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Description: springboot引导类
 * @author LuoH
 * @date 2020/01/16
 */
//声明该类是一个SpringBoot引导类
//@SpringBootApplication注解包含了springboot的配置@SpringBootConfiguration
@SpringBootApplication
public class MySpringBootApplication {
    //mian是java程序的入口 main写到哪都行，关键是加了@SpringBootApplication的引导类在那，run 的参数就写哪个的class
    public static void main(String[] args) {
        //run方法 表示运行SpringBoot的引导类 run参数就是springboot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }

    /*
    //使用java配置的方式（基于全注解）将数据源放到spring容器中
    @Bean
    public DataSource getDataSource(){
    }
     */

    /*
    @SpringBootApplication中的@ComponentScan约定
    当前的引导类所在的包及其子包的bean都会被扫描
     */

    /*
    @SpringBootApplication中的@EnableAutoConfiguration是否可自动配置的开关
    @EnableAutoConfiguration中@Import引入其他配置类
    @Import(AutoConfigurationImportSelector.class)
    AutoConfigurationImportSelector中的getCandidateConfigurations下SpringFactoriesLoader
    ServletWebServerFactoryAutoConfiguration-ServerProperties
     */

}
