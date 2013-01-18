package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.SsResource;

@IocBean(fields = { "dao" })
public class  SsResourceService extends NameEntityService< SsResource> {
	private static final Log log = Logs.get();	
}