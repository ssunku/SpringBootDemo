package com.springboot.demo.model;

public class TestCaseResults {


    public String planid;
    public String username;
    public String buildversion;
    public String classname;
    public String methodname;
    public String result;
    public String exception;
    public String executiontime;
    public String message;
    public String failure_log;



    public String getPlanid() {
        return planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBuildversion() {
        return buildversion;
    }

    public void setBuildversion(String buildversion) {
        this.buildversion = buildversion;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getExecutiontime() {
        return executiontime;
    }

    public void setExecutiontime(String executiontime) {
        this.executiontime = executiontime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFailure_log() {
        return failure_log;
    }

    public void setFailure_log(String failure_log) {
        this.failure_log = failure_log;
    }



}
