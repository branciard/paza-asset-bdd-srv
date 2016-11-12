package com.branciard.paza.pazaassetbddsrv.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.branciard.paza.pazaassetbddsrv")
public class FeignConfiguration {

}
