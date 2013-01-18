package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 重要关联人证件信息信息
*/
@Data
@Table("RF_PAPER")
@PK({
	"executiveId" ,
	"paperCode" 
})
@Build(desc = "重要关联人证件信息信息", tag = "paperDetail")
public class RfPaper implements BaseBuild{
	@Column("EXECUTIVE_ID")
	private Long executiveId;
	/** 
	 * 证件类型  1-组织机构代码 2-居民身份证
3-军官证 4-文职干部证 5-警官证 6-士兵证 7-户口本 8-临时身份证 9-其他有效通行旅行证件  10-护照 11-学生证 12-无证件 
	 */
	@Column("PAPER_TYPE")
	@Build(column = "H", desc = "证件类型",dic="DIC_CRE_TYPE")
	private String paperType;
	/** 
	 * 证件号码   
	 */
	@Column("PAPER_CODE")
	@Build(column = "I", desc = "证件号码")
	private String paperCode;
}
