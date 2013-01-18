package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 持有企业债券
*/
@Data
@Table("RM_BOND")
@PK({
	"creditId" ,
	"enterpriseCode" 
})
@Build(desc = "持有企业债券", tag = "bondDetail")
public class RmBond implements BaseBuild{
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
	 * 债券代码   
	 */
	@Column("BOND_CODE")
	@Build(column = "E", desc = "债券代码")
	private String bondCode;
	/** 
	 * 债券类型  1-企业债 2-公司债 3-短期融资券 4-中期票据 5-可分离债 6-境内其他非金额企业债券 7-境外非金融企业债券 
	 */
	@Column("BOND_TYPE")
	@Build(column = "F", desc = "债券类型",dic="DIC_BTY_TYPE")
	private String bondType;
	/** 
	 * 债券面值   
	 */
	@Column("BOND_VALUE")
	@Build(column = "G", desc = "债券面值")
	private Long bondValue;
	/** 
	 * 账面余额   
	 */
	@Column("BOOK_BALANCE")
	@Build(column = "H", desc = "账面余额")
	private Long bookBalance;
	/** 
	 * 发行日期   
	 */
	@Column("ISSUING_DATE")
	@Build(column = "I", desc = "发行日期")
	private String issuingDate;
	/** 
	 * 到期兑付日期   
	 */
	@Column("CASH_DATE")
	@Build(column = "J", desc = "到期兑付日期")
	private String cashDate;
	/** 
	 * 账户类型  1-银行账户 2-交易账户 
	 */
	@Column("ACCOUNT_TYPE")
	@Build(column = "K", desc = "账户类型",dic="DIC_ATE_TYPE")
	private String accountType;
	/** 
	 * 内部评级   
	 */
	@Column("INTERNAL_RATINGS")
	@Build(column = "L", desc = "内部评级")
	private String internalRatings;
	/** 
	 * 外部评级   
	 */
	@Column("EXTERNAL_RATINGS")
	@Build(column = "M", desc = "外部评级")
	private String externalRatings;
}
