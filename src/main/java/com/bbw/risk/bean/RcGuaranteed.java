package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.DB;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.SQL;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 对公客户担保情况统计
*/
@Data
@Table("RC_GUARANTEED")
@Build(desc = "对公客户担保情况统计", tag = "guaranteed",number="04")
public class RcGuaranteed implements BaseBuild{
	@Column("GUARANTEED_ID")
	@Prev({
		@SQL(db = DB.ORACLE,value="SELECT SEQ_COMMOM_NEXT.NEXTVAL FROM DUAL")
	})
	private Long guaranteedId;
	/** 
	 * 客户名称   
	 */
	@Column("CUSTOMER_NAME")
	@Build(column = "A", desc = "客户名称")
	private String customerName;
	/** 
	 * 客户代码   
	 */
	@Column("CUSTOMER_CODE")
	@Build(column = "B", desc = "客户代码")
	private String customerCode;
	/** 
	 * 贷款合同号   
	 */
	@Column("LOAN_CONTRACT_NUMBER")
	@Build(column = "C", desc = "贷款合同号")
	private String loanContractNumber;
	/** 
	 * 担保合同号   
	 */
	@Column("GUARANTEED_CONTRACT_NUMBER")
	@Build(column = "D", desc = "担保合同号")
	private String guaranteedContractNumber;
	/** 
	 * 担保合同类型  1-抵押 2-质押 3-单人保证 4-多人保证 5-多人联保 6-多人分保 
	 */
	@Column("GUARANREED_CONTRACT_TYPE")
	@Build(column = "E", desc = "担保合同类型",dic="DIC_GCT_TYPE")
	private String guaranreedContractType;
	/** 
	 * 押品类型   
	 */
	@Column("COLLATERAL_TYPE")
	@Build(column = "F", desc = "押品类型",dic="DIC")
	private String collateralType;
	/** 
	 * 押品名称   
	 */
	@Column("COLLATERAL_NAME")
	@Build(column = "G", desc = "押品名称")
	private String collateralName;
	/** 
	 * 押品代码   
	 */
	@Column("COLLATERAL_CODE")
	@Build(column = "H", desc = "押品代码")
	private String collateralCode;
	/** 
	 * 押品权属人   
	 */
	@Column("GUARANTOR_NAME")
	@Build(column = "I", desc = "押品权属人")
	private String guarantorName;
	/** 
	 * 押品权属人类型  1-法人机构 2-自然人 
	 */
	@Column("GUARANTOR_TYPE")
	@Build(column = "J", desc = "押品权属人类型",dic="DIC_GUT_TYPE")
	private String guarantorType;
	/** 
	 * 押品权属人证件类型   
	 */
	@Column("GUARANTOR_PAPER_TYPE")
	@Build(column = "K", desc = "押品权属人证件类型",dic="DIC")
	private String guarantorPaperType;
	/** 
	 * 押品权属人证件代码   
	 */
	@Column("GUARANTOR_PAPER_CODE")
	@Build(column = "L", desc = "押品权属人证件代码")
	private String guarantorPaperCode;
	/** 
	 * 押品评估价值   
	 */
	@Column("ESTIMATED_VALUE")
	@Build(column = "M", desc = "押品评估价值")
	private Long estimatedValue;
	/** 
	 * 押品权属人是否是第三方  1-是 2否 
	 */
	@Column("THIRD_PARTY")
	@Build(column = "N", desc = "押品权属人是否是第三方",dic="DIC_YES_NO")
	private String thirdParty;
	/** 
	 * 首次估值日期   
	 */
	@Column("FIRST_ESTIMATED_VALUE_DATE")
	@Build(column = "O", desc = "首次估值日期")
	private String firstEstimatedValueDate;
	/** 
	 * 最新估值日期   
	 */
	@Column("NEWEST_ESTIMATED_VALUE_DATE")
	@Build(column = "P", desc = "最新估值日期")
	private String newestEstimatedValueDate;
	/** 
	 * 估值到期日期   
	 */
	@Column("ESTIMATED_VALUE_DUE_DAIE")
	@Build(column = "Q", desc = "估值到期日期")
	private String estimatedValueDueDaie;
	/** 
	 * 保证人保证能力上限   
	 */
	@Column("ASSURANCE_CAPABILITY_UPPER_LIM")
	@Build(column = "R", desc = "保证人保证能力上限")
	private Long assuranceCapabilityUpperLim;
	/** 
	 * 审批抵质押率   
	 */
	@Column("IMPAWN_RATE")
	@Build(column = "S", desc = "审批抵质押率")
	private Long impawnRate;
	@Column("YEAR")
	private String year;
	@Column("MONTH")
	private String month;
}
