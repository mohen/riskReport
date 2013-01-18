package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.RfExecutives;

@IocBean(fields = { "dao" })
public class  RfExecutivesService extends NameEntityService< RfExecutives> {
	private static final Log log = Logs.get();	
}