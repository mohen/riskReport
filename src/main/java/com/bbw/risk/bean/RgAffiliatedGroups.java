package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 关联集团信息
*/
@Data
@Table("RG_AFFILIATED_GROUPS")
@PK({
	"groupClientId" ,
	"groupcode" 
})
@Build(desc = "关联集团信息", tag = "groupDetail")
public class RgAffiliatedGroups implements BaseBuild{
	@Column("GROUP_CLIENT_ID")
	private Long groupClientId;
	/** 
	 * 关联集团代码   
	 */
	@Column("GROUPCODE")
	@Build(column = "A", desc = "关联集团代码")
	private String groupcode;
	/** 
	 * 关联集团名称   
	 */
	@Column("GROUPNAME")
	@Build(column = "B", desc = "关联集团名称")
	private String groupname;
	/** 
	 * 关联关系类型  1:上下游关系,2:共同出资组建企业关系,3:亲属关系,4:担保关系,5:共同受同一自然人控制,6:其他关联关系 
	 */
	@Column("ASSOCIATEDTYPE")
	@Build(column = "C", desc = "关联关系类型",dic="DIC_ASS_TYPE")
	private String associatedtype;
}
