package com.bbw.risk.bean;

import lombok.Data;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.PK;
import org.nutz.dao.entity.annotation.Table;

import com.bbw.risk.annotation.Build;
/**
* 同业客户业务明细
*/
@Data
@Table("RM_TRADE_CUSTOMERS")
@PK({
	"creditId" ,
	"customerCode" 
})
@Build(desc = "同业客户业务明细", tag = "tradeCustomersDetail")
public class RmTradeCustomers implements BaseBuild{
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
	 * 客户国籍代码   
	 */
	@Column("NATIONALITY_CODE")
	@Build(column = "C", desc = "客户国籍代码")
	private String nationalityCode;
	/** 
	 * 非现场监管统计机构编码   
	 */
	@Column("OFFSITE_CODE")
	@Build(column = "D", desc = "非现场监管统计机构编码")
	private String offsiteCode;
	/** 
	 * 组织机构代码   
	 */
	@Column("ORGANIZATION_CODE")
	@Build(column = "E", desc = "组织机构代码")
	private String organizationCode;
	/** 
	 * 客户类型  1-集团客户 2-单一法人客户 3-同业客户 
	 */
	@Column("CUSTOMER_TYPE")
	@Build(column = "F", desc = "客户类型",dic="DIC_CUS_TYPE")
	private String customerType;
	/** 
	 * 内部评级   
	 */
	@Column("INTEMAL_RATINGS")
	@Build(column = "G", desc = "内部评级")
	private String intemalRatings;
	/** 
	 * 外部评级   
	 */
	@Column("EXTERNAL_RATINGS")
	@Build(column = "H", desc = "外部评级")
	private String externalRatings;
	/** 
	 * 拆放同业   
	 */
	@Column("INTER_BANK_OFFERED")
	@Build(column = "I", desc = "拆放同业")
	private Long interBankOffered;
	/** 
	 * 存放同业   
	 */
	@Column("BANK_DEPOSIT")
	@Build(column = "J", desc = "存放同业")
	private Long bankDeposit;
	/** 
	 * 债券回购   
	 */
	@Column("BOND_REPURCHASE")
	@Build(column = "K", desc = "债券回购")
	private Long bondRepurchase;
	/** 
	 * 股票质押贷款   
	 */
	@Column("STOCK_COLLATERAL")
	@Build(column = "L", desc = "股票质押贷款")
	private Long stockCollateral;
	/** 
	 * 买入返售资产   
	 */
	@Column("BUYING_BACK")
	@Build(column = "M", desc = "买入返售资产")
	private Long buyingBack;
	/** 
	 * 买断式转贴现   
	 */
	@Column("BUY_OUT_TURN_DISCOUNT")
	@Build(column = "N", desc = "买断式转贴现")
	private Long buyOutTurnDiscount;
	/** 
	 * 持有债券   
	 */
	@Column("BOND_HOLDING")
	@Build(column = "O", desc = "持有债券")
	private Long bondHolding;
	/** 
	 * 股权投资   
	 */
	@Column("EQUITY_INVESTMENT")
	@Build(column = "P", desc = "股权投资")
	private Long equityInvestment;
	/** 
	 * 同业代付   
	 */
	@Column("TRADE_PAID")
	@Build(column = "Q", desc = "同业代付")
	private Long tradePaid;
	/** 
	 * 表内信用风险资产余额   
	 */
	@Column("OTHER_ONBALANCE_SHEET")
	@Build(column = "R", desc = "表内信用风险资产余额")
	private Long otherOnbalanceSheet;
	/** 
	 * 卖出回购资产   
	 */
	@Column("SELLING_BACK")
	@Build(column = "S", desc = "卖出回购资产")
	private Long sellingBack;
	/** 
	 * 不可撤销的承诺及或有负债   
	 */
	@Column("IRREPCALABLE_COMMITMENT")
	@Build(column = "T", desc = "不可撤销的承诺及或有负债")
	private Long irrepcalableCommitment;
	/** 
	 * 其他表外业务   
	 */
	@Column("OTHER_OFFBALANCE_SHEET")
	@Build(column = "U", desc = "其他表外业务")
	private Long otherOffbalanceSheet;
}
