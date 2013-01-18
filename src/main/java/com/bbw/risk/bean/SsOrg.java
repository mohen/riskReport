package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_ORG")
public class SsOrg implements BaseBuild{
	@Name
	@Column("ORG_ID")
	private String orgId;
	@Column("ORG_NAME")
	private String orgName;
	@Column("LOCATE")
	private String locate;
	@Column("STATE")
	private String state;
	@Column("SUP_ORG_ID")
	private String supOrgId;
	@Column("ORG_LEVEL")
	private Long orgLevel;
	@Column("FNA_CODE")
	private String fnaCode;
	@Column("IS_FNA")
	private String isFna;
	/**
	*
	*/
	@Many(target = SsUser.class, field = "orgId")
	private List<SsUser> ssUsers = new ArrayList<SsUser>();
}
