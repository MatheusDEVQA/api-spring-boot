package com.springboot.springboot.handler;

import java.util.Date;

public class ResponseError {


    private Date stampDate = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;

    public Date getStampDate() {
        return stampDate;
    }

    public void setStampDate(Date strampDate) {
        this.stampDate = strampDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
