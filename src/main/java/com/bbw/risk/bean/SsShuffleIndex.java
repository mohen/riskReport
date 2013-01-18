package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_SHUFFLE_INDEX")
@PK({
	"indexId" ,
	"shfId" 
})
public class SsShuffleIndex implements BaseBuild{
	@Column("INDEX_ID")
	private Long indexId;
	@Column("SHF_ID")
	private Long shfId;
	@Column("ORDER")
	private Long order;
}
