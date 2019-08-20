package com.ecej.esmart.core.utils;

import java.util.UUID;

public class UuidUtils {
    /**
     * 生成uuid
     * @return 返回生成的uuid
     */
    public static String getUuid(){
        return  UUID.randomUUID().toString().replace("-", "");
    }
}
