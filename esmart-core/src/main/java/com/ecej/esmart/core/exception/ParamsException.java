package com.ecej.esmart.core.exception;

public class ParamsException extends RuntimeException {

    public ParamsException() {
        super();
    }


    public ParamsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public ParamsException(String message, Throwable cause) {
        super(message, cause);
    }


    public ParamsException(String message) {
        super(printErr(message));
    }


    public ParamsException(Throwable cause) {
        super(cause);
    }


    private static String printErr(String string) {
        return "参数错误，" + string + "，请重新确认";
    }

}
