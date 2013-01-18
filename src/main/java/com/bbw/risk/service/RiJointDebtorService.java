package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.RiJointDebtor;

@IocBean(fields = { "dao" })
public class  RiJointDebtorService extends NameEntityService< RiJointDebtor> {
	private static final Log log = Logs.get();	
}