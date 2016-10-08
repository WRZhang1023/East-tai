package ind.depu.tai.selfSetting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 
 * @author weirong.zhang
 */
@Configuration
@PropertySource(value = { "classpath:custom.properties" })
public class CustomProperties2 {

	/**
	 * 第二种 将配置文件放入到环境变量中，通过环境变量进行获取 evn.getproperties("app.name")
	 * 必须使用下面这段代码，否则不能将配置文件properties放入到环境变量中
	 * 
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
