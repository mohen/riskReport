package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 护照信息
*/
@Data
@Table("RG_PASSPORT")
@PK({
	"executivesId" ,
	"passportNumber" 
})
@Build(desc = "护照信息", tag = "passportDetail")
public class RgPassport implements BaseBuild{
	@Column("EXECUTIVES_ID")
	private Long executivesId;
	/** 
	 * 护照号码   
	 */
	@Column("PASSPORT_NUMBER")
	@Build(column = "E", desc = "护照号码")
	private String passportNumber;
	/** 
	 * 发行日期   
	 */
	@Column("ISSUING_DATE")
	@Build(column = "F", desc = "发行日期")
	private String issuingDate;
	/** 
	 * 授信到期日期   
	 */
	@Column("DUE_DATE")
	@Build(column = "G", desc = "授信到期日期")
	private String dueDate;
}
