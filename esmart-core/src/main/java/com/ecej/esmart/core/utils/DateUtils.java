package com.ecej.esmart.core.utils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <p>
 * 时间工具类
 * 通过枚举实现
 * </p>
 * <p>
 * 命名规范:年月日设置时"-"用下划线"_"表示
 * 小时分钟秒毫秒设置时":"用下划线"_"表示
 * 年月日设置时"_"用双下划线"__"表示
 * 小时分钟秒毫秒设置时"_"用双下划线"__"表示
 * 中间空格用"_"表示
 * 时间正斜线"/"用"l"表示
 * 时间反斜线"\"用"L"表示
 * </P>
 * <p>
 * --以下方法，如无特殊提示，请使用指定时间格式进行调用
 * 时间格式定义请参考以上命名规范，如不存在，请自行添加
 * </p>
 * Created by kevin on 2017/8/28 16:11.
 */
public enum DateUtils {
    y("yyyy"),
    y_M("yyyy-MM"),
    y_M_d("yyyy-MM-dd"),
    y_M_d_H("yyyy-MM-dd HH"),
    y_M_d_H_m("yyyy-MM-dd HH:mm"),
    y_M_d_H_m_s("yyyy-MM-dd HH:mm:ss"),
    y_M_d_H_m_s_S("yyyy-MM-dd HH:mm:ss SSS"),
    M("MM"),
    M_d("MM-dd"),
    M_d_H("MM-dd HH"),
    M_d_H_m("MM-dd HH:mm"),
    M_d_H_m_s("MM-dd HH:mm:ss"),
    M_d_H_m_s_S("MM-dd HH:mm:ss SSS"),
    d("dd"),
    H("HH"),
    H_m("HH:mm"),
    H_m_s("HH:mm:ss"),
    H_m_s_S("HH:mm:ss SSS"),
    m("mm"),
    m_s("mm:ss"),
    m_s_S("mm:ss SSS"),
    s("ss"),
    s_S("ss SSS"),
    S("SSS"),
    y__M__d("yyyy_MM_dd"),
    yMd("yyyyMMdd"),
    yMd_H_m("yyyyMMdd HH:mm"),
    ylMld_H_m("yyyy/MM/dd HH:mm");

    private String datePattern;

    DateUtils(String datePattern) {
        this.datePattern = datePattern;
    }

    private String getPattern() {
        return this.datePattern;
    }

    /**
     * 根据日期类型获取字符串类型
     *
     * @param date
     * @return
     */
    public String getFormatDate(Date date) {
        String datePattern = this.getPattern();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        String result = simpleDateFormat.format(date);
        return result;
    }

