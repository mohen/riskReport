package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 集团成员名单
*/
@Data
@Table("RG_MEMBERS")
@PK({
	"groupClientId" ,
	"memberCode" 
})
@Build(desc = "集团成员名单", tag = "memberDetail")
public class RgMembers implements BaseBuild{
	@Column("GROUP_CLIENT_ID")
	private Long groupClientId;
	/** 
	 * 客户国籍代码   
	 */
	@Column("NATIONALITY_CODE")
	@Build(column = "A", desc = "客户国籍代码")
	private String nationalityCode;
	/** 
	 * 成员单位名称   
	 */
	@Column("MEMBER_NAME")
	@Build(column = "B", desc = "成员单位名称")
	private String memberName;
	/** 
	 * 成员单位代码   
	 */
	@Column("MEMBER_CODE")
	@Build(column = "C", desc = "成员单位代码")
	private String memberCode;
	/** 
	 * 组织机构代码   
	 */
	@Column("ORGANIZATION_CODE")
	@Build(column = "D", desc = "组织机构代码")
	private String organizationCode;
	/** 
	 * 登记注册代码   
	 */
	@Column("REGISTER_CODE")
	@Build(column = "E", desc = "登记注册代码")
	private String registerCode;
	/** 
	 * 成员类型  1-核心成员 2-一般成员 
	 */
	@Column("MEMBER_TYPE")
	@Build(column = "F", desc = "成员类型",dic="DIC_MEB_TYPE")
	private String memberType;
	/** 
	 * 母公司标识  1-是 2-否 
	 */
	@Column("PARENT")
	@Build(column = "G", desc = "母公司标识",dic="DIC_YES_NO")
	private String parent;
}
