package com.fsd.controller;

import com.fsd.data.entity.IpoEntity;
import com.fsd.data.mapper.IpoMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("admin/ipo")
public class AdminIpoController {

    private IpoMapper ipoMapper;
    private AdminIpoController(IpoMapper ipoMapper){
        this.ipoMapper=ipoMapper;
    }
    @GetMapping("list")
    private List<IpoEntity> getIpoList(){
        return ipoMapper.listIpo();
    }
}