    /**
     * 根据字符串类型获取日期类型
     *
     * @param date
     * @return
     */
    public Date getDateFromStr(String date) {
        String datePattern = this.getPattern();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        Date formateDate = null;
        try {
            formateDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formateDate;
    }

    /**
     * 根据日期获取是周几
     * 转换今天和明天
     *
     * @param date
     * @return
     */
    public String getDayForWeek(String date) {
        String datePattern = this.getPattern();
        SimpleDateFormat format = new SimpleDateFormat(datePattern);
        Date tmpDate = null;
        try {
            tmpDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(getDateFromStr(date));

        int weekNum = calendar.get(Calendar.DAY_OF_WEEK);
        String weekStr = null;
        switch (weekNum) {
            case 1:
                weekStr = "周日";
                break;
            case 2:
                weekStr = "周一";
                break;
            case 3:
                weekStr = "周二";
                break;
            case 4:
                weekStr = "周三";
                break;
            case 5:
                weekStr = "周四";
                break;
            case 6:
                weekStr = "周五";
                break;
            case 7:
                weekStr = "周六";
                break;
        }

        /**
         * 判断日期是不是当天日期
         */
        if (date.equals(getFormatDate(new Date()))) {
            weekStr = "今天";
        }

        /**
         * 判断日期是不是明天
         */
        calendar.add(Calendar.DATE, -1);
        if (getFormatDate(calendar.getTime()).equals(getFormatDate(new Date()))) {
            weekStr = "明天";
        }

        return weekStr;
    }

    /**
     * 根据日期获取是周几
     * 不转换今天和明天
     *
     * @param date
     * @return
     */
    public String getDayForWeekUnhandle(String date) {
        String datePattern = this.getPattern();
        SimpleDateFormat format = new SimpleDateFormat(datePattern);
        Date tmpDate = null;
        try {
            tmpDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(getDateFromStr(date));

        int weekNum = calendar.get(Calendar.DAY_OF_WEEK);
        String weekStr = null;
        switch (weekNum) {
            case 1:
                weekStr = "周日";
                break;
            case 2:
                weekStr = "周一";
                break;
            case 3:
                weekStr = "周二";
                break;
            case 4:
                weekStr = "周三";
                break;
            case 5:
                weekStr = "周四";
                break;
            case 6:
                weekStr = "周五";
                break;
            case 7:
                weekStr = "周六";
                break;
        }

        return weekStr;
    }

    /**
     * 根据传入日期和调整幅度获取加几天或减几天后的日期
     * 正数加，负数减
     *
     * @param date
     * @param count
     * @return
     */
    public String getAddOrRedDate(String date, int count) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(getDateFromStr(date));
        calendar.add(Calendar.DATE, count);
        String dateResult = getFormatDate(calendar.getTime());

        return dateResult;
    }

    /**
     * 根据传入日期和调整幅度获取加几天或减几天后的日期
     * 正数加，负数减
     *
     * @param date
     * @param count
     * @return
     */
    public String getAddOrRedDate(Date date,int count){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, count);
        String dateResult = getFormatDate(calendar.getTime());

        return dateResult;
    }

    /**
     * <p>
     * 推荐通过 y_M_d_H_m_s 调用
     * 根据传入开始时间、结束时间和步幅获取时间列表 list<String>,格式根据入参样式决定 dateUtilsPattern  例：DateUtils.H_m
     * 如果增加步幅大于结束时间，不返回增加步幅后的数据
     * 步幅以秒计算
     * </p>
     *
     * @return
     */
    public List<String> getDateListByInterval(String beginDate, String endDate, int intervalTimeSec, DateUtils dateUtilsPattern) {
        String datePattern = this.getPattern();
        SimpleDateFormat format = new SimpleDateFormat(datePattern);

        Date beginDateTime = null;
        Date endDateTime = null;
        try {
            beginDateTime = format.parse(beginDate);
            endDateTime = format.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<String> list = new ArrayList<String>();

        Calendar calendar = new GregorianCalendar();

        while (beginDateTime.getTime() <= endDateTime.getTime()) {
            list.add(dateUtilsPattern.getFormatDate(beginDateTime));

            calendar.setTime(beginDateTime);
            calendar.add(Calendar.SECOND, intervalTimeSec);

            beginDateTime = calendar.getTime();
        }

        return list;
    }

    /**
     * 推荐通过 y_M_d_H_m_s 调用
     *
     * 按照步幅分隔，查找比入参时间大的点
     * 步幅精度为毫秒,最大步幅为天：24*60*60*1000
     *
     * @param dateTimeStr
     * @return
     */
    public Date getHalfHourByDatetime(String dateTimeStr, long intervalTimeMilSec) {
        String datePattern = this.getPattern();
        SimpleDateFormat format = new SimpleDateFormat(datePattern);

        Date dateTime = null;
        try {
            dateTime = format.parse(dateTimeStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date dayDateTime = DateUtils.y_M_d.getDateFromStr(DateUtils.y_M_d.getFormatDate(dateTime));
        Date hourDateTime = DateUtils.y_M_d_H.getDateFromStr(DateUtils.y_M_d_H.getFormatDate(dateTime));
        //小时
        Integer hourTime = Integer.parseInt(DateUtils.H.getFormatDate(dateTime));
        Date minuteDateTime = DateUtils.y_M_d_H_m.getDateFromStr(DateUtils.y_M_d_H_m.getFormatDate(dateTime));
        //分钟
        Integer minuteTime = Integer.parseInt(DateUtils.m.getFormatDate(dateTime));
        Date secondDateTime = DateUtils.y_M_d_H_m_s.getDateFromStr(DateUtils.y_M_d_H_m_s.getFormatDate(dateTime));
        //秒
        Integer secTime = Integer.parseInt(DateUtils.s.getFormatDate(dateTime));
        Date milSecondDateTime = DateUtils.y_M_d_H_m_s_S.getDateFromStr(DateUtils.y_M_d_H_m_s_S.getFormatDate(dateTime));
        //毫秒
        Integer milSecTime = Integer.parseInt(DateUtils.S.getFormatDate(dateTime));

        long dayDateInterval = 24 * 60 * 60 * 1000;
        long hourDateInterval = 60 * 60 * 1000;
        long minuteDateInterval = 60 * 1000;
        long secondDateInterval = 1000;
        long milSecondDateInterval = 1;

        /**
         * 根据intervalTimeMilSec步幅生成离dateTimeStr最近的大于当前时间的基于步幅生成的时间
         */
        long resultDateTimeLong = 0;

        if (intervalTimeMilSec >= dayDateInterval) {
            resultDateTimeLong = dayDateTime.getTime() + intervalTimeMilSec;

        } else if (intervalTimeMilSec < dayDateInterval && intervalTimeMilSec >= hourDateInterval) {
            long count = (BigDecimal.valueOf(hourTime*60*60*1000).divideToIntegralValue( BigDecimal.valueOf(intervalTimeMilSec)).longValue()) + 1;
            resultDateTimeLong = dayDateTime.getTime() + (BigDecimal.valueOf(intervalTimeMilSec).multiply(BigDecimal.valueOf(count)).longValue());

        } else if (intervalTimeMilSec < hourDateInterval && intervalTimeMilSec >= minuteDateInterval) {
            long count = (BigDecimal.valueOf(minuteTime*60*1000).divideToIntegralValue(BigDecimal.valueOf(intervalTimeMilSec)).longValue()) + 1;
            resultDateTimeLong = hourDateTime.getTime() + (BigDecimal.valueOf(intervalTimeMilSec).multiply(BigDecimal.valueOf(count)).longValue());

        } else if (intervalTimeMilSec < minuteDateInterval && intervalTimeMilSec >= secondDateInterval) {
            long count = (BigDecimal.valueOf(secTime*1000).divideToIntegralValue(BigDecimal.valueOf(intervalTimeMilSec)).longValue()) + 1;
            resultDateTimeLong = minuteDateTime.getTime() + (BigDecimal.valueOf(intervalTimeMilSec).multiply(BigDecimal.valueOf(count)).longValue());

        } else if (intervalTimeMilSec < secondDateInterval && intervalTimeMilSec >= milSecondDateInterval) {
            long count = (BigDecimal.valueOf(milSecTime).divideToIntegralValue(BigDecimal.valueOf(intervalTimeMilSec)).longValue()) + 1;
            resultDateTimeLong = secondDateTime.getTime() + (BigDecimal.valueOf(intervalTimeMilSec).multiply(BigDecimal.valueOf(count)).longValue());
        }else if(intervalTimeMilSec <=1){
            resultDateTimeLong = milSecondDateTime.getTime();
        }

        Date date = new Date(resultDateTimeLong);

        return date;
    }

    /**
     * 根据日期返回当前日期零点时间
     *
     * @param date
     * @return
     */
    public Date getZeroDate(Date date) {
        String zeroStr = DateUtils.y_M_d.getFormatDate(date);
        zeroStr = zeroStr + " 00:00:00";
        Date zeroDate = DateUtils.y_M_d_H_m_s.getDateFromStr(zeroStr);
        return zeroDate;
    }

    public static void main(String[] args) {
        /*Date date = new Date();
        System.out.println(DateUtils.y_M_d.getFormatDate(date));
        System.out.println(DateUtils.ylMld_H_m.getFormatDate(date));
        System.out.println(DateUtils.y__M__d.getFormatDate(date));
        System.out.println(DateUtils.y_M_d_H_m_s_S.getDateFromStr(DateUtils.y_M_d_H_m_s_S.getFormatDate(date)));
        System.out.println(DateUtils.y_M_d_H_m_s.getDateFromStr("2017-11-05 07:30:00"));
        System.out.println(DateUtils.y_M_d.getAddOrRedDate("2017-11-09", 0));
        System.out.println(JSON.toJSONString(DateUtils.y_M_d_H_m_s.getDateListByInterval("2018-03-08 16:00:00", "2018-03-09 00:00:00", 30 * 60, DateUtils.H_m_s)));*/

        System.out.println(DateUtils.y_M_d_H_m_s_S.getFormatDate(DateUtils.y_M_d_H_m_s_S.getHalfHourByDatetime(DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()),30*1000)));
    }
}
