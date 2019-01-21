package com.jk.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class SkuAttrValue implements Serializable {

    private Integer id;
    private Integer shxmId;  //属性名id
    private Integer shxzhId;   //属性值id
    private Integer shpId;  //商品id
    private String isSku;  //是否sku

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date chjshj;  //创建时间
    private Integer skuId;

}
