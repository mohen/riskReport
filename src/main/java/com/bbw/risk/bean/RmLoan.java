package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 贷款明细
*/
@Data
@Table("RM_LOAN")
@PK({
	"creditId" ,
	"evidenceofdebt" 
})
@Build(desc = "贷款明细", tag = "loanDetail")
public class RmLoan implements BaseBuild{
	@Column("CREDIT_ID")
	private Long creditId;
	/** 
	 * 客户名称   
	 */
	@Column("CUSTOMER_NAME")
	@Build(column = "A", desc = "客户名称")
	private String customerName;
	/** 
	 * 客户代码   
	 */
	@Column("CUSTOMER_CODE")
	@Build(column = "B", desc = "客户代码")
	private String customerCode;
	/** 
	 * 贷款发放行代码   
	 */
	@Column("LOAN_BANK_CODE")
	@Build(column = "C", desc = "贷款发放行代码")
	private String loanBankCode;
	/** 
	 * 授信代码   
	 */
	@Column("CREDIT_CODE")
	@Build(column = "D", desc = "授信代码")
	private String creditCode;
	/** 
	 * 贷款合同号   
	 */
	@Column("LOAN_CONTRACT_NUMBER")
	@Build(column = "E", desc = "贷款合同号")
	private String loanContractNumber;
	/** 
	 * 借据号   
	 */
	@Column("EVIDENCEOFDEBT")
	@Build(column = "F", desc = "借据号")
	private String evidenceofdebt;
	/** 
	 * 授信起始日期   
	 */
	@Column("START_DATE")
	@Build(column = "G", desc = "授信起始日期")
	private String startDate;
	/** 
	 * 授信到期日期   
	 */
	@Column("DUE_DATE")
	@Build(column = "H", desc = "授信到期日期")
	private String dueDate;
	/** 
	 * 发放金额   
	 */
	@Column("ISSUE_MONEY")
	@Build(column = "I", desc = "发放金额")
	private Long issueMoney;
	/** 
	 * 贷款余额   
	 */
	@Column("LOAN_BALANCE")
	@Build(column = "J", desc = "贷款余额")
	private Long loanBalance;
	/** 
	 * 五级分类   
	 */
	@Column("FIVE_CLASSIFY")
	@Build(column = "K", desc = "五级分类",dic="1-正常 2-关注 3-次级 4-可疑 5-损失")
	private String fiveClassify;
	/** 
	 * 贷款类型   
	 */
	@Column("LOAN_TYPE")
	@Build(column = "L", desc = "贷款类型",dic="1-贷款 2-贴现 3-贸易融资 4-垫款 5-法人账号透支 6-其他")
	private String loanType;
	/** 
	 * 贷款业务种类  1-流动资金贷款 2-项目贷款 3-一般固定资产贷款 4-其他贷款
1-银行承兑汇票 2-信用证  3-保函  4-承诺 5-委托贷款 6-委托投资 
	 */
	@Column("BUSINESS_TYPE")
	@Build(column = "M", desc = "贷款业务种类",dic="DIC_BTP_TYPE")
	private String businessType;
	/** 
	 * 投向行业   
	 */
	@Column("VOCATION_CODE")
	@Build(column = "N", desc = "投向行业")
	private String vocationCode;
	/** 
	 * 币种代码   
	 */
	@Column("CURRENCY_CODE")
	@Build(column = "O", desc = "币种代码")
	private String currencyCode;
	/** 
	 * 担保方式  1-保证 2-抵押 3-质押 4-信用 
	 */
	@Column("GUARANTEE_TYPE")
	@Build(column = "P", desc = "担保方式",dic="DIC_GWY_TYPE")
	private String guaranteeType;
	/** 
	 * 欠本余额   
	 */
	@Column("PRINCIPAL_BALANCE")
	@Build(column = "Q", desc = "欠本余额")
	private Long principalBalance;
	/** 
	 * 欠本天数   
	 */
	@Column("PRINCIPAL_DAYS")
	@Build(column = "R", desc = "欠本天数")
	private Long principalDays;
	/** 
	 * 欠息余额   
	 */
	@Column("ACCRUAL_BALANCE")
	@Build(column = "S", desc = "欠息余额")
	private Long accrualBalance;
	/** 
	 * 欠息天数   
	 */
	@Column("ACCRUAL_DAYS")
	@Build(column = "T", desc = "欠息天数")
	private Long accrualDays;
	/** 
	 * 本期还款   
	 */
	@Column("REPAYMENT")
	@Build(column = "U", desc = "本期还款")
	private Long repayment;
	/** 
	 * 还本方式  1-按月 2-按季 3-按半年 4-按年 5-到期一次还本 6-按进度还款 7-其他 
	 */
	@Column("PRINCIPAL_REPAYMENT_TYPE")
	@Build(column = "V", desc = "还本方式",dic="DIC_PRT_TYPE")
	private String principalRepaymentType;
	/** 
	 * 还息方式  1-按月 2-按季 3-按半年 4-按年 5-到期一次还本 6-按进度还款 7-其他 
	 */
	@Column("ACCRUAL_REPAYMENT_TYPE")
	@Build(column = "W", desc = "还息方式",dic="DIC_PRT_TYPE")
	private String accrualRepaymentType;
	/** 
	 * 下期还本日期   
	 */
	@Column("NEXT_PRINCIPAL_REPAYMENT_DATE")
	@Build(column = "X", desc = "下期还本日期")
	private String nextPrincipalRepaymentDate;
	/** 
	 * 下期还本金额   
	 */
	@Column("NEXT_PRINCIPAL_REPAYMENT_MONEY")
	@Build(column = "Y", desc = "下期还本金额")
	private Long nextPrincipalRepaymentMoney;
	/** 
	 * 下期还息日期   
	 */
	@Column("NEXT_ACCRUAL_REPAYMENT_DATE")
	@Build(column = "Z", desc = "下期还息日期")
	private String nextAccrualRepaymentDate;
	/** 
	 * 下期还息金额   
	 */
	@Column("NEXT_ACCRUAL_REPAYMENT_MONEY")
	@Build(column = "AA", desc = "下期还息金额")
	private Long nextAccrualRepaymentMoney;
	/** 
	 * 贷款方法类型  1-新增 2-展期 3-借新还旧 4-重组 
	 */
	@Column("LOAN_ISSUE_TYPE")
	@Build(column = "AB", desc = "贷款方法类型",dic="DIC_LLT_TYPE")
	private String loanIssueType;
	/** 
	 * 减值准备   
	 */
	@Column("DEPRECIATIONRESERVES")
	@Build(column = "AC", desc = "减值准备")
	private Long depreciationreserves;
	/** 
	 * 产业结构调整类型  1-鼓励 2-限制 3-淘汰 
	 */
	@Column("INDUSTRY_TYPE")
	@Build(column = "AD", desc = "产业结构调整类型",dic="DIC_ITE_TYPE")
	private String industryType;
	/** 
	 * 工业转型升级标识  1-是 2-否 
	 */
	@Column("INDUSTRY_TRANSFORM")
	@Build(column = "AE", desc = "工业转型升级标识",dic="DIC_YES_NO")
	private String industryTransform;
	/** 
	 * 战略新兴产业类型  1 节能环保 2-新一代信息技术 3-生物医药 4-高端装备制造 5-新能源 6-新材料 7-新能源汽车 
	 */
	@Column("NEW_INDUSTRY")
	@Build(column = "AF", desc = "战略新兴产业类型",dic="DIC_NIY_TYPE")
	private String newIndustry;
	/** 
	 * 银团贷款标识  1-牵头行 2-参与行 
	 */
	@Column("SYNDICATION")
	@Build(column = "AG", desc = "银团贷款标识",dic="DIC_YES_NO")
	private String syndication;
	/** 
	 * 支付方式  1-受托支付 2-自主支付 
	 */
	@Column("PAYMENT_METHOD")
	@Build(column = "AH", desc = "支付方式",dic="DIC_PMD_TYPE")
	private String paymentMethod;
}
