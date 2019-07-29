package com.demo.amaze.login.controller;

import com.demo.amaze.login.entity.DataTable;
import com.demo.amaze.login.entity.Info;
import com.demo.amaze.login.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    InfoMapper infoMapper;
    @GetMapping("/aaa")
    public DataTable info(){
        List<Info> abc = infoMapper.findAll();
        int count =abc.size();
        int code = 0;
        String msg="";
        DataTable dataTable = new DataTable();
        dataTable.setCode(code);
        dataTable.setCount(count);
        dataTable.setMsg(msg);
        dataTable.setData(abc);

        return dataTable;
    }

    @GetMapping("/abc")
    public Map<String,List<Object>> cDemo(){
        Map<String,List<Object>> map = new HashMap();
        List<Info> list = infoMapper.chartsDemo();
        List<Object> n = new ArrayList<>();
        List<Object> s = new ArrayList<>();
        List<Object> m = new ArrayList<>();
        List<Object> w = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Info info = list.get(i);
            String name = info.getName();
            int score = Integer.parseInt(info.getScore());
            int mark = Integer.parseInt(info.getMark());
            int wealth = Integer.parseInt(info.getWealth());
            n.add(name);
            s.add(score);
            m.add(mark);
            w.add(wealth);

            map.put("name",n);
            map.put("score",s);
            map.put("mark",m);
            map.put("wealth",w);
        }

        return map;
    }
}
