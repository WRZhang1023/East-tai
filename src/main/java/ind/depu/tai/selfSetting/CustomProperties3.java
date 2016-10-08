package ind.depu.tai.selfSetting;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @author weirong.zhang
 */
// @Component 使用了@EnableConfigurationProperties({CustomProperties3.class})实例化
@ConfigurationProperties(prefix = "myconf", locations = "classpath:custom.properties")
public class CustomProperties3 {

	private String name;
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
