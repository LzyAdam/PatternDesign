package com.Set.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //不能存重复数据 不能查询只能遍历 不能改 hash算法让你找不到
        HashSet set = new HashSet();
//        set.add(1);
//        set.add(2);
//        set.add(1);
//        set.add(3);
//        set.add(4);
//        System.out.println(set);
//        set.remove(2);
//        System.out.println(set);
//        for (Object o:set){
//            System.out.println(o);
//        }
//        ArrayList list= new ArrayList<>();
//        list.add(1);
//        list.add(7);
//        list.add(7);
//        list.add(2);
//        list.add(9);
//        System.out.println(list);
        //add all method
//        set.addAll(list);
//        System.out.println(set);
//        System.out.println(set.toArray());
//        Object o=set.toArray();
//        System.out.println(o);
//        User user1=new User();
//        user1.id=1001;
//        user1.name="Tom";
//        User user4=new User();
//        user4.id=1001;
//        user4.name="Tom";
//        //user1 and user4 is not the same when seeing hash code
//        User user2=new User();
//        user2.id=1002;
//        user2.name="Jack";
//        User user3=new User();
//        user3.id=1003;
//        user3.name="Rose";
//        set.add(user1);
//        set.add(user2);
//        set.add(user3);
//        set.add(user4);
//        System.out.println(set);
//        //[User{id=1003, name='Rose'}, User{id=1001, name='Tom'}, User{id=1002, name='Jack'}, User{id=1001, name='Tom'}]


        User1 user1=new User1();
        user1.id=1001;
        user1.name="Tom";
        User1 user4=new User1();
        user4.id=1001;
        user4.name="Tom";
        set.add(user1);
        set.add(user4);
        System.out.println(set);
        //[User{id=1001, name='Tom'}] 重写eqauls和hashcode



    }
}
class User{
    public int id;
    public String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class User1{
    public int id;
    public String name;

    @Override
    //类似于地址值。。。。。。。。
    public int hashCode() {
        return id;
    }

    @Override
    //判断属性相同
    public boolean equals(Object obj) {
        if (obj instanceof User1){
            User1 otherUser=(User1) obj;
            if(otherUser.id==this.id){
                if(otherUser.name.equals(this.name)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
