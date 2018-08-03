package com.haomostudio.SpringMVCTemplate.common.domain;
import java.io.Serializable;
/**
 *
 *
 * @author 崔弈凡
 * @date 2018-08-02 20:35:40
 */
public class AuthToken implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private String id;
    //
    private String userId;
    //
    private String token;
    //
    private String createTime;
    //
    private String validTime;

    /**
     * 设置：
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取：
     */
    public String getId() {
        return id;
    }
    /**
     * 设置：
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * 获取：
     */
    public String getUserId() {
        return userId;
    }
    /**
     * 设置：
     */
    public void setToken(String token) {
        this.token = token;
    }
    /**
     * 获取：
     */
    public String getToken() {
        return token;
    }
    /**
     * 设置：
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    /**
     * 获取：
     */
    public String getCreateTime() {
        return createTime;
    }
    /**
     * 设置：
     */
    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }
    /**
     * 获取：
     */
    public String getValidTime() {
        return validTime;
    }
}
