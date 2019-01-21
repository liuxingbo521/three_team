package com.jk.mapper;

import com.jk.bean.Class1;
import com.jk.bean.Class2;
import com.jk.bean.TradeMark;

import java.util.List;

public interface StockMapper {
    /**
     * 查询一级
     * @return
     */
    List<Class1> queryClass1();

    /**
     * 查询2级
     * @return
     */
    List<Class2> getClass2ByFlbh1(Integer id);

    /**
     * 根据id查询品牌数据
     * @return
     */
    List<TradeMark> getTradeMarkById(Integer id);
}
