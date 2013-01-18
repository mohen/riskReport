package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_INDEX")
public class SsIndex implements BaseBuild{
	@Column("INDEX_ID")
	private Long indexId;
	@Column("INDEX_DESC")
	private String indexDesc;
	@Column("INDEX_GROUP")
	private String indexGroup;
	@Column("INDEX_NAME")
	private String indexName;
	@Column("INDEX_SOURCE")
	private String indexSource;
	@Column("INDEX_INTER")
	private String indexInter;
	@Column("STATE")
	private String state;
	/**
	*
	*/
	@Many(target = SsShuffleIndex.class, field = "indexId")
	private List<SsShuffleIndex> ssShuffleIndexs = new ArrayList<SsShuffleIndex>();
}
