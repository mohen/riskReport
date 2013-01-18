package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_SHUFFLE")
public class SsShuffle implements BaseBuild{
	@Column("SHF_ID")
	private Long shfId;
	@Column("SHF_NAME")
	private String shfName;
	@Column("SHF_DESC")
	private String shfDesc;
	@Column("STATE")
	private String state;
	@Column("SHF_CONTENT")
	private String shfContent;
	/**
	*
	*/
	@Many(target = SsScheduleShuffle.class, field = "shfId")
	private List<SsScheduleShuffle> ssScheduleShuffles = new ArrayList<SsScheduleShuffle>();
	/**
	*
	*/
	@Many(target = SsShuffleIndex.class, field = "shfId")
	private List<SsShuffleIndex> ssShuffleIndexs = new ArrayList<SsShuffleIndex>();
}
