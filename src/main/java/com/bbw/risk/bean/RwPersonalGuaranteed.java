package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.DB;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.SQL;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 个人违约贷款担保情况
*/
@Data
@Table("RW_PERSONAL_GUARANTEED")
@Build(desc = "个人违约贷款担保情况", tag = "personalGuaranteed",number="06")
public class RwPersonalGuaranteed implements BaseBuild{
	@Column("PERSONAL_GUARANTEED_ID")
	@Prev({
		@SQL(db = DB.ORACLE,value="SELECT SEQ_COMMOM_NEXT.NEXTVAL FROM DUAL")
	})
	private Long personalGuaranteedId;
	/** 
	 * 借款人姓名   
	 */
	@Column("BORROWER_NAME")
	@Build(column = "A", desc = "借款人姓名")
	private String borrowerName;
	/** 
	 * 证件类型  1-组织机构代码 2-居民身份证
3-军官证 4-文职干部证 5-警官证 6-士兵证 7-户口本 8-临时身份证 9-其他有效通行旅行证件  10-护照 11-学生证 12-无证件 
	 */
	@Column("PAPER_TYPE")
	@Build(column = "B", desc = "证件类型",dic="DIC_CRE_TYPE")
	private String paperType;
	/** 
	 * 证件号码   
	 */
	@Column("PAPER_CODE")
	@Build(column = "C", desc = "证件号码")
	private String paperCode;
	/** 
	 * 贷款合同号   
	 */
	@Column("LOAN_CONTRACT_NUMBER")
	@Build(column = "D", desc = "贷款合同号")
	private String loanContractNumber;
	/** 
	 * 担保合同号   
	 */
	@Column("GUARANTEED_CONTRACT_NUMBER")
	@Build(column = "E", desc = "担保合同号")
	private String guaranteedContractNumber;
	/** 
	 * 担保合同类型  1-抵押 2-质押 3-单人保证 4-多人保证 5-多人联保 6-多人分保 
	 */
	@Column("GUARANTEED_CONTRACT_TYPE")
	@Build(column = "F", desc = "担保合同类型",dic="DIC_GCT_TYPE")
	private String guaranteedContractType;
	/** 
	 * 押品类型   
	 */
	@Column("COLLATERAL_TYPE")
	@Build(column = "G", desc = "押品类型",dic="DIC")
	private String collateralType;
	/** 
	 * 押品名称   
	 */
	@Column("COLLATERAL_NAME")
	@Build(column = "H", desc = "押品名称")
	private String collateralName;
	/** 
	 * 押品代码   
	 */
	@Column("COLLATERAL_CODE")
	@Build(column = "I", desc = "押品代码")
	private String collateralCode;
	/** 
	 * 押品权属人   
	 */
	@Column("GUARANTOR_NAME")
	@Build(column = "J", desc = "押品权属人")
	private String guarantorName;
	/** 
	 * 押品权属人类型  1-法人机构 2-自然人 
	 */
	@Column("GUARANTOR_TYPE")
	@Build(column = "K", desc = "押品权属人类型",dic="DIC_GUT_TYPE")
	private String guarantorType;
	/** 
	 * 押品权属人证件类型   
	 */
	@Column("GUARANTOR_PAPER_TYPE")
	@Build(column = "L", desc = "押品权属人证件类型",dic="DIC")
	private String guarantorPaperType;
	/** 
	 * 押品权属人证件代码   
	 */
	@Column("GUARANTOR_PAPER_CODE")
	@Build(column = "M", desc = "押品权属人证件代码")
	private String guarantorPaperCode;
	/** 
	 * 押品评估价值   
	 */
	@Column("ESTIMATED_VALUE")
	@Build(column = "N", desc = "押品评估价值")
	private Long estimatedValue;
	/** 
	 * 押品权属人是否是第三方  1-是 2否 
	 */
	@Column("THIRD_PARTY")
	@Build(column = "O", desc = "押品权属人是否是第三方",dic="DIC_YES_NO")
	private String thirdParty;
	/** 
	 * 首次估值日期   
	 */
	@Column("FIRST_ESTIMATED_VALUE_DATE")
	@Build(column = "P", desc = "首次估值日期")
	private String firstEstimatedValueDate;
	/** 
	 * 最近估值日期   
	 */
	@Column("NEWEST_ESTIMATED_VALUE_DATE")
	@Build(column = "Q", desc = "最近估值日期")
	private String newestEstimatedValueDate;
	/** 
	 * 估值到期日期   
	 */
	@Column("CSTIMATED_VALUE_DUE_DATE")
	@Build(column = "R", desc = "估值到期日期")
	private String cstimatedValueDueDate;
	/** 
	 * 保证人保证能力上限   
	 */
	@Column("ASSURANCE_CAPABILITY_UPPER_LIM")
	@Build(column = "S", desc = "保证人保证能力上限")
	private Long assuranceCapabilityUpperLim;
	/** 
	 * 审批抵质押率   
	 */
	@Column("IMPAWN_RATE")
	@Build(column = "T", desc = "审批抵质押率")
	private Long impawnRate;
	/** 
	 * 实际抵质押率   
	 */
	@Column("REALLY_LMPAWN_RATE")
	@Build(column = "U", desc = "实际抵质押率")
	private Long reallyLmpawnRate;
	@Column("YEAR")
	private String year;
	@Column("MONTH")
	private String month;
}
