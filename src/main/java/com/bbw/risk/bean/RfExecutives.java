package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 法定代表人高管及重要管理人信息
*/
@Data
@Table("RF_EXECUTIVES")
@Build(desc = "法定代表人高管及重要管理人信息", tag = "executivesDetail")
public class RfExecutives implements BaseBuild{
	@Column("EXECUTIVE_ID")
	private Long executiveId;
	@Column("CORPORATION_ID")
	private Long corporationId;
	/** 
	 * 关系人类型  1-董事长 2-监事长 3-总经理 4-财务主管 5-其他 
	 */
	@Column("PERSON_TYPE")
	@Build(column = "A", desc = "关系人类型",dic="DIC_PER_TYPE")
	private String personType;
	/** 
	 * 名称   
	 */
	@Column("NAME")
	@Build(column = "B", desc = "名称")
	private String name;
	/** 
	 * 客户国籍代码   
	 */
	@Column("NATIONALITY_CODE")
	@Build(column = "C", desc = "客户国籍代码")
	private String nationalityCode;
	/** 
	 * 身份证件号   
	 */
	@Column("IDENTITY_CODE")
	@Build(column = "D", desc = "身份证件号")
	private String identityCode;
	/** 
	 * 更新信息日期   
	 */
	@Column("UPDATE_DATE")
	@Build(column = "J", desc = "更新信息日期")
	private String updateDate;
	/** 
	 * 实际控制人标识  1-是 2否 
	 */
	@Column("ACTUAL_CONTROLLER")
	@Build(column = "K", desc = "实际控制人标识",dic="DIC_YES_NO")
	private String actualController;
	/**
	*重要关联人证件信息信息
	*/
	@Many(target = RfPaper.class, field = "executiveId")
	@Build(desc = "重要关联人证件信息信息", tag = "paper")
	private List<RfPaper> rfPapers = new ArrayList<RfPaper>();
	/**
	*重要关联人护照信息
	*/
	@Many(target = RfPassport.class, field = "executiveId")
	@Build(desc = "重要关联人护照信息", tag = "passport")
	private List<RfPassport> rfPassports = new ArrayList<RfPassport>();
}
