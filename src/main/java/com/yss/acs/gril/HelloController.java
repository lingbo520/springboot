package com.yss.acs.gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 */
@RestController
@RequestMapping("/inter")
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girl;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "cupSize"+cupSize +",age:"+age+"\n\r"+content +",sex:"+girl.getSex();

    }
}
