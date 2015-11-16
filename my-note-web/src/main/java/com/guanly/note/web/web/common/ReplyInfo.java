package com.guanly.note.web.web.common;

/**
 * Created by guanly on 2015/10/21.
 */
public class ReplyInfo {
    Boolean success;

    Object data;

    public ReplyInfo(){}

    public ReplyInfo(Boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }



}
