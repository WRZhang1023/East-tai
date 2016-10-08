package ind.depu.tai.controller.login;

import ind.depu.tai.selfSetting.CustomProperties1;
import ind.depu.tai.selfSetting.CustomProperties3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({CustomProperties3.class})  
public class PropertiesController {

	// ==============第一种============
	@Autowired
	CustomProperties1 CustomProperties;

	@Value("${myconf.name}")
	private String name;

	@RequestMapping("/properties1")
	public String getProperties1() {

		System.out.println(CustomProperties.getAddr());
		System.out.println(name);
		return name + CustomProperties.getAddr();
	}

	// ==============第二种============

	@Autowired
	Environment env;

	@RequestMapping("/properties2")
	public String getProperties2() {

		System.out.println(env.getProperty("name"));
		// 注意取变量的健
		System.out.println(env.getProperty("myconf.name"));
		return env.getProperty("name");
	}

	// ==============第二种============
	@Autowired
	CustomProperties3 CustomProperties3;

	
	
	@RequestMapping("/properties3")
	public String getProperties3() {
		return CustomProperties3.getAddr();
	}
}
