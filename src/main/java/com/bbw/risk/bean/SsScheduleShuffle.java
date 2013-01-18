package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_SCHEDULE_SHUFFLE")
@PK({
	"scheduleId" ,
	"shfId" 
})
public class SsScheduleShuffle implements BaseBuild{
	@Column("SCHEDULE_ID")
	private Long scheduleId;
	@Column("SHF_ID")
	private Long shfId;
	@Column("ORDER")
	private Long order;
}
