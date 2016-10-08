package ind.depu.tai.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	
	//#注意mapping中的value
	@RequestMapping(value = {"/","/login"})
	public String loginGet(){
		return "login";
	}
	
	//#返回String
	@RequestMapping("/login1")
	public String login1Get(){
		System.out.println("************** login1 ********");
		return "login";
		
	}
	@RequestMapping("/login2")
	public ModelAndView login2Get(){
		System.out.println("************** login2 ********");
		return new ModelAndView("login");
	}

	
	@RequestMapping("/login3")
	@ResponseBody //＃加上ResponseBody 会将字符串写入到页面输出流中
	public String login3Get(){
		System.out.println("************** login3 ********");
		return "hello";
	}
}
