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
* 单一法人基本情况
*/
@Data
@Table("RF_CORPORATION")
@Build(desc = "单一法人基本情况", tag = "corporation",number="03")
public class RfCorporation implements BaseBuild{
	@Column("CORPORATION_ID")
	@Prev({
		@SQL(db = DB.ORACLE,value="SELECT SEQ_COMMOM_NEXT.NEXTVAL FROM DUAL")
	})
	private Long corporationId;
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
	 * 组织机构代码   
	 */
	@Column("ORGANIZATION_CODE")
	@Build(column = "C", desc = "组织机构代码")
	private String organizationCode;
	/** 
	 * 登记更新日期   
	 */
	@Column("ORGANIZATION_UPDATE_DATE")
	@Build(column = "D", desc = "登记更新日期")
	private String organizationUpdateDate;
	/** 
	 * 登记注册代码   
	 */
	@Column("REGISTER_CODE")
	@Build(column = "E", desc = "登记注册代码")
	private String registerCode;
	/** 
	 * 更新注册信息日期   
	 */
	@Column("REGISTER_UPDATE_DATE")
	@Build(column = "F", desc = "更新注册信息日期")
	private String registerUpdateDate;
	/** 
	 * 注册国家或地区   
	 */
	@Column("REGISTER_NATION")
	@Build(column = "G", desc = "注册国家或地区")
	private String registerNation;
	/** 
	 * 客户国籍代码   
	 */
	@Column("NATIONALITY_CODE")
	@Build(column = "H", desc = "客户国籍代码")
	private String nationalityCode;
	/** 
	 * 国内注册地址   
	 */
	@Column("REGISTER_ADDRESS")
	@Build(column = "I", desc = "国内注册地址")
	private String registerAddress;
	/** 
	 * 行政区划分代码   
	 */
	@Column("ADMINISTRATIVE_CODE")
	@Build(column = "J", desc = "行政区划分代码")
	private String administrativeCode;
	/** 
	 * 上市公司标识  A:A股市市场上市;B:B股市市场上市,C:H股香港上市,D:F股海外上市 
	 */
	@Column("LISTED_COMPANY")
	@Build(column = "K", desc = "上市公司标识",dic="DIC_CPY_TYPE")
	private String listedCompany;
	/** 
	 * 风险预警信号   
	 */
	@Column("WARNING_SIGNAL")
	@Build(column = "L", desc = "风险预警信号")
	private String warningSignal;
	/** 
	 * 关注事件   
	 */
	@Column("ATTENTION_EVENT")
	@Build(column = "M", desc = "关注事件")
	private String attentionEvent;
	/** 
	 * 违约概率   
	 */
	@Column("DEFAULT_PROBABILITY")
	@Build(column = "N", desc = "违约概率")
	private Long defaultProbability;
	/** 
	 * 信用评级结果   
	 */
	@Column("CREDIT_RATING")
	@Build(column = "O", desc = "信用评级结果")
	private String creditRating;
	/** 
	 * 资产总额   
	 */
	@Column("GENERAL_ASSETS")
	@Build(column = "P", desc = "资产总额")
	private Long generalAssets;
	/** 
	 * 负债总额   
	 */
	@Column("TOTAL_LIABILITIES")
	@Build(column = "Q", desc = "负债总额")
	private Long totalLiabilities;
	/** 
	 * 税前利润   
	 */
	@Column("PRETAX_PROFIT")
	@Build(column = "R", desc = "税前利润")
	private Long pretaxProfit;
	/** 
	 * 主营业务收入   
	 */
	@Column("BUSINESS_INCOME")
	@Build(column = "S", desc = "主营业务收入")
	private Long businessIncome;
	/** 
	 * 存货   
	 */
	@Column("INVENTORY")
	@Build(column = "T", desc = "存货")
	private Long inventory;
	/** 
	 * 应收账款   
	 */
	@Column("ACCOUNTS_RECEIVABLE")
	@Build(column = "U", desc = "应收账款")
	private Long accountsReceivable;
	/** 
	 * 其他应收   
	 */
	@Column("OTHER_ACCOUNTS_RECEIVABLE")
	@Build(column = "V", desc = "其他应收")
	private Long otherAccountsReceivable;
	/** 
	 * 流动资产合计   
	 */
	@Column("TOTAL_CURRENT_ASSETS")
	@Build(column = "W", desc = "流动资产合计")
	private Long totalCurrentAssets;
	/** 
	 * 流动负债合计   
	 */
	@Column("TOTAL_CURRENT_LIABILITIES")
	@Build(column = "X", desc = "流动负债合计")
	private Long totalCurrentLiabilities;
	/** 
	 * 财务报表类型  1:年报,2:半年报,3:季报,4:月报 
	 */
	@Column("FINANCIAL_STATEMENT_TYPE")
	@Build(column = "Y", desc = "财务报表类型",dic="DIC_FNC_TYPE")
	private String financialStatementType;
	/** 
	 * 财务报表日期   
	 */
	@Column("FINANCIAL_STATEMENT_DATE")
	@Build(column = "Z", desc = "财务报表日期")
	private String financialStatementDate;
	/** 
	 * 客户类型  1-集团客户 2-单一法人客户 3-同业客户 
	 */
	@Column("CUSTOMER_TYPE")
	@Build(column = "AA", desc = "客户类型",dic="DIC_CTE_TYPE")
	private String customerType;
	/** 
	 * 客户所属行业代码   
	 */
	@Column("INDUSTRY_CODE")
	@Build(column = "AB", desc = "客户所属行业代码")
	private String industryCode;
	/** 
	 * 贷款卡号   
	 */
	@Column("LOAN_CARD_NUMBER")
	@Build(column = "AC", desc = "贷款卡号")
	private String loanCardNumber;
	/** 
	 * 环境和社会风险分类   
	 */
	@Column("ENVIRONMENTAI_AND_SOCIAI_RISK")
	@Build(column = "AD", desc = "环境和社会风险分类")
	private String environmentaiAndSociaiRisk;
	@Column("YEAR")
	private String year;
	@Column("MONTH")
	private String month;
	/**
	*法定代表人高管及重要管理人信息
	*/
	@Many(target = RfExecutives.class, field = "corporationId")
	@Build(desc = "法定代表人高管及重要管理人信息", tag = "executives")
	private List<RfExecutives> rfExecutivess = new ArrayList<RfExecutives>();
	/**
	*重要股东及重要关联企业
	*/
	@Many(target = RfAffiliatedEnterprises.class, field = "corporationId")
	@Build(desc = "重要股东及重要关联企业", tag = "affiliatedEnterprises")
	private List<RfAffiliatedEnterprises> rfAffiliatedEnterprisess = new ArrayList<RfAffiliatedEnterprises>();
}
