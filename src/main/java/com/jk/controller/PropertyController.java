package com.jk.controller;

import com.jk.bean.Attribute;
import com.jk.service.PropertyService;
import com.jk.util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("attr")
public class PropertyController {

   @Autowired
   private PropertyService propertyService;

   /**
    * 查询属性值
    * @param attribute
    * @return
    */
   @RequestMapping("queryListAttribute")
   @ResponseBody
   public ResultPage queryListAttribute(Integer rows, Integer page,Attribute attribute){

      return propertyService.queryListAttribute(rows, page,attribute);
   }


}
