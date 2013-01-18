package com.bbw.risk.mvc;

import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Localization;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.SetupBy;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

import com.bbw.risk.AppSetup;

/**
 * web 入口程序
 * 
 * @author MOHEN
 * 
 */

@IocBy(type = ComboIocProvider.class, args = {
		"*org.nutz.ioc.loader.json.JsonLoader", "ioc/",
		"*org.nutz.ioc.loader.annotation.AnnotationIocLoader", "com.bbw.risk" })
@Encoding(input = "utf8", output = "utf8")
@Modules(scanPackage = true)
@Localization("msg")
@SetupBy(AppSetup.class)
@Ok("ioc:json")
@Fail("json")
public class MainModule {
}
