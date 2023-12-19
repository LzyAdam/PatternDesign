package com.Map.hashmap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        //数组加链表
        //put 添加和修改都是它
        map.put("a",1);
        map.put("b",2);
        map.put("c",4);
        map.put("a",2);//key相等会覆盖 存储的键值对没有重复 {a=2, b=2, c=4}
        System.out.println(map);
        //get 查询 key
        System.out.println(map.get("c"));//4
        //remove删除 两种remove
        map.remove("b",2);
        System.out.println(map);
        map.remove("a");
        System.out.println(map);
        //{a=2, c=4}





    }
}
