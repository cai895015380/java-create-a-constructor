package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat("Black"));
        System.out.println(new Cat("White"));
    }

    public Cat(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
