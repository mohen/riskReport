package com.bbw.risk;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;
/**
 * 系统启动类
 * @author MOHEN
 *
 */
public class AppSetup implements Setup{

	@Override
	public void init(NutConfig config) {
		// TODO Auto-generated method stub
		System.out.println("init");
		
	}

	@Override
	public void destroy(NutConfig config) {
		System.out.println("destroy");
		// TODO Auto-generated method stub
		
	}

}
