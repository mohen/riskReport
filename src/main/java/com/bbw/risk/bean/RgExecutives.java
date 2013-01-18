package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 重要关联人信息
*/
@Data
@Table("RG_EXECUTIVES")
@Build(desc = "重要关联人信息", tag = "executivesDetail")
public class RgExecutives implements BaseBuild{
	@Column("EXECUTIVES_ID")
	private Long executivesId;
	@Column("GROUP_CLIENT_ID")
	private Long groupClientId;
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
	 * 最后更新日期   
	 */
	@Column("UPDATE_DATE")
	@Build(column = "J", desc = "最后更新日期")
	private String updateDate;
	/**
	*证件信息
	*/
	@Many(target = RgPaper.class, field = "executivesId")
	@Build(desc = "证件信息", tag = "paperDetail")
	private List<RgPaper> rgPapers = new ArrayList<RgPaper>();
	/**
	*护照信息
	*/
	@Many(target = RgPassport.class, field = "executivesId")
	@Build(desc = "护照信息", tag = "passportDetail")
	private List<RgPassport> rgPassports = new ArrayList<RgPassport>();
}
