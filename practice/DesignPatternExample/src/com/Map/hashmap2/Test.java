package com.Map.hashmap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key);
        }
        //a,b,c
        for(String key: keys){
            System.out.println(map.get(key));
        }
        //1,2,3
        //遍历的时候不可以删除数据不然 前面有三个 后面set有2个
        //咋办迭代器
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            if("b".equals(key)){
                iterator.remove();
            }
            System.out.println(map.get(key));
        }



    }
}
