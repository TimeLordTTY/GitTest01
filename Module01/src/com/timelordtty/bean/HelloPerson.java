package com.timelordtty.bean;


import com.timelordtty.java.Hello;

import java.util.ArrayList;
import java.util.Date;

public class HelloPerson {
    private static final int finalint = 10;
    private static int number;

    //模板六：prsf 可生成私有静态常量private static final
    private static final Hello HELLO = new Hello();
    //变形 psf/psfi/psfs
    //psf 公有静态常量 public static final
    public static final int NUM = 1;
    //psfi 公有int类型常量 public static final int
    public static final int NUM2 =2;
    //psfs 公有String类型常量 public static final String
    public static final String STR = "s";


    public void show() {
        //region Description
        Person person = new Person("tty", 10);
        ArrayList list = new ArrayList();
        System.out.println("Hello" + person.getName());
        //endregion
        sleep();

    }

    //模板一：psvm main函数
    public static void main(String[] args) {
        //模板二：sout 输出函数
        System.out.println("hello");
        //sout变形：soutp/soutm/soutv/xxx.sout
        //soutp 输出形参的输出语句
        System.out.println("args = [" + args + "]");
        //soutm 输出当前的方法名
        System.out.println("HelloPerson.main");
        //soutv 输出最近设置的变量
        int num = 10;
        System.out.println("num = " + num);
        //xxx.sout
        System.out.println(num);

        //模板三：fori for循环
        String[] arr = new String[]{"A","B","C"};
//        for (int i = 0; i < ; i++) {
//
//        }
        //fori变形:iter/itar
        //iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //itar 普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        //模板四：list.for list的增强for循环
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {

        }
        //list.for变形 list.fori/list.forr
        //list.fori 正向遍历
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


        //模板五：ifn 判断最近的变量是否是null
        ArrayList list2 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        if (list == null) {

        }
        //ifn变形 inn/xxx.nn/xxx.null
        //inn 判断最近的变量是否不是null
        if (list2 != null) {
            
        }
        //xxx.nn 指定的变量
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }
    }


    public void eat() {
        ArrayList arraylist = null;
        Date date = new Date();
        arraylist.add(0, new Person());

    }

    public static void sleep() {
    }
}
