package com.devjitsu.chatting.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
@Controller
@RequiredArgsConstructor
public class MainContrller {
	
	@GetMapping("/")
    public String main(){
        return "index";
    }
	
}
