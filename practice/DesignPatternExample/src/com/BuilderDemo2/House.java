package com.BuilderDemo2;

import com.Builder.Phone;

public class House {
    private String door;
    private String wall;
    private House(Builder builder){
        this.door=builder.door;
        this.wall=builder.wall;

    }

    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", wall='" + wall + '\'' +
                '}';
    }

    public static final class Builder {
        private String door;
        private String wall;
        Builder door(String door){
            this.door=door;
            return this;
        }
        Builder wall(String wall){
            this.wall=wall;
            return this;
        }
        House create(){
            return new House(this);
        }

    }


}

