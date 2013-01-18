package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.DB;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.SQL;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 对公/同业客户授信和表内外业务统计
*/
@Data
@Table("RM_CREDIT")
@Build(desc = "对公/同业客户授信和表内外业务统计", tag = "credit",number="01")
public class RmCredit implements BaseBuild{
	@Column("CREDIT_ID")
	@Prev({
		@SQL(db = DB.ORACLE,value="SELECT SEQ_COMMOM_NEXT.NEXTVAL FROM DUAL")
	})
	private Long creditId;
	/** 
	 * 客户类型  1-集团客户 2-单一法人客户 3-同业客户 
	 */
	@Column("CUSTOMER_TYPE")
	@Build(column = "A", desc = "客户类型",dic="DIC_CUS_TYPE")
	private String customerType;
	/** 
	 * 客户名称   
	 */
	@Column("CUSTOMER_NAME")
	@Build(column = "B", desc = "客户名称")
	private String customerName;
	/** 
	 * 客户代码   
	 */
	@Column("CUSTOMER_CODE")
	@Build(column = "C", desc = "客户代码")
	private String customerCode;
	/** 
	 * 客户国籍代码   
	 */
	@Column("NATIONALITY_CODE")
	@Build(column = "D", desc = "客户国籍代码")
	private String nationalityCode;
	/** 
	 * 授信银行代码   
	 */
	@Column("CREDITBANK_CODE")
	@Build(column = "E", desc = "授信银行代码")
	private String creditbankCode;
	/** 
	 * 授信银行名称   
	 */
	@Column("CREDITBANK_NAME")
	@Build(column = "F", desc = "授信银行名称")
	private String creditbankName;
	/** 
	 * 授信代码   
	 */
	@Column("CREDIT_CODE")
	@Build(column = "G", desc = "授信代码")
	private String creditCode;
	/** 
	 * 授信额度   
	 */
	@Column("CREDIT_LIMIT")
	@Build(column = "H", desc = "授信额度")
	private Long creditLimit;
	/** 
	 * 贷款授信额度   
	 */
	@Column("LOAN_LIMIT")
	@Build(column = "I", desc = "贷款授信额度")
	private Long loanLimit;
	/** 
	 * 授信起始日期   
	 */
	@Column("START_DATE")
	@Build(column = "J", desc = "授信起始日期")
	private String startDate;
	/** 
	 * 授信到期日期   
	 */
	@Column("DUE_DATE")
	@Build(column = "K", desc = "授信到期日期")
	private String dueDate;
	/** 
	 * 贷款余额   
	 */
	@Column("LOAN_BALANCE")
	@Build(column = "L", desc = "贷款余额")
	private Long loanBalance;
	/** 
	 * 持有债券余额   
	 */
	@Column("BOND_BALANCE")
	@Build(column = "M", desc = "持有债券余额")
	private Long bondBalance;
	/** 
	 * 持有股权余额   
	 */
	@Column("EQUITYSTAKE_BALANCE")
	@Build(column = "N", desc = "持有股权余额")
	private Long equitystakeBalance;
	/** 
	 * 表内信用风险资产余额   
	 */
	@Column("OTHER_ONBALANCE_SHEET")
	@Build(column = "O", desc = "表内信用风险资产余额")
	private Long otherOnbalanceSheet;
	/** 
	 * 表外业务余额   
	 */
	@Column("OFLBALANCE_SHEET")
	@Build(column = "P", desc = "表外业务余额")
	private Long oflbalanceSheet;
	/** 
	 * 现有业务余额占授信额度   
	 */
	@Column("BALANCE_OF_LIMIT")
	@Build(column = "Q", desc = "现有业务余额占授信额度")
	private Long balanceOfLimit;
	/** 
	 * 贷款余额占用贷款授信额度   
	 */
	@Column("BALANCE_OFF_LOAN_LIMIT")
	@Build(column = "R", desc = "贷款余额占用贷款授信额度")
	private Long balanceOffLoanLimit;
	/** 
	 * 尚未使用授信额度   
	 */
	@Column("USABLE_CREDIT_LIMIT")
	@Build(column = "S", desc = "尚未使用授信额度")
	private Long usableCreditLimit;
	/** 
	 * 尚可使用贷款授信额度   
	 */
	@Column("USABLE_LOAN_LIMIT")
	@Build(column = "T", desc = "尚可使用贷款授信额度")
	private Long usableLoanLimit;
	/** 
	 * 关联方授信标识  1-是 2-否 
	 */
	@Column("RELATED_PARTY_CREDIT_LOGO")
	@Build(column = "U", desc = "关联方授信标识",dic="DIC_YES_NO")
	private String relatedPartyCreditLogo;
	@Column("YEAR")
	private String year;
	@Column("MONTH")
	private String month;
	/**
	*表外业务明细
	*/
	@Many(target = RmOffbalanceSheetActivities.class, field = "creditId")
	@Build(desc = "表外业务明细", tag = "offbalanceSheetActivities")
	private List<RmOffbalanceSheetActivities> rmOffbalanceSheetActivitiess = new ArrayList<RmOffbalanceSheetActivities>();
	/**
	*贷款明细
	*/
	@Many(target = RmLoan.class, field = "creditId")
	@Build(desc = "贷款明细", tag = "loan")
	private List<RmLoan> rmLoans = new ArrayList<RmLoan>();
	/**
	*持有企业股权明细
	*/
	@Many(target = RmEquitystake.class, field = "creditId")
	@Build(desc = "持有企业股权明细", tag = "equitystake")
	private List<RmEquitystake> rmEquitystakes = new ArrayList<RmEquitystake>();
	/**
	*同业客户业务明细
	*/
	@Many(target = RmTradeCustomers.class, field = "creditId")
	@Build(desc = "同业客户业务明细", tag = "tradeCustomers")
	private List<RmTradeCustomers> rmTradeCustomerss = new ArrayList<RmTradeCustomers>();
	/**
	*持有企业债券
	*/
	@Many(target = RmBond.class, field = "creditId")
	@Build(desc = "持有企业债券", tag = "bond")
	private List<RmBond> rmBonds = new ArrayList<RmBond>();
	/**
	*集团客户成员信息
	*/
	@Many(target = RmGroupClient.class, field = "creditId")
	@Build(desc = "集团客户成员信息", tag = "groupClient")
	private List<RmGroupClient> rmGroupClients = new ArrayList<RmGroupClient>();
}
