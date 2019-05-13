package com.yss.acs.gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/{id}/valuation",method = RequestMethod.GET)
    public String revId(@PathVariable("id") int id){
        return "id："+id;
    }

    @RequestMapping(value = "/valu",method = RequestMethod.GET)
    public String revchId(@RequestParam(value = "id",required = false,defaultValue = "0") int id){
//        required是否必输 ，defaultValue不能为int
        return "id："+id;
    }
    @GetMapping(value = "/valua")
//    GetMappingh和GetMapping一样，是简化版
    public String revcherId(@RequestParam(value = "id",required = false,defaultValue = "0") int id){
//        required是否必输 ，defaultValue不能为int
        return "id："+id;
    }
}

