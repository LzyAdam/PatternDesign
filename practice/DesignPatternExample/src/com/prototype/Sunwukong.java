package com.prototype;

import java.util.ArrayList;

public class Sunwukong implements Cloneable {
    public ArrayList<Skill> skillList;
    private String name;
    private int age;
    public Object clone(){
        Sunwukong copy=null;
        try {
            copy= (Sunwukong) super.clone();
            copy.skillList = new ArrayList<>(this.skillList);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return copy;
    }


    public ArrayList<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(ArrayList<Skill> skillList) {
        this.skillList = skillList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
