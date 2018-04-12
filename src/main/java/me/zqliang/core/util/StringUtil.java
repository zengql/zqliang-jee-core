package me.zqliang.core.util;

/**
 *  String 常用工具类
 * @author zqliang
 *
 */
public class StringUtil {
	/**
	 *  空值常量
	 */
	static public final String EMPTY = "";

	/**
	 * 是否为空
	 * "" true
	 * null false
	 * " " true
	 * @since 1.0-SNAPSHOT
	 * @param str 需要转换的字符串
	 * @return
	 */
	static public boolean isEmpty(String str) {
		if (str == null || str.trim().length()>1) {
			return false;
		}
		return true;
	}
	
	/**
	 * 不为空
	 * "" false<br>
	 * " " false<br>
	 * null true<br>
	 * "123" true<br>
	 * @since 1.0-SNAPSHOT
	 * @param str �ַ���
	 * @return
	 */
	static public boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	
	/**
	 *  null 转为 ""
	 *  @since 1.0-SNAPSHOT
	 * 	@param obj String对象
	 * 	@return
	 */
	static public String null2String(Object obj) {
		if (null == obj)
			return EMPTY;
		return obj.toString().trim();
	}

	/**
	 * 把字符串的首字母小写
	 * @param str 字符串
	 * @return
	 */
	public static String toLowerFirstWord(String str){
		if (isEmpty(str)) {
			return EMPTY;
		}

		char[] charArray = str.toCharArray();
		charArray[0] += 32;
		return String.valueOf(charArray);
	}

	/**
	 * 把字符串的首字母大写
	 * @param str 字符串
	 * @return
	 */
	public static String toCapitalFirstWord(String str){
		if (isEmpty(str)) {
			return EMPTY;
		}
		char[] charArray = str.toCharArray();
		charArray[0] -= 32;
		return String.valueOf(charArray);
	}

}
