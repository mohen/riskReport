package com.bbw.risk;

import org.junit.After;
import org.junit.Before;
import org.nutz.dao.Dao;
import org.nutz.ioc.Ioc;

public abstract class DaoCase {

    protected Dao dao;
    protected Dao cdao;
    protected Ioc ioc;
    @Before
    public void setUp() {
    	System.err.println(1);
        ioc = Nutzs.getIoc("dao.js");
        dao = ioc.get(Dao.class, "dao");
        cdao = ioc.get(Dao.class, "cdao");

        before();
    }

    @After
    public void tearDown() {
        after();
    }

    protected void before() {}

    protected void after() {}

}
