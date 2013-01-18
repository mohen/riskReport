package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 集团客户成员信息
*/
@Data
@Table("RM_GROUP_CLIENT")
@PK({
	"creditId" ,
	"customerCode" 
})
@Build(desc = "集团客户成员信息", tag = "groupClientDetail")
public class RmGroupClient implements BaseBuild{
	@Column("CREDIT_ID")
	private Long creditId;
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
	 * 授信代码   
	 */
	@Column("CREDIT_CODE")
	@Build(column = "C", desc = "授信代码")
	private String creditCode;
	/** 
	 * 授信额度   
	 */
	@Column("CREDIT_LIMIT")
	@Build(column = "D", desc = "授信额度")
	private Long creditLimit;
	/** 
	 * 贷款授信额度   
	 */
	@Column("LOAN_LIMIT")
	@Build(column = "E", desc = "贷款授信额度")
	private Long loanLimit;
	/** 
	 * 贷款余额   
	 */
	@Column("LOAN_BALANCE")
	@Build(column = "F", desc = "贷款余额")
	private Long loanBalance;
	/** 
	 * 持有债券余额   
	 */
	@Column("BOND_BALANCE")
	@Build(column = "H", desc = "持有债券余额")
	private Long bondBalance;
	/** 
	 * 持有股权余额   
	 */
	@Column("EQUITYSTAKE_BALANCE")
	@Build(column = "I", desc = "持有股权余额")
	private Long equitystakeBalance;
	/** 
	 * 表内信用风险资产余额   
	 */
	@Column("OTHER_ONBALANCE_SHEET")
	@Build(column = "J", desc = "表内信用风险资产余额")
	private Long otherOnbalanceSheet;
	/** 
	 * 表外业务余额   
	 */
	@Column("OFFBALANCE_SHEET")
	@Build(column = "K", desc = "表外业务余额")
	private Long offbalanceSheet;
	/** 
	 * 现有业务余额占授信额度   
	 */
	@Column("BALANCE_OF_LIMIT")
	@Build(column = "L", desc = "现有业务余额占授信额度")
	private Long balanceOfLimit;
	/** 
	 * 贷款余额占用贷款授信额度   
	 */
	@Column("BALANCE_OF_LOAN_LIMIT")
	@Build(column = "M", desc = "贷款余额占用贷款授信额度")
	private Long balanceOfLoanLimit;
	/** 
	 * 尚未使用授信额度   
	 */
	@Column("USABLE_CREDIT_LIMIT")
	@Build(column = "N", desc = "尚未使用授信额度")
	private Long usableCreditLimit;
	/** 
	 * 尚可使用贷款授信额度   
	 */
	@Column("USABLE_LOAN_LIMIT")
	@Build(column = "O", desc = "尚可使用贷款授信额度")
	private Long usableLoanLimit;
}
