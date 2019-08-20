package com.ecej.esmart.core.utils;

import com.alibaba.fastjson.JSON;
import com.ecej.esmart.model.po.SnapshotLogPo;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class SnapshotUtils {

    private static final Logger log = LoggerFactory.getLogger(SnapshotUtils.class);

    public static void info(String guid, String workOrderNo, Integer requestSources, Integer operatorType, Integer contentType, Object... args) {
        if (operatorType == null || contentType == null || (guid == null && workOrderNo == null)) {
            return;
        }

        try {
            Date now = new Date();
            SnapshotLogPo snapshotLogPo = new SnapshotLogPo();
            snapshotLogPo.setGuid(guid);
            snapshotLogPo.setWorkOrderNo(workOrderNo);
            snapshotLogPo.setRequestSources(requestSources);
            snapshotLogPo.setContentType(contentType);
            snapshotLogPo.setOperatorType(operatorType);
            snapshotLogPo.setOperatorTime(now);
            snapshotLogPo.setArgs(args);
            snapshotLogPo.setExpireTime(DateUtils.addMonths(now, 4));

            String json = JSON.toJSONString(snapshotLogPo);
            log.info(json);
        } catch (Exception e) {
            log.error("快照工具类异常", e);
        }
    }
    
    /**
     * 描述: 
     * @author: yanpenglei
     * @create: 2018/7/17 18:40 
     */
    public static void info(SnapshotLogPo snapshotLogPo, Integer contentType, Object... args) {
        SnapshotUtils.info(snapshotLogPo.getGuid(), snapshotLogPo.getWorkOrderNo(), snapshotLogPo.getRequestSources(), 6, contentType, args);
    }


    public static void confirmInfo(String guid, String workOrderNo, Integer contentType, Object... args) {
        info(guid, workOrderNo, null, 6, contentType, args);
    }

    public static void confirmInfo(String guid, Integer contentType, Object... args) {
        info(guid, null, null, 6, contentType, args);
    }

    public static void releaseEnfo(String guid, String workOrderNo, Integer contentType, Object... args) {
        info(null, workOrderNo, null, 7, contentType, args);
    }
    // 改约，
    // 改派，
    // 派工，
    // 平台派单模式创建，
    // 平台抢单模式创建，
    // 平台周期订单创建，
    // 平台周期子订单创建，
    // 取消，
    // 完成
    // 拒单
}
