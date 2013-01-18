package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_ROLE")
public class SsRole implements BaseBuild{
	@Column("ROLE_ID")
	private Long roleId;
	@Column("ROLE_NAME")
	private String roleName;
	@Column("STATE")
	private String state;
	@Column("ROLE_LEVEL")
	private Long roleLevel;
	/**
	*
	*/
	@Many(target = SsRoleResource.class, field = "roleId")
	private List<SsRoleResource> ssRoleResources = new ArrayList<SsRoleResource>();
	/**
	*
	*/
	@Many(target = SsUserRole.class, field = "roleId")
	private List<SsUserRole> ssUserRoles = new ArrayList<SsUserRole>();
}
