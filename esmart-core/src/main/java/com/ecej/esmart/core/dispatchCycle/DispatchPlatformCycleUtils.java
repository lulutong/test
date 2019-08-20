package com.ecej.esmart.core.dispatchCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Service("dispatchPlatformCycleUtils")
public class DispatchPlatformCycleUtils {
	
	static private final Logger LOGGER = LoggerFactory.getLogger(DispatchPlatformCycleUtils.class);

	/**
	 * 获取首次服务日期
	 * @param day 最早可预约天数(day天后)
	 * @param week 预约星期
	 * @return
	 */
	public  Date getFirstServiceDate(int day,int week){
		
		Date result = null;
		
		try {
			SimpleDateFormat ymd = new SimpleDateFormat("yyyy年MM月dd日 E",Locale.CHINA);
			SimpleDateFormat yMd = new SimpleDateFormat("yyyy-MM-dd");
			
			LOGGER.info("当前日期{},最早可预约天数{}天后,期望预约到星期{}",ymd.format(new Date()),day,week);
			
			int[] weekDay = {7,1,2,3,4,5,6};
			
			Calendar cal = Calendar.getInstance();
			
			cal.add(Calendar.DAY_OF_MONTH,day);
			
			LOGGER.info("最早可预约的日期{}",ymd.format(cal.getTime()));
			
			//最早可预约的日期的星期
			int firstServiceWeek = weekDay[cal.get(Calendar.DAY_OF_WEEK)-1];
			
			//还差几天到可预约日期
			int count = 7 - firstServiceWeek + week;
			
			if(count >= 7){
				count = count - 7;
			}
			
			cal.add(Calendar.DAY_OF_MONTH,count);
			
			result = yMd.parse(yMd.format(cal.getTime()));
			
			LOGGER.info("最早可预约日期,还有{}天,到达可预约日期{}",count,ymd.format(result));
			LOGGER.info("获取首次服务日期响应:{}",ymd.format(result));
		} catch (Exception e) {
			LOGGER.info("getFirstServiceDate 异常",e);
		}
		
		return result;
	}
	
	/**
	 * 获取扫档期类型
	 * @param start 首次服务日期
	 * @param type 服务类别 1:一周一次 2:两周一次 3:一周n次
	 * @return 1:单周档期 2:双周档期12:单双周大档期
	 */
	public  int selectSingleOrDouble(Date start,String type){
		int result;
		//首次服务类型
		int singleOrDouble = singleOrDouble(start);
		
		if(singleOrDouble == 1 && type.equals("LZYC")){
			result = 1;//首次服务单周 类型 两周一次 扫描单周档期	
		}else if(singleOrDouble == 2 && type.equals("LZYC")){
			result = 2;//首次服务双周 类型 两周一次 扫描双周档期
		}else{
			result = 12;//扫描 单 双 周档期
		}
		LOGGER.info("服务类型{}扫描档期{}",type,result);
		return result;
	}
	
	/**
	 * 判断首次服务日期是单周还是双周
	 * @param start 首次服务日期
	 * @return 1单周 2双周
	 */
	public  int singleOrDouble(Date start){
		
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
		
		LOGGER.info("首次服务日期:{}",ymd.format(start));
		
		int result;
		
		//距离2018-01-01的周数差
		int count = getWeekcount(start);
		
		if(count%2 == 0){
			result = 2;
		}else{
			result = 1;
		}
		LOGGER.info("首次服务日期单双周响应:{}",result);
		return result;
	}
	
	/**
	 * 2018-01-01 到end的日期周数差
	 * @param end
	 * @return
	 */
	public  int getWeekcount(Date end){
		
		int result = 0;
		
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			result = getWeekcount(ymd.parse("2018-01-01"), end);
		} catch (Exception e) {
			LOGGER.error("单参数getWeekcount异常",e);
		}
		
		return result;
	}
	
	public Integer getWeek(Date date){
		
		if(date == null){
			return null;
		}
		
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd E",Locale.CHINA);
		
		LOGGER.info("Date:{}",ymd.format(date));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(date);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		week = week - 1;
		
		if(week == 0 ) week = 7;
		
		LOGGER.info("星期:{}",week);
		
		return week;
	}
	
	/**
	 * 日期周数差
	 * @param start 开始日期
	 * @param end 截止日期
	 * @return
	 */
	public  int getWeekcount(Date start,Date end){
		
    	SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
    	
		try {
			
	    	start = ymd.parse(ymd.format(start));
	    	end = ymd.parse(ymd.format(end));
	    	
		} catch (ParseException e) {
			LOGGER.error("双参数getWeekcount异常",e);
		}
    	//天数差
    	int day = (int) (((end.getTime()-start.getTime())/(1000*60*60*24)))+1;
    	//第几周
    	int week = (day/7) + (((day%7) == 0)?0:1);
    	
    	LOGGER.info("日期{}距离{}共{}周",ymd.format(start),ymd.format(end),week);
    	
    	return week;
	    }
}
