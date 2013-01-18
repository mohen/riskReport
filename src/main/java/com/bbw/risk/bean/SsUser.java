package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_USER")
public class SsUser implements BaseBuild{
	@Name
	@Column("USER_ID")
	private String userId;
	@Column("ORG_ID")
	private String orgId;
	@Column("USER_NAME")
	private String userName;
	@Column("PASSWORD")
	private String password;
	@Column("STATE")
	private String state;
	/**
	*
	*/
	@Many(target = SsUserRole.class, field = "userId")
	private List<SsUserRole> ssUserRoles = new ArrayList<SsUserRole>();
}
