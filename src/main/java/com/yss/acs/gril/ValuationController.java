package com.yss.acs.gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 * RestController注解 = Controller+ResponseBody注解
 */
@Controller
@ResponseBody
public class ValuationController {
    @Autowired
    private GirlProperties girl;

    @RequestMapping(value = {"/valuation","hi"},method = RequestMethod.GET)
//    指定能被多个路径映射
    public String say(){
        return "val:"+girl.getSex();

    }

    @RequestMapping(value = "/valuation/{id}",method = RequestMethod.GET)
    public String getId(@PathVariable("id") int id){
        return "id"+id;
    }
}

