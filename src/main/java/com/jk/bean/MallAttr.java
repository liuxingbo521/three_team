package com.jk.bean;

import lombok.Data;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
@Data
public class MallAttr {
    Integer id;
    String shxm_mch;
    Integer shfqy;
    Integer flbh2;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    Date chjshj;
}
