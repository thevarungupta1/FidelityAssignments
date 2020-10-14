package SpringMvc;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(path="/home", method = RequestMethod.POST )
	public String home() {
		System.out.println("Inside home");
		return "home";
		
	}
	@RequestMapping(path="/about", method = RequestMethod.POST)
	public String about() {
	     System.out.println("about");
		return "about";
	}
		
		
	}

