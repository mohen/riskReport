package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.SsIndex;

@IocBean(fields = { "dao" })
public class  SsIndexService extends NameEntityService< SsIndex> {
	private static final Log log = Logs.get();	
}