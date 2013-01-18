package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_DIC")
@PK({
	"enname" ,
	"opttype" 
})
public class SsDic implements BaseBuild{
	@Column("ENNAME")
	private String enname;
	@Column("CNNAME")
	private String cnname;
	@Column("OPTTYPE")
	private String opttype;
	@Column("MAPPING")
	private String mapping;
	@Column("MEMO")
	private String memo;
	@Column("STATE")
	private String state;
}
