package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_SCHEDULE")
public class SsSchedule implements BaseBuild{
	@Column("SCHEDULE_ID")
	private Long scheduleId;
	@Column("SCHEDULE_NAME")
	private String scheduleName;
	@Column("DEP_SCHEDULE_ID")
	private Long depScheduleId;
	@Column("SCHEDULE_CLASS")
	private String scheduleClass;
	@Column("STATE")
	private String state;
	@Column("LASTE_DATE")
	private java.util.Date lasteDate;
	@Column("SCHEDULE_GROUP")
	private String scheduleGroup;
	/**
	*
	*/
	@Many(target = SsScheduleShuffle.class, field = "scheduleId")
	private List<SsScheduleShuffle> ssScheduleShuffles = new ArrayList<SsScheduleShuffle>();
}
