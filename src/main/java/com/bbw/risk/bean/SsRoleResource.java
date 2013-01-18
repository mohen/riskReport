package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_ROLE_RESOURCE")
@PK({
	"roleId" ,
	"menuId" 
})
public class SsRoleResource implements BaseBuild{
	@Column("ROLE_ID")
	private Long roleId;
	@Column("MENU_ID")
	private Long menuId;
	@Column("STATE")
	private String state;
}
