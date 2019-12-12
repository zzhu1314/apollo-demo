package com.cigit.controller;

import com.cigit.bean.DevConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/11  17:03
 * EnableApolloConfig命名空间默认为application,
 *命名空间需加完整才能读取到命名空间的值
 **/
@EnableApolloConfig({"testconfig","application"})
@RestController
public class ApolloController {

    @Value("${qqq}")
    private String value ;
    @Value("${qwqwq}")
    private String value2;

    @Autowired
    private DevConfig devConfig;
    @RequestMapping("/value")
    public String getValue(){
        return value+","+value2+":bean:"+devConfig.getMobile();
    }
}
