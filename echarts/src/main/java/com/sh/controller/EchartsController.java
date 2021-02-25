package com.sh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Deacription TODO
 * @Author 石晗
 * @Date 2020/12/20 9:33
 * @Version 1.0
 **/
@Controller
@RequestMapping("echartsController")
public class EchartsController {

    @RequestMapping("toEcharts")
    public String toEcharts(){
        return "echarts_demo2";
    }

    @RequestMapping("getData")
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>();
        String[] type = {"九儿","封夕","郭双","三元","灵儿","合欢"};
        int[] data = {19,29,39,49,59,69};
//        int[] data2 = {54,73,40,10,30,90};
        map.put("type",type);
        map.put("data",data);
//        map.put("data2",data2);
        return map;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
    }
}

