package com.jk.service;

import com.jk.bean.Attribute;
import com.jk.util.ResultPage;

public interface PropertyService {
    /**
     * 查询属性值表
     * @param rows
     * @param page
     * @param attribute
     * @return
     */
    ResultPage queryListAttribute(Integer rows, Integer page, Attribute attribute);

}
