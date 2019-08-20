package com.ecej.esmart.model.po;

public class ResultModel<T> implements java.io.Serializable {

    private static final long serialVersionUID = 4480899038005612787L;
    private String retCode;
    private String retMsg;
    private Integer detailCode;
    private String  detailMsg;
    private T result;

    public Integer getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(Integer detailCode) {
        this.detailCode = detailCode;
    }

    public String getDetailMsg() {
        return detailMsg;
    }

    public void setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
    }

    public ResultModel(){
    }
    public ResultModel(String retCode, String retMsg){
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public ResultModel(String retCode, String retMsg, T result) {
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.result = result;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
