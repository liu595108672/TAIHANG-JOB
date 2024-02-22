package com.xxl.job.admin.core.vo;


/**
 * @author: LiuZhaoYang
 * @create-date: 2024/2/4
 */
public class UpdateJobCronVo {

    private String executorHandler;

    private String cronStr;

    private String tpiAppName;

    public String getExecutorHandler() {
        return executorHandler;
    }

    public void setExecutorHandler(String executorHandler) {
        this.executorHandler = executorHandler;
    }

    public String getCronStr() {
        return cronStr;
    }

    public void setCronStr(String cronStr) {
        this.cronStr = cronStr;
    }

    public String getTpiAppName() {
        return tpiAppName;
    }

    public void setTpiAppName(String tpiAppName) {
        this.tpiAppName = tpiAppName;
    }
}
