package com.bbw.risk.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import com.bbw.risk.annotation.Build;
import com.bbw.risk.bean.BaseBuild;
import com.bbw.risk.bean.RmCredit;
import com.bbw.risk.bean.RmLoan;

/**
 * 格式化输出报文
 * 
 * @author MOHEN
 * 
 */
public class FormatUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RmCredit credit = new RmCredit();
		credit.setCustomerName("212");
		credit.setBondBalance(200l);
		List loans = new ArrayList<RmLoan>();
		RmLoan loan = new RmLoan();
		loan.setAccrualBalance(2121l);
		loans.add(loan);
		credit.setRmLoans(loans);
		List list = new ArrayList<RmCredit>();
		list.add(credit);
		list.add(credit);
		System.out.println(FormatUtils.buildXmlReport(list, "01", "7001", "广西北部湾银行", "20130201", "1.0"));

	}

	/**
	 * 生成xml
	 * 
	 * @param list
	 * @param reportnumbe
	 * @param bankcode
	 * @param bankname
	 * @param reportdate
	 * @param version
	 * @return
	 */
	public static String buildXmlReport(List<BaseBuild> list, String reportnumbe, String bankcode, String bankname, String reportdate, String version) {
		String xml = "";
		try {
			Format formats = Format.getPrettyFormat();
			// Format formats = Format.getRawFormat();
			formats.setEncoding("utf-8");
			XMLOutputter xmlOutput = new XMLOutputter(formats);
			Element root = new Element("cbrc");
			root.setAttribute("reportnumbe", reportnumbe);
			root.setAttribute("bankcode", bankcode);
			root.setAttribute("bankname", bankname);
			root.setAttribute("reportdate", reportdate);
			root.setAttribute("version", version);
			formatBuildList(root, list);
			Document doc = new Document(root);
			xml = xmlOutput.outputString(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xml;
	}

	private static void formatBuildList(Element root, List<BaseBuild> list) {
		try {
			if (list != null && list.size() > 0) {
				for (BaseBuild base : list) {
					formatBuildBase(root, base);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void formatBuildBase(Element root, BaseBuild base) {
		try {
			Class<? extends BaseBuild> baseClass = base.getClass();
			boolean annotation = baseClass.isAnnotationPresent(Build.class);
			if (base != null && annotation) {
				Build fbuild = baseClass.getAnnotation(Build.class);
				String ftag = fbuild.tag().equals("") ? baseClass.getName() : fbuild.tag();
				Element felement = new Element(ftag);
				root.addContent(felement);
				Field[] fields = baseClass.getDeclaredFields();
				for (Field field : fields) {
					boolean annotationPresent = field.isAnnotationPresent(Build.class);
					if (annotationPresent) {
						Build build = field.getAnnotation(Build.class);
						String tag = build.tag().equals("") ? field.getName() : build.tag();
						Element telement = new Element(tag);
						field.setAccessible(true);
						Object value = field.get(base) == null ? build.value() : field.get(base);
						field.setAccessible(false);
						Class<?> type = field.getType();// 获取数据类型
						if (value instanceof List) {
							@SuppressWarnings("unchecked")
							List<BaseBuild> list = (List<BaseBuild>) value;
							formatBuildList(telement, list);
						} else if (type.equals(BaseBuild.class)) {
							BaseBuild sbase = (BaseBuild) value;
							formatBuildBase(telement, sbase);
						} else {
							String column = build.column();
							telement.setAttribute("column", column);
							telement.setText(value.toString());
						}
						felement.addContent(telement);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
