package com.yss.acs.gril;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
