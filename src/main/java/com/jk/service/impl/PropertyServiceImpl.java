package com.jk.service.impl;
import com.jk.bean.Attribute;
import com.jk.mapper.PropertyMapper;
import com.jk.service.PropertyService;
import com.jk.util.PageUtil;
import com.jk.util.ResultPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Resource
    PropertyMapper propertyMapper;

    @Override
    public ResultPage queryListAttribute(Integer rows, Integer page, Attribute attribute) {
        ResultPage resultPage = new ResultPage();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("Attribute", attribute);
        int count = propertyMapper.queryListToTalCount(hashMap);
        PageUtil<Attribute> pageUtil = new PageUtil<>(count, page, rows);
        hashMap.put("start", pageUtil.getStartIndex());
        hashMap.put("end", pageUtil.getEndIndex());
        List<Attribute> attribute1 = propertyMapper.queryListAttribute(hashMap);
        resultPage.setRows(attribute1);
        resultPage.setTotal(count);
        return resultPage;
    }

}
