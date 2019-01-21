package com.jk.service.impl;

import com.jk.bean.Class1;
import com.jk.bean.Class2;
import com.jk.bean.TradeMark;
import com.jk.mapper.StockMapper;
import com.jk.service.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockServiceImpl implements StockService{

    @Resource
    private StockMapper stockMapper;

    @Override
    public List<Class1> queryClass1() {
        return stockMapper.queryClass1();
    }

    @Override
    public List<Class2> getClass2ByFlbh1(Integer id) {
        return stockMapper.getClass2ByFlbh1(id);
    }

    @Override
    public List<TradeMark> getTradeMarkById(Integer id) {
        return stockMapper.getTradeMarkById(id);
    }

}
