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
* 集团基本情况
*/
@Data
@Table("RG_GROUP_CLIENT")
@Build(desc = "集团基本情况", tag = "groupClient",number="02")
public class RgGroupClient implements BaseBuild{
	@Column("GROUP_CLIENT_ID")
	@Prev({
		@SQL(db = DB.ORACLE,value="SELECT SEQ_COMMOM_NEXT.NEXTVAL FROM DUAL")
	})
	private Long groupClientId;
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
	 * 工商注册编号   
	 */
	@Column("REGISTRATION_NUMBER")
	@Build(column = "C", desc = "工商注册编号")
	private String registrationNumber;
	/** 
	 * 集团成员数   
	 */
	@Column("MEMBER_NUMBER")
	@Build(column = "D", desc = "集团成员数")
	private Long memberNumber;
	/** 
	 * 授信类型  1-集团客户授信 2-供应链融资 
	 */
	@Column("CREDIT_TYPE")
	@Build(column = "E", desc = "授信类型",dic="DIC_LMT_TYPE")
	private String creditType;
	/** 
	 * 资产总额   
	 */
	@Column("GENERAL_ASSETS")
	@Build(column = "F", desc = "资产总额")
	private Long generalAssets;
	/** 
	 * 负债总额   
	 */
	@Column("TOTAL_LIABILITIES")
	@Build(column = "G", desc = "负债总额")
	private Long totalLiabilities;
	/** 
	 * 资产负债表类型  1-年报 2-半年报 3-季报 4-月报 
	 */
	@Column("ASSETS_LIABILITIES_TYPE")
	@Build(column = "H", desc = "资产负债表类型",dic="DIC_FNC_TYPE")
	private String assetsLiabilitiesType;
	/** 
	 * 资产负债表日期   
	 */
	@Column("ASSETS_LIABILITIES_DATE")
	@Build(column = "I", desc = "资产负债表日期")
	private String assetsLiabilitiesDate;
	/** 
	 * 风险预警信号   
	 */
	@Column("WAMING_SIGNAL")
	@Build(column = "J", desc = "风险预警信号")
	private String wamingSignal;
	/** 
	 * 关注事件   
	 */
	@Column("ATTENTION_EVENT")
	@Build(column = "K", desc = "关注事件")
	private String attentionEvent;
	/** 
	 * 信用评级结果   
	 */
	@Column("CREDIT_RATING")
	@Build(column = "L", desc = "信用评级结果")
	private String creditRating;
	/** 
	 * 注册国家或地区   
	 */
	@Column("REGISTER_NATION")
	@Build(column = "M", desc = "注册国家或地区")
	private String registerNation;
	/** 
	 * 国别代码   
	 */
	@Column("NATIONALIIY_CODE")
	@Build(column = "N", desc = "国别代码")
	private String nationaliiyCode;
	/** 
	 * 国内注册地址   
	 */
	@Column("REGISTER_ADDRESS")
	@Build(column = "O", desc = "国内注册地址")
	private String registerAddress;
	/** 
	 * 行政区划分代码   
	 */
	@Column("ADMINISTRATIVE_CODE")
	@Build(column = "P", desc = "行政区划分代码")
	private String administrativeCode;
	/** 
	 * 更新注册信息日期   
	 */
	@Column("REGISTER_UPDATE_DATE")
	@Build(column = "Q", desc = "更新注册信息日期")
	private String registerUpdateDate;
	/** 
	 * 办公地址   
	 */
	@Column("BUSINESS_ADDRESS")
	@Build(column = "R", desc = "办公地址")
	private String businessAddress;
	/** 
	 * 行政区划分代码   
	 */
	@Column("BUSINESS_ADMINISTRATIVE_CODE")
	@Build(column = "S", desc = "行政区划分代码")
	private String businessAdministrativeCode;
	/** 
	 * 更新办公地址日期   
	 */
	@Column("BUSINESS_UPDATE_DATE")
	@Build(column = "T", desc = "更新办公地址日期")
	private String businessUpdateDate;
	@Column("YEAR")
	private String year;
	@Column("MONTH")
	private String month;
	/**
	*实际控制人
	*/
	@Many(target = RgController.class, field = "groupClientId")
	@Build(desc = "实际控制人", tag = "actuaIController")
	private List<RgController> rgControllers = new ArrayList<RgController>();
	/**
	*关联集团信息
	*/
	@Many(target = RgAffiliatedGroups.class, field = "groupClientId")
	@Build(desc = "关联集团信息", tag = "affiliatedGroups")
	private List<RgAffiliatedGroups> rgAffiliatedGroupss = new ArrayList<RgAffiliatedGroups>();
	/**
	*重要关联人信息
	*/
	@Many(target = RgExecutives.class, field = "groupClientId")
	@Build(desc = "重要关联人信息", tag = "executives")
	private List<RgExecutives> rgExecutivess = new ArrayList<RgExecutives>();
	/**
	*集团成员名单
	*/
	@Many(target = RgMembers.class, field = "groupClientId")
	@Build(desc = "集团成员名单", tag = "members")
	private List<RgMembers> rgMemberss = new ArrayList<RgMembers>();
}
