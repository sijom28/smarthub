package javapoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BootController {
	
	@RequestMapping("/hello")
	
	public String hello(){
		return "Hello !! You have now reached inside Boot Controller !! Yayy !!";
	}

}
