package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 实际控制人
*/
@Data
@Table("RG_CONTROLLER")
@PK({
	"groupClientId" ,
	"customerCode" 
})
@Build(desc = "实际控制人", tag = "controller")
public class RgController implements BaseBuild{
	@Column("GROUP_CLIENT_ID")
	private Long groupClientId;
	/** 
	 * 实际控制人类型  1-企业 2-机关 3-事业单位 4-社会团体 5-其他组织机构 6-自然人 
	 */
	@Column("CONTROLLER_TYPE")
	@Build(column = "A", desc = "实际控制人类型",dic="DIC_CTR_TYLE")
	private String controllerType;
	/** 
	 * 客户国籍代码   
	 */
	@Column("NATIONALITY_CODE")
	@Build(column = "B", desc = "客户国籍代码")
	private String nationalityCode;
	/** 
	 * 实际控制人名称   
	 */
	@Column("CONTROLLER_NAME")
	@Build(column = "C", desc = "实际控制人名称")
	private String controllerName;
	/** 
	 * 客户代码   
	 */
	@Column("CUSTOMER_CODE")
	@Build(column = "D", desc = "客户代码")
	private String customerCode;
	/** 
	 * 证件类型  1-组织机构代码 2-居民身份证
3-军官证 4-文职干部证 5-警官证 6-士兵证 7-户口本 8-临时身份证 9-其他有效通行旅行证件  10-护照 11-学生证 12-无证件 
	 */
	@Column("PAPER_TYPE")
	@Build(column = "E", desc = "证件类型",dic="DIC_CRE_TYPE")
	private String paperType;
	/** 
	 * 证件号码   
	 */
	@Column("PAPER_CODE")
	@Build(column = "F", desc = "证件号码")
	private String paperCode;
	/** 
	 * 登记注册代码   
	 */
	@Column("REGISTER_CODE")
	@Build(column = "G", desc = "登记注册代码")
	private String registerCode;
}
