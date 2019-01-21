package com.jk.service;

import com.jk.bean.Class1;
import com.jk.bean.Class2;
import com.jk.bean.TradeMark;

import java.util.List;

public interface StockService {
    List<Class1> queryClass1();

    List<Class2> getClass2ByFlbh1(Integer id);

    List<TradeMark> getTradeMarkById(Integer id);
}
