package com.devopslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cache")
public class CacheRestController {

    //@Autowired
    //private RedisTemplate<String, String> redisTemplate;


    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getCacheInfo(){

        //redisTemplate.getClientList();

        return "ok";
    }


}
