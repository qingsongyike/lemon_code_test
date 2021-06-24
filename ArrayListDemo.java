package com.lemon.day7.list;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        //创建
//        ArrayList list = new ArrayList();
//        System.out.println(list); //[]? ArrayList重写了tostring,println会调用参数

//        System.out.println(list.size());
//        list.add(1);
//        list.add("1000");
//        list.add(true);
//        System.out.println(list);

        //泛型：规定集合存储的数据类型,只支持引用数据类型（不允许基本数据类型）
//        ArrayList <String> list = new ArrayList<>();
//        list.add("564456");
//        list.add("afsdf");
//        System.out.println(list);

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(154);
        list.add(1111);
        list.add(1000);
        list.add(-1000);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(4));





    }
}
