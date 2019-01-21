package com.jk.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Sku {

    private Integer id;
    private Integer shpId;  //名称id
    private Integer kc;   //库存
    private Integer jg;  //价格
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date chjshj;   //创建时间
    private String skuMch;   //sku名字
    private Integer skuXl;   //销量
    private String kcdz;  //库存地址

}

