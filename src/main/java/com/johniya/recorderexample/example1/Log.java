package com.johniya.recorderexample.example1;

public class Log {

    private String id;
    private Long time;
    private String uid;
    private String operate;
    private String target;
    private String beforeJson;
    private String afterJson;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getBeforeJson() {
        return beforeJson;
    }

    public void setBeforeJson(String beforeJson) {
        this.beforeJson = beforeJson;
    }

    public String getAfterJson() {
        return afterJson;
    }

    public void setAfterJson(String afterJson) {
        this.afterJson = afterJson;
    }

    public String toString() {
        return String.format("%s-[%s]-[%s]-[%s]", id, uid, operate, target);
    }

    public static class Operate {
        public static final String ADD = "ADD";
        public static final String UPDATE = "UPDATE";
        public static final String DELETE = "DELETE";
    }

    public static class Target {
        public static final String USER = "USER";
        public static final String PRODUCT = "PRODUCT";
    }
}
