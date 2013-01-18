package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 持有企业股权明细
*/
@Data
@Table("RM_EQUITYSTAKE")
@PK({
	"creditId" ,
	"enterpriseCode" 
})
@Build(desc = "持有企业股权明细", tag = "equitystakeDetail")
public class RmEquitystake implements BaseBuild{
	@Column("CREDIT_ID")
	private Long creditId;
	/** 
	 * 银行持有债企业名称   
	 */
	@Column("ENTERPRISE_NAME")
	@Build(column = "A", desc = "银行持有债企业名称")
	private String enterpriseName;
	/** 
	 * 银行持有债企业代码   
	 */
	@Column("ENTERPRISE_CODE")
	@Build(column = "B", desc = "银行持有债企业代码")
	private String enterpriseCode;
	/** 
	 * 持有行机构代码   
	 */
	@Column("BANK_CODE")
	@Build(column = "C", desc = "持有行机构代码")
	private String bankCode;
	/** 
	 * 授信代码   
	 */
	@Column("CREDIT_CODE")
	@Build(column = "D", desc = "授信代码")
	private String creditCode;
	/** 
	 * 账面余额   
	 */
	@Column("BOOK_BALANCE")
	@Build(column = "E", desc = "账面余额")
	private Long bookBalance;
}
