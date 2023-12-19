package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sunwukong sunwukong=new Sunwukong();
        sunwukong.setAge(10);
        sunwukong.setName("Adam");
        Skill skill1=new Skill("fly",85);
        Skill skill2=new Skill("swim",185);
        List<Skill>skillList=new ArrayList<>();
        skillList.add(skill1);
        skillList.add(skill2);
        sunwukong.setSkillList((ArrayList<Skill>) skillList);
        Sunwukong clone= (Sunwukong) sunwukong.clone();
        clone.setSkillList((ArrayList<Skill>) skillList);
        System.out.println(sunwukong);
        System.out.println(clone);
    }
}
