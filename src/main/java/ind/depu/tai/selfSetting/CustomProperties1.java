package ind.depu.tai.selfSetting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:custom.properties" })
public class CustomProperties1 {

	
	// ==============第一种============
	@Value("${myconf.name}")
	private String name;
	@Value("${myconf.addr}")
	private String addr;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	
}
