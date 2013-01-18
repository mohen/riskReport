var ioc = {
    riskrpDs: {
        type: "com.mchange.v2.c3p0.ComboPooledDataSource",
        fields: {
			driverClass: 'oracle.jdbc.driver.OracleDriver',
			jdbcUrl: 'jdbc:oracle:thin:@10.1.101.1:1521:CMIS',
            user: 'riskrp',
            password: 'riskrp'
        }
    },
	cmisDs: {
        type: "com.mchange.v2.c3p0.ComboPooledDataSource",
        fields: {
			driverClass: 'oracle.jdbc.driver.OracleDriver',
			jdbcUrl: 'jdbc:oracle:thin:@10.1.101.1:1521:CMIS',
            user: 'cmis',
            password: 'cmis'
        }
    },
	dao : {
		type : 'org.nutz.dao.impl.NutDao',
		args : [{refer:'riskrpDs'}]		
	},
	cdao : {
		type : 'org.nutz.dao.impl.NutDao',
		args : [{refer:'cmisDs'},{refer:'cmisSql'}]		
	},
	cmisSql: {
        type: "org.nutz.dao.impl.FileSqlManager",
        args:["com/bbw/risk/ioc/sql/cmis.sql"]
    }
};