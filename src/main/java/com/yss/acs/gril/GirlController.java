package com.yss.acs.gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 查询所有女生列表
     */
    @GetMapping(value = "/girls")
    public List<Gril> girlList() {

        return girlRepository.findAll();
    }

    /**
     * 新增女生列表
     */
    @PostMapping(value = "/girls")
    public Gril girlAdd(@RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age) {
        Gril gril = new Gril();
        gril.setAge(age);
        gril.setCupSize(cupSize);

        return girlRepository.save(gril);
    }

    /**
     * 查询单个此处有点问题
     */
    @GetMapping(value = "/girls/{id}")
    public Gril girlFindOne(@PathVariable("id") Integer id) {

        Gril g = girlRepository.getOne(id);
        return g;
    }

    /**
     * 更新
     */
    @PutMapping(value = "/girls/{id}")
    public Gril girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {

        Gril gril = new Gril();
        gril.setId(id);
        gril.setAge(age);
        gril.setCupSize(cupSize);
        return girlRepository.save(gril);
    }

    @DeleteMapping("/girls/{id}")
    public void grilDeleted(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
    }

}


