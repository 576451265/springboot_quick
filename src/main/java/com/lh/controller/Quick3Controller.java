package com.lh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 获取配置文件信息 法二
 * @author LuoH
 * @date 2020/01/16
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {
    /*
    加了@ConfigurationProperties后报执行器问题
    可以在maven中加
    <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-configuration-processor</artifactId>
	<optional>true</optional>
    </dependency>
     */

    private String name;
    private String addr;
    private Integer age;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick2() {
        //获取配置文件信息
        return "name: " + name + " addr: " + addr + " age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
