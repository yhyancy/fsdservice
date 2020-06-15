package com.fsd.controller.comparecompany;

import com.fsd.data.entity.singleCompare.SingleInputEntity;
import com.fsd.data.entity.singleCompare.SingleOutputEntity;
import com.fsd.data.mapper.StockchartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("compare/company")
@CrossOrigin("*")
public class CompanyController {
    private StockchartMapper stockchartMapper;
    public static final String TIME_FULL_SPRIT = "yyyy-MM-dd HH:mm:ss";

    @Autowired
    private CompanyController(StockchartMapper stockchartMapper) {
        this.stockchartMapper = stockchartMapper;
    }

    @PostMapping("single")
    public SingleOutputEntity getSingleCompanyPrices(@RequestBody(required = true) SingleInputEntity singleInputEntity) {
        singleInputEntity.setCode(stockchartMapper.getCompanyCode(singleInputEntity.getName()));
        return new SingleOutputEntity(singleInputEntity.getName(), stockchartMapper.getPrice1(singleInputEntity),
                stockchartMapper.getPrice2(singleInputEntity));
    }

//    @PostMapping("muiti")
//    public OutputEntity getMultiCompanyPrices(@RequestBody(required = true) InputEntity inputEntity){
//        inputEntity.setCode(stockchartMapper.getCompanyCode());
//    }

}
