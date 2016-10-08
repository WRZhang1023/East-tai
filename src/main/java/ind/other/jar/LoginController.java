package ind.other.jar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("anotherLoginController") //named this controller ,otherwise it will conflict with other class having the same name
public class LoginController {
	
	@RequestMapping("/otherlogin")
	public void loginGet(){
		System.out.println(111);
	}

}
