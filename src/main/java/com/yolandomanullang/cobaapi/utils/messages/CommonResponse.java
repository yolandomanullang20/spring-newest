package com.yolandomanullang.cobaapi.utils.messages;

import org.springframework.stereotype.Component;

@Component
public class CommonResponse<T> {
    private int status;
    private String message;
    private String detail;
    private T datas;

    public CommonResponse(int status, String message, String detail, T datas) {
        this.status = status;
        this.message = message;
        this.detail = detail;
        this.datas = datas;
    }

    public CommonResponse(){
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public T getDatas() {
        return datas;
    }

    public void setDatas(T datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", detail='" + detail + '\'' +
                ", datas=" + datas +
                '}';
    }
}
