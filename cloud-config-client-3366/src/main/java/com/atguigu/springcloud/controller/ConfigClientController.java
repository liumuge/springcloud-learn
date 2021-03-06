package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/11
 * @time: 19:22
 * @description:
 */
@RestController
@RefreshScope
public class ConfigClientController {

	@Value("${server.port}")
	private String serverPort;

	@Value("${config.info}")
	private String configInfo;


	@GetMapping("/configInfo")
	public String getConfigInfo(){
		return "serverPort:"+serverPort+"\t\n\n configInfo: "+configInfo;
	}


}

