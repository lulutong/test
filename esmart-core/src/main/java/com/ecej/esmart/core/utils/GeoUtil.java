package com.ecej.esmart.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GeoUtil {


    private static final Logger LOGGER = LoggerFactory.getLogger(GeoUtil.class);


    /**
     * 地球半径
     */
    public final static double EARTH_RADIUS = 6378.137;

    /**
     * 功能描述：计算两坐标之间的直线距离
     *
     * @param lng1 第一点经度
     * @param lat1 第一点纬度
     * @param lng2 第二点经度
     * @param lat2 第二点纬度
     * @return
     */
    public static double getDistance(double lng1, double lat1, double lng2, double lat2) {
        double radLat1 = lat1 * Math.PI / 180.0;
        double radLat2 = lat2 * Math.PI / 180.0;
        double a = radLat1 - radLat2;
        double b = lng1 * Math.PI / 180.0 - lng2 * Math.PI / 180.0;
        double s = 2 * Math.asin(Math.sqrt(
                Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = s * 1000; // 换算成米
        return s;
    }


    /**
     * 显示距离文字
     *
     * @param distance
     * @return
     */
    public String toDistanceText(double distance) {
        if (Double.compare(distance, 1) < 0) {
            return String.format("%.0f米", distance * 1000d);
        } else {
            return String.format("%.0f公里", distance);
        }
    }

    /**
     * <p>功能描述：判断任务的经纬度 是否在服务区域的多边形的范围内</p>
     *
     * @param point    点坐标，长度为2
     * @param polyline 多边形节点坐标，长度为2*n，其中n应大于或等于3，即至少为三角形
     * @return 返回值：值为1表示点在多边形范围内 ;返回值：值为0表示点在多边形边上;返回值：值为-1表示点不在多边形范围内。
     * @since JDK1.8
     * <p> 创建日期:2016年5月31日 上午9:54:29</p>
     * <p>更新日期:[日期YYYY-MM-DD][闫鹏磊][变更描述]</p>
     */
    public static int polygonIsContainPoint(double[] point, double[] polyline) {

        int result = -1, count = 0, pointcount = 0, tempI;
        try {

            double maxx = 0, minx = 0, maxy = 0, miny = 0;
            if (polyline != null) {
                int i;
                pointcount = polyline.length / 2;
                maxx = minx = polyline[0];
                maxy = miny = polyline[1];
                for (i = 0; i < pointcount; i++) {
                    tempI = i + i;
                    if (maxx < polyline[tempI])
                        maxx = polyline[tempI];
                    if (minx > polyline[tempI])
                        minx = polyline[tempI];
                    if (maxy < polyline[tempI + 1])
                        maxy = polyline[tempI + 1];
                    if (miny > polyline[tempI + 1])
                        miny = polyline[tempI + 1];
                }
            }
            if (point != null) {
                // 首先判断是否在面的外框范围内
                if (point[0] < minx || point[0] > maxx || point[1] < miny || point[1] > maxy) {
                    return result;
                } else {
                    int i, j;
                    j = pointcount - 1;
                    double[] point1, point2;
                    double tempValue;
                    for (i = 0; i < pointcount; i++) {
                        point1 = new double[2];
                        point2 = new double[2];
                        tempI = i + i;
                        point1[0] = polyline[tempI];
                        point1[1] = polyline[tempI + 1];
                        tempI = j + j;
                        point2[0] = polyline[tempI];
                        point2[1] = polyline[tempI + 1];
                        if ((point1[0] < point[0] && point2[0] >= point[0])
                                || (point2[0] < point[0] && point1[0] >= point[0])) {
                            tempValue = point1[1]
                                    + (point[0] - point1[0]) / (point2[0] - point1[0]) * (point2[1] - point1[1]);
                            if (tempValue < point[1]) {
                                count++;
                            } else if (tempValue == point[1]) {
                                count = -1;
                                break;
                            }
                        }
                        j = i;
                    }
                }
            }
            if (count == -1) {
                result = 0; // 点在线段上
            } else {
                tempI = count % 2;
                if (tempI == 0) // 为偶数
                {
                    result = -1;
                } else {
                    result = 1;
                }
            }

        } catch (Exception e) {
            LOGGER.error("判断点 是否在多边形的范围内失败" + e.getMessage());
        }

        return result;
    }

}

