package com.lovecyy.dynamic.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;


public class User  extends BasePojo{

    private static final long serialVersionUID = -2626351931023926014L;
    private Integer userId;
    private String loginName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
