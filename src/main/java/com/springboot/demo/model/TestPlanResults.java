package com.springboot.demo.model;

import java.util.concurrent.TimeUnit;

public class TestPlanResults {

    private String planid;
    private String planname;
    private String createdtime;
    private String endtime;
    private String executiontime;
    private String passcount;
    private String failcount;
    private String skipcount;
    private String totaltests;

    public String getPlanid() {
        return planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid;
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getExecutiontime() {
        return executiontime;
    }

    public void setExecutiontime(String executiontime) {
        Long l=TimeUnit.MILLISECONDS.toMinutes(Long.valueOf(executiontime));
        this.executiontime = l.toString();
    }

    public String getPasscount() {
        return passcount;
    }

    public void setPasscount(String passcount) {
        this.passcount = passcount;
    }

    public String getFailcount() {
        return failcount;
    }

    public void setFailcount(String failcount) {
        this.failcount = failcount;
    }

    public String getSkipcount() {
        return skipcount;
    }

    public void setSkipcount(String skipcount) {
        this.skipcount = skipcount;
    }

    public String getTotaltests() {
        return totaltests;
    }

    public void setTotaltests(String totaltests) {
        this.totaltests = totaltests;
    }


}
