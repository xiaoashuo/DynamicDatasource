package com.lovecyy.dynamic.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BasePojo implements Serializable {


    private static final long serialVersionUID = 8698229346830592846L;
    private Map<String,Object> params;

    public Map<String, Object> getParams() {
        if (params==null){
            return new HashMap<>();
        }
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
