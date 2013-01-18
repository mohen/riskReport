package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
 * 共同债务人
 */
@Data
@Table("RI_JOINT_DEBTOR")
@PK({
	"personalLoanId" ,
	"paperType" ,
	"paperCode" 
})
@Build(desc = "共同债务人", tag = "debtorDetail")
public class RiJointDebtor implements BaseBuild{
	@Column("PERSONAL_LOAN_ID")
	private Long personalLoanId;
	/** 
	 * 名称   
	 */
	@Column("NAME")
	@Build(column = "W", desc = "名称")
	private String name;
	/** 
	 * 证件类型  1-组织机构代码 2-居民身份证 3-军官证 4-文职干部证 5-警官证 6-士兵证 7-户口本 8-临时身份证 9-其他有效通行旅行证件  10-护照 11-学生证 12-无证件 
	 */
	@Column("PAPER_TYPE")
	@Build(column = "X", desc = "证件类型",dic="DIC_CRE_TYPE")
	private String paperType;
	/** 
	 * 证件号码   
	 */
	@Column("PAPER_CODE")
	@Build(column = "Y", desc = "证件号码")
	private String paperCode;
}
