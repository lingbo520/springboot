package com.yss.acs.gril;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 */
@Entity
//与数据库对应的注解
public class Gril {

    @Id
    @GeneratedValue
    //自增
    private  int id;
    private String cupSize;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gril() {
        //无参构造是必须的
    }
}
