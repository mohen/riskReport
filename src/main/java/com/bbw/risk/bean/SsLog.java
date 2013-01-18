package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;
@Data
@Table("SS_LOG")
public class SsLog implements BaseBuild{
	@Column("LOG_ID")
	private Long logId;
	@Column("LOG_TIME")
	private java.util.Date logTime;
	@Column("LOG_CONTENT")
	private String logContent;
	@Column("LOG_ERROR")
	private String logError;
	@Column("LOG_MODEL")
	private String logModel;
	@Column("LOG_USER_ID")
	private String logUserId;
}
