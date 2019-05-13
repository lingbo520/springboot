package com.yss.acs.gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/valuation",method = RequestMethod.GET)
    public String say(){
        return "val:"+girl.getSex();

    }
}
