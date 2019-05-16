package com.yss.acs.gril;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 */
public interface GirlRepository extends JpaRepository<Gril,Integer> {
    // 继承JpaRepository，，并且参数为数据库要操作的类，主键类型


    //扩展查询方法
    public List<Gril> findbyAge(Integer age);
}
