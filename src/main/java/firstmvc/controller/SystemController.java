package firstmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemController {
	@RequestMapping("hello")
	public String tet() {
		System.out.println("Hello World");
		return "hello.jsp";
	}

}
