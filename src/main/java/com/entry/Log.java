package com.entry;

import java.util.Date;
import javax.persistence.*;

public class Log {
    @Id
    @Column(name = "log_id")
    private String logId;

    @Column(name = "log_user")
    private String logUser;

    @Column(name = "log_time")
    private Date logTime;

    @Column(name = "log_ip")
    private String logIp;

    @Column(name = "log_action")
    private String logAction;

    /**
     * @return log_id
     */
    public String getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(String logId) {
        this.logId = logId;
    }

    /**
     * @return log_user
     */
    public String getLogUser() {
        return logUser;
    }

    /**
     * @param logUser
     */
    public void setLogUser(String logUser) {
        this.logUser = logUser;
    }

    /**
     * @return log_time
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * @param logTime
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    /**
     * @return log_ip
     */
    public String getLogIp() {
        return logIp;
    }

    /**
     * @param logIp
     */
    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    /**
     * @return log_action
     */
    public String getLogAction() {
        return logAction;
    }

    /**
     * @param logAction
     */
    public void setLogAction(String logAction) {
        this.logAction = logAction;
    }
}