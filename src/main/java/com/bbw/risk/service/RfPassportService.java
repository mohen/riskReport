package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.RfPassport;

@IocBean(fields = { "dao" })
public class  RfPassportService extends NameEntityService< RfPassport> {
	private static final Log log = Logs.get();	
}