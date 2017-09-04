package com.zqliang.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期相关工具
 * @author zqliang
 * @date 2017/05/14
 */
public class DateUtil {
	
	/**
	 * 格式化时间
	 * @param date
	 * @param formatStr
	 * @return
	 */
	static public final String format2String(Date date, String formatStr) {
		if (null == date || StringUtil.isBlank(formatStr))
			return StringUtil.EMPTY;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
			return dateFormat.format(date);
		} catch(Exception e) {
			
		}
		return StringUtil.EMPTY;
	}
	

	/**
	 * 格式化化时间
	 * @param date 日期
	 * @param dateFormatType 本工具类中的一个内部枚举 
	 * @param dateSplit 日期分割符
	 * @param timeSplit 时间分割符
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
	 * 自定义时间类型<br>
	 *  分隔符可自行添加<br>
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
		 * 
		 * dateSplit 日期分隔符（ 默认-）
		 * timeSplit 时间分割付（ 默认：）
		 */
		public String toString(String dateSplit, String timeSplit) {
			if (StringUtil.isBlank(dateSplit))
				dateSplit = "-";
			if (StringUtil.isBlank(timeSplit))
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
