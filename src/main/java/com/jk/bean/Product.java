package com.jk.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer Id;//(编号)           PKInteger
    private String shp_mch;//(商品名称)  String(100)
    private String shp_tp;//(商品图片)   String(100)
    private Integer flbh1;//(分类编号1)   Integer
    private Integer flbh2;//(分类编号2)   Integer
    private Integer pp_id;//(品牌id)      Integer
    private Date chjshj;//(创建时间)   Date
    private String shp_msh;//(商品描述)  String(1000)
}
