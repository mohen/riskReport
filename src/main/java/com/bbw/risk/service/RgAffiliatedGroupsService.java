package com.bbw.risk.service;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.service.NameEntityService;

import com.bbw.risk.bean.RgAffiliatedGroups;

@IocBean(fields = { "dao" })
public class  RgAffiliatedGroupsService extends NameEntityService< RgAffiliatedGroups> {
	private static final Log log = Logs.get();	
}