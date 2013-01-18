package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.RfCorporation;

@IocBean(fields = { "dao" })
public class  RfCorporationService extends NameEntityService< RfCorporation> {
	private static final Log log = Logs.get();	
}