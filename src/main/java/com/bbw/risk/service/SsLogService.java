package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.SsLog;

@IocBean(fields = { "dao" })
public class  SsLogService extends NameEntityService< SsLog> {
	private static final Log log = Logs.get();	
}