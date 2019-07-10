package com.lovecyy.dynamic.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class User {
    private Integer userId;
    private String loginName;
}
