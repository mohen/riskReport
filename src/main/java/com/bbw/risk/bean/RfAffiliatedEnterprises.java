package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 重要股东及重要关联企业
*/
@Data
@Table("RF_AFFILIATED_ENTERPRISES")
@PK({
	"corporationId" ,
	"customerCode" 
})
@Build(desc = "重要股东及重要关联企业", tag = "enterpriseDetail")
public class RfAffiliatedEnterprises implements BaseBuild{
	@Column("CORPORATION_ID")
	private Long corporationId;
	/** 
	 * 关联类型   
	 */
	@Column("AFFILIATED_TYPE")
	@Build(column = "A", desc = "关联类型",dic="DIC_MEB_TYPE")
	private String affiliatedType;
	/** 
	 * 银行持有债企业名称   
	 */
	@Column("ENTERPRISE_NAME")
	@Build(column = "B", desc = "银行持有债企业名称")
	private String enterpriseName;
	/** 
	 * 企业类型   
	 */
	@Column("ENTERPRISE_TYPE")
	@Build(column = "C", desc = "企业类型",dic="DIC_CTE_TYPE")
	private String enterpriseType;
	/** 
	 * 证件类型  1-组织机构代码 2-居民身份证
3-军官证 4-文职干部证 5-警官证 6-士兵证 7-户口本 8-临时身份证 9-其他有效通行旅行证件  10-护照 11-学生证 12-无证件 
	 */
	@Column("PAPER_TYPE")
	@Build(column = "D", desc = "证件类型",dic="DIC_CRE_TYPE")
	private String paperType;
	/** 
	 * 证件号码   
	 */
	@Column("PAPER_CODE")
	@Build(column = "E", desc = "证件号码")
	private String paperCode;
	/** 
	 * 登记注册代码   
	 */
	@Column("REGISTER_CODE")
	@Build(column = "F", desc = "登记注册代码")
	private String registerCode;
	/** 
	 * 客户代码   
	 */
	@Column("CUSTOMER_CODE")
	@Build(column = "G", desc = "客户代码")
	private String customerCode;
	/** 
	 * 客户国籍代码   
	 */
	@Column("NATIONALITY_CODE")
	@Build(column = "H", desc = "客户国籍代码")
	private String nationalityCode;
	/** 
	 * 持股比例   
	 */
	@Column("SHAREHOLDING_RATIO")
	@Build(column = "I", desc = "持股比例")
	private Long shareholdingRatio;
	/** 
	 * 股东结构对应日期   
	 */
	@Column("STOCKHOLDER_DATE")
	@Build(column = "J", desc = "股东结构对应日期")
	private String stockholderDate;
	/** 
	 * 更新信息日期   
	 */
	@Column("UPDATE_DATE")
	@Build(column = "K", desc = "更新信息日期")
	private String updateDate;
	/** 
	 * 实际控制人标识  1-是 2否 
	 */
	@Column("ACTUAL_CONTROLLER")
	@Build(column = "L", desc = "实际控制人标识",dic="DIC_YES_NO")
	private String actualController;
}
