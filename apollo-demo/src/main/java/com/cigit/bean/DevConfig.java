package com.cigit.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/11  17:19
 **/
@ConfigurationProperties(prefix = "dev")
@Component
@Getter
@Setter
public class DevConfig {
    private String mobile;
}
