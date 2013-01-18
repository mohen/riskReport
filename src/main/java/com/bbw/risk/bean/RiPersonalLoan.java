package com.bbw.risk.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.nutz.dao.DB;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.SQL;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 个人贷款违约情况
*/
@Data
@Table("RI_PERSONAL_LOAN")
@Build(desc = "个人贷款违约情况", tag = "personalLoan",number="05")
public class RiPersonalLoan implements BaseBuild{
	@Column("PERSONAL_LOAN_ID")
	@Prev({
		@SQL(db = DB.ORACLE,value="SELECT SEQ_COMMOM_NEXT.NEXTVAL FROM DUAL")
	})
	private Long personalLoanId;
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
	 * 持有行机构代码   
	 */
	@Column("BANK_CODE")
	@Build(column = "D", desc = "持有行机构代码")
	private String bankCode;
	/** 
	 * 贷款合同号   
	 */
	@Column("LOAN_CONTRACT_NUMBER")
	@Build(column = "E", desc = "贷款合同号")
	private String loanContractNumber;
	/** 
	 * 借据号   
	 */
	@Column("EVIDENCEOFDEBT_NUMBER")
	@Build(column = "F", desc = "借据号")
	private String evidenceofdebtNumber;
	/** 
	 * 贷款品种  1-住房贷款 2-商刚房贷款 3-公积金贷款 4-汽车贷款 5-助学贷款 
	 */
	@Column("LOAN_VARIETIES")
	@Build(column = "G", desc = "贷款品种",dic="DIC_LVS_TYPE")
	private String loanVarieties;
	/** 
	 * 担保方式  1-保证 2-抵押 3-质押 4-信用 
	 */
	@Column("GUARANTEE_WAY")
	@Build(column = "H", desc = "担保方式",dic="DIC_GWY_TYPE")
	private String guaranteeWay;
	/** 
	 * 发放金额   
	 */
	@Column("ISSUE_MONEY")
	@Build(column = "I", desc = "发放金额")
	private Long issueMoney;
	/** 
	 * 贷款余额   
	 */
	@Column("LOAN_BALANCE")
	@Build(column = "J", desc = "贷款余额")
	private Long loanBalance;
	/** 
	 * 发放日期   
	 */
	@Column("ISSUE_DATE")
	@Build(column = "K", desc = "发放日期")
	private String issueDate;
	/** 
	 * 授信到期日期   
	 */
	@Column("DUE_DATE")
	@Build(column = "L", desc = "授信到期日期")
	private String dueDate;
	/** 
	 * 违约金额   
	 */
	@Column("DEFAULT_AMOUNT")
	@Build(column = "M", desc = "违约金额")
	private Long defaultAmount;
	/** 
	 * 违约天数   
	 */
	@Column("DEFAULT_DAYS")
	@Build(column = "N", desc = "违约天数")
	private Long defaultDays;
	/** 
	 * 五级分类  1-正常 2-关注 3-次级 4-可疑 5-损失 
	 */
	@Column("FIVE_CLASSIFY")
	@Build(column = "O", desc = "五级分类",dic="DIC_FCY_TYPE")
	private String fiveClassify;
	/** 
	 * 支付方式  1-受托支付 2-自主支付 
	 */
	@Column("PAYMENT_METHOD")
	@Build(column = "P", desc = "支付方式",dic="DIC_PMD_TYPE")
	private String paymentMethod;
	/** 
	 * 最近一次还款金额   
	 */
	@Column("RECENTLY_PAYMENT_MONEY")
	@Build(column = "Q", desc = "最近一次还款金额")
	private Long recentlyPaymentMoney;
	/** 
	 * 最近一次还款日期   
	 */
	@Column("RECENTLY_PAYMENT_DATE")
	@Build(column = "R", desc = "最近一次还款日期")
	private String recentlyPaymentDate;
	/** 
	 * 客户地址   
	 */
	@Column("CUSTOMER_ADDRESS")
	@Build(column = "S", desc = "客户地址")
	private String customerAddress;
	/** 
	 * 住址行政区代码   
	 */
	@Column("ADDRESS_ADMINISTRATIVE_CODE")
	@Build(column = "T", desc = "住址行政区代码")
	private String addressAdministrativeCode;
	/** 
	 * 客户其他证件类型   
	 */
	@Column("OTHER_PAPER_TYPE")
	@Build(column = "U", desc = "客户其他证件类型",dic="DIC")
	private String otherPaperType;
	/** 
	 * 客户其他证件号码   
	 */
	@Column("OTHER_PAPER_CODE")
	@Build(column = "V", desc = "客户其他证件号码")
	private String otherPaperCode;
	/** 
	 * 学校名称   
	 */
	@Column("SCHOOL_NAME")
	@Build(column = "Z", desc = "学校名称")
	private String schoolName;
	/** 
	 * 学校地址   
	 */
	@Column("SCHOOL_ADDRESS")
	@Build(column = "AA", desc = "学校地址")
	private String schoolAddress;
	/** 
	 * 学校行政区划代码   
	 */
	@Column("SCHOOL_ADMINISTRATIVE_CODE")
	@Build(column = "AB", desc = "学校行政区划代码")
	private String schoolAdministrativeCode;
	/** 
	 * 学生证号   
	 */
	@Column("STUDENT_NUMBER")
	@Build(column = "AC", desc = "学生证号")
	private String studentNumber;
	/** 
	 * 贷款时家庭住址   
	 */
	@Column("FAMILY_ADDRESS")
	@Build(column = "AD", desc = "贷款时家庭住址")
	private String familyAddress;
	/** 
	 * 贷款时家庭住址行政区划代码   
	 */
	@Column("FAMILY_ADMINISTRATIVE_CODE")
	@Build(column = "AE", desc = "贷款时家庭住址行政区划代码")
	private String familyAdministrativeCode;
	/** 
	 * 助学贷款类型  1-高校政策性助学贷款 2-高校商业助学贷款 3-生源地政策性助学贷款 4-生源地商业助学贷款 5-其他政策性助学贷款 6-其他商业助学贷款。 
	 */
	@Column("STUDENT_LOAN_TYPE")
	@Build(column = "AF", desc = "助学贷款类型",dic="DIC_SLT_TYPE")
	private String studentLoanType;
	@Column("YEAR")
	private String year;
	@Column("MONTH")
	private String month;
	/**
	*共同债务人
	*/
	@Many(target = RiJointDebtor.class, field = "personalLoanId")
	@Build(desc = "共同债务人", tag = "jointDebtor")
	private List<RiJointDebtor> riJointDebtors = new ArrayList<RiJointDebtor>();
}
