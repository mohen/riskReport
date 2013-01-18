package com.bbw.risk.test.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;
import org.nutz.dao.Cnd;
import org.nutz.dao.Sqls;
import org.nutz.dao.entity.Record;
import org.nutz.dao.pager.Pager;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.sql.SqlCallback;

import com.bbw.risk.DaoCase;
import com.bbw.risk.bean.SsDic;

public class TestDao extends DaoCase {

	@Test
	public  void test() {
			System.out.println(	dao.count("ss_dic"));
			System.out.println(	cdao.count("s_dic"));
			Assert.assertTrue(true);

	}
	@Test
	public void tranSdic(){
		List<Record> list = cdao.query("s_dic", Cnd.where("opttype", "=", "STD_ZB_PARA_VAL_TYP"));
		for(Record record:list){
			SsDic dic =new SsDic();
			dic.setCnname(record.get("cnname").toString());
			dic.setEnname(record.get("enname").toString());
			dic.setOpttype(record.get("opttype").toString());
			dao.insert(dic);
		}
	}
	@Test
	public void tranSqlFile(){
		Sql sqls = cdao.sqls().create("sdic.data");
		sqls.setCallback(Sqls.callback.records());
		cdao.execute(sqls);
		List<Map> list = sqls.getList(Map.class);
		Assert.assertTrue(list.size()>0);
	}
	@Test
	public void testPager(){
		Sql sqls = cdao.sqls().create("cuscom.data");
		sqls.params().set("a", "周");
		Pager pager = cdao.createPager(1, 20);
		sqls.setPager(pager);
		sqls.setCallback(Sqls.callback.records());
		
		cdao.execute(sqls);
		List<Record> list = sqls.getList(Record.class);
		for(Record r:list){
			System.out.println(r.getString("cus_name"));
		}
		Assert.assertTrue(list.size()>0);
	}

}
