package com.jk.mapper;

import com.jk.bean.Attribute;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface PropertyMapper {

    @Select("select count(*) from t_mall_value ")
    int queryListToTalCount(HashMap<String, Object> hashMap);

    List<Attribute> queryListAttribute(HashMap<String, Object> hashMap);

}
