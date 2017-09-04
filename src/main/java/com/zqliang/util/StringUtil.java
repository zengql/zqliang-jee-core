package com.zqliang.util;

/**
 * 字符串相关工具类
 * @author zqliang
 *
 */
public class StringUtil {
	/**
	 * 一个空的字符串
	 */
	static public final String EMPTY = "";

	/**
	 * 判断是否为空
	 * "" true
	 * null false
	 * " " true
	 * @since 1.0-SNAPSHOT
	 * @param str 字符串
	 * @return
	 */
	static public boolean isEmpty(String str) {
		if (str == null || str.trim().length()>1) {
			return false;
		}
		return true;
	}
	
	/**
	 * 判断是否为空<br>
	 * "" false<br>
	 * " " false<br>
	 * null true<br>
	 * "123" true<br>
	 * @since 1.0-SNAPSHOT
	 * @param str 字符串
	 * @return
	 */
	static public boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/**
	 * 判断是否是空白的
	 * null true,
	 * "" true,
	 * " " true
	 * "null" true
	 * "123" false
	 * @since 1.0-SNAPSHOT
	 * @param str 字符串
	 * @return
	 */
	static public boolean isBlank(String str) {
		if (null == str || "".equals(str.trim()) || "null".equalsIgnoreCase(str.trim()))
			return true;
		return false;
	}
	
	/**
	 * 判断是否是空白的
	 * null false,
	 * "" false,
	 * " " false
	 * "null" false
	 * "123" true
	 * @since 1.0-SNAPSHOT
	 * @param str 字符串
	 * @return
	 */
	static public boolean isNotBlank(String str) {
		return isBlank(str);
	}
	
	/**
	 *  如果obj是null，返回空，否则返回该obj的toString方法，并去掉前后空格
	 *  @since 1.0-SNAPSHOT
	 * 	@param str 字符串
	 * 	@return
	 */
	static public String null2String(Object obj) {
		if (null == obj)
			return EMPTY;
		return obj.toString().trim();
	}
}
