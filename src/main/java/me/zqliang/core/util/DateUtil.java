package me.zqliang.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期处理类
 * @author zqliang
 * @date 2017/05/14
 */
public class DateUtil {
	
	/**
	 * ��ʽ��ʱ��
	 * @param date
	 * @param formatStr
	 * @return
	 */
	static public final String format2String(Date date, String formatStr) {
		if (null == date || StringUtil.isEmpty(formatStr))
			return StringUtil.EMPTY;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
			return dateFormat.format(date);
		} catch(Exception e) {
			
		}
		return StringUtil.EMPTY;
	}
	

	/**
	 * 格式化为字符串
	 * @param date 日期对象
	 * @param dateFormatType 格式化枚举对象
	 * @param dateSplit 日期分割符 默认-
	 * @param timeSplit 时间分割符 默认:
	 * @return
	 */
	static public final String format2String(Date date, DateFormatType dateFormatType, String dateSplit, 
			String timeSplit) {
		if (null == date || null == dateFormatType)
			return StringUtil.EMPTY;
		try {
			String formatStr = dateFormatType.toString(dateSplit, timeSplit);
			SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
			return dateFormat.format(date);
		} catch(Exception e) {
			
		}
		return StringUtil.EMPTY;
	}
	
	/**
	 *
	 *  日期枚举，列举了常用的格式<br>
	 *
	 * DATE 2017-05-14<br>
	 * DATETIME 2017-05-14 14:40:12 <br>
	 * TIME 14:40:12
	 * @author zqliang
	 *
	 */
	public enum DateFormatType{
		DATE("yyyy@MM@dd"), DATETIME("yyyy@MM@dd HH#mm#ss"), TIME("HH#mm#ss");
		
		private String value;
		
		private DateFormatType(String str){
			this.value = str;
		}
		
		/**
		 *  转成string
		 * dateSplit 日期分割符
		 * timeSplit 时间分隔符
		 */
		public String toString(String dateSplit, String timeSplit) {
			if (StringUtil.isEmpty(dateSplit))
				dateSplit = "-";
			if (StringUtil.isEmpty(timeSplit))
				timeSplit = ":";
			value = this.value.replaceAll("@", dateSplit);
			value = this.value.replaceAll("#", timeSplit);
			return value;
		}
		
		@Override
		public String toString() {
			return toString(null, null);
		}
	}

}
