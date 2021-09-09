package com.xyq.controller;

import io.swagger.annotations.*;
import org.junit.Test;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;


@RestController
@Api(value = "test---",description = "描述说明")
public class HelloController {
    @ApiOperation("test接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "内容", dataType = "string", paramType = "query")
    })
    @GetMapping("/hello")
    public String sayHello(@ApiParam("姓名")String name) {
        System.out.println("---------------==============");
        return "hello    ===" + name;
    }
//    @Service
//    public class ScheduledService {
//
//        //秒   分   时     日   月   周几
//        //0 * * * * MON-FRI
//        //注意cron表达式的用法；
//        @Scheduled(cron = "0/10 * * * * ?")
//        public void hello(){
//
//            System.out.println("Now Time ： "+new Date().toLocaleString() +"--"+new Random(1).nextInt(100));
//        }
//    }
    @Test
    public void mm(){
        Map<String,String> stringStringMap =new HashMap<>();
        stringStringMap.put("xxx","yyy");
    }
}
