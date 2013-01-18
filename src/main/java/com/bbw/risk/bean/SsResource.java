package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_RESOURCE")
public class SsResource implements BaseBuild{
	@Column("MENU_ID")
	private Long menuId;
	@Column("MENU_NAME")
	private String menuName;
	@Column("MENU_PNT_ID")
	private Long menuPntId;
	@Column("MENU_ICON")
	private String menuIcon;
	@Column("MENU_SCRIPE")
	private String menuScripe;
	@Column("MENU_NOTIC")
	private String menuNotic;
	/**
	*
	*/
	@Many(target = SsRoleResource.class, field = "menuId")
	private List<SsRoleResource> ssRoleResources = new ArrayList<SsRoleResource>();
}
