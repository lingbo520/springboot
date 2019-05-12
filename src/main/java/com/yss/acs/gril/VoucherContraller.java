package com.yss.acs.gril;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lwm
 * @create &{YEAR}-&{MONTH}-&{DAY}-&{TIME}
 */
@Controller
public class VoucherContraller {

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String say(){
        return "index";

    }
}
