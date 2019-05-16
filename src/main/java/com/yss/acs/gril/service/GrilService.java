package com.yss.acs.gril.service;

import com.yss.acs.gril.GirlRepository;
import com.yss.acs.gril.Gril;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 */
@Service
public class GrilService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Gril gril1 =new Gril();
        gril1.setCupSize("A");
        gril1.setAge(18);
        girlRepository.save(gril1);

        Gril gril2 =new Gril();
        gril2.setCupSize("Aaa");
        gril2.setAge(18);
        girlRepository.save(gril2);


    }
}
