package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_USER_ROLE")
@PK({
	"roleId" ,
	"userId" 
})
public class SsUserRole implements BaseBuild{
	@Column("ROLE_ID")
	private Long roleId;
	@Column("USER_ID")
	private String userId;
	@Column("STATE")
	private String state;
}
