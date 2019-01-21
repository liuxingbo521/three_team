package com.jk.controller;

import com.jk.bean.Class1;
import com.jk.bean.Class2;
import com.jk.bean.TradeMark;
import com.jk.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("stock")
public class StockController {


    @Resource
    private StockService stockService;

    /**
     * 查询第一层类别
     * @return
     */
    @ResponseBody
    @RequestMapping("queryClass1")
    public List<Class1> queryClass1(){
        return stockService.queryClass1();
    }

    /**
     * 查询第2层类别
     * @return
     */
    @ResponseBody
    @RequestMapping("getClass2ByFlbh1")
    public List<Class2> getClass2ByFlbh1(Integer id){
        return stockService.getClass2ByFlbh1(id);
    }

    /**
     * 查询品牌
     * @return
     */
    @ResponseBody
    @RequestMapping("getTradeMarkById")
    public List<TradeMark> getTradeMarkById(Integer id){
        return stockService.getTradeMarkById(id);
    }

}
