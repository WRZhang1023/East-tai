package ind.depu.tai.configuration;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import freemarker.template.TemplateException;

@Configuration
public class FreemarkerConf {

	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("********viewResolver******");
		
		FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
		resolver.setPrefix("");
		resolver.setSuffix(".ftl");
		resolver.setCache(true);
		resolver.setContentType("text/html;charset=UTF-8");
		return resolver;
	}

	@Bean
	public FreeMarkerConfigurer freemakerConfiguration() throws IOException, TemplateException {
		System.out.println("********freemakerConfiguration******");
		FreeMarkerConfigurationFactory factory = new FreeMarkerConfigurationFactory();
		factory.setTemplateLoaderPaths("classpath:templates","src/main/resource/templates");
		factory.setDefaultEncoding("utf-8");
		FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
		configurer.setConfiguration(factory.createConfiguration());
		return configurer;
	}
}
