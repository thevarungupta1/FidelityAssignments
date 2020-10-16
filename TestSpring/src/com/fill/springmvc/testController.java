package com.fill.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class testController {
	
@RequestMapping("/msg")
public String msg() {
	System.out.println("msg call");
	return "msg";
}

}
