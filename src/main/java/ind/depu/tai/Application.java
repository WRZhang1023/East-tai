package ind.depu.tai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "ind.depu", "ind.other.jar" })
// #这样会扫描到不在该包下面的其它的 注解 像 @contorller
public class Application {

	

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

}
