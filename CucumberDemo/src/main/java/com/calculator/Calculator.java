package com.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<Integer> numList = null;

    Integer result = 0;

    public Calculator(){
        numList = new ArrayList<Integer>();
    }


    public void add(Integer num){
        numList.add(num);
    }

    public void clear(){
        numList.clear();
    }

    public Integer getResult(){
        if(numList==null){
            return result;
        }
        for(Integer num : numList){
            result += num;
        }
        return result;
    }
}
