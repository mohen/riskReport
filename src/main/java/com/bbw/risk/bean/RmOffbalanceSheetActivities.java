package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 表外业务明细
*/
@Data
@Table("RM_OFFBALANCE_SHEET_ACTIVITIES")
@PK({
	"creditId" ,
	"contractnumber" 
})
@Build(desc = "表外业务明细", tag = "offbalanceDetail")
public class RmOffbalanceSheetActivities implements BaseBuild{
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
	 * 持有行机构代码   
	 */
	@Column("BANK_CODE")
	@Build(column = "C", desc = "持有行机构代码")
	private String bankCode;
	/** 
	 * 贷款业务种类  1-流动资金贷款 2-项目贷款 3-一般固定资产贷款 4-其他贷款
1-银行承兑汇票 2-信用证  3-保函  4-承诺 5-委托贷款 6-委托投资 
	 */
	@Column("BUSINESS_TYPE")
	@Build(column = "D", desc = "贷款业务种类",dic="DIC_BTE_TYPE")
	private String businessType;
	/** 
	 * 授信代码   
	 */
	@Column("CREDIT_CODE")
	@Build(column = "E", desc = "授信代码")
	private String creditCode;
	/** 
	 * 合同号   
	 */
	@Column("CONTRACTNUMBER")
	@Build(column = "F", desc = "合同号")
	private String contractnumber;
	/** 
	 * 业务号码   
	 */
	@Column("BUSINESSNUMBER")
	@Build(column = "G", desc = "业务号码")
	private String businessnumber;
	/** 
	 * 业务余额   
	 */
	@Column("BUSINESSBALANCE")
	@Build(column = "H", desc = "业务余额")
	private Long businessbalance;
	/** 
	 * 币种代码   
	 */
	@Column("CURRENCY_CODE")
	@Build(column = "I", desc = "币种代码")
	private String currencyCode;
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
	 * 保证金金额   
	 */
	@Column("MARGINAMOUNT")
	@Build(column = "L", desc = "保证金金额")
	private Long marginamount;
	/** 
	 * 产业结构调整类型  1-鼓励 2-限制 3-淘汰 
	 */
	@Column("INDUSTRY_TYPE")
	@Build(column = "M", desc = "产业结构调整类型",dic="DIC_ITE_TYPE")
	private String industryType;
	/** 
	 * 工业转型升级标识  1-是 2-否 
	 */
	@Column("INDUSTRY_TRANSFORM")
	@Build(column = "N", desc = "工业转型升级标识",dic="DIC_YES_NO")
	private String industryTransform;
	/** 
	 * 战略新兴产业类型  1 节能环保 2-新一代信息技术 3-生物医药 4-高端装备制造 5-新能源 6-新材料 7-新能源汽车 
	 */
	@Column("NEW_INDUSTRY")
	@Build(column = "O", desc = "战略新兴产业类型",dic="DIC_NIY_TYPE")
	private String newIndustry;
}
