package com.zx.CreateMode.Singleton;

public class Person {
    private  String name;
    private  int age;
    //懒汉
    private volatile static Person instance;
    //构造器私有化外部不能实例化
    private Person(){
        System.out.println("Sing");
    }

    /** 对外的实例化方法
     *
     * @return
     */
    //1.使用synchronized类锁，但是类所效率低
    public static  synchronized Person getInstance1(){
        //如果没有再去创建实例
        if(instance==null){
            instance=new Person();//多线程问题
        }
        return instance;
    }
    //2.双重检查锁+内存可见性
    public static  Person getInstance2(){
        //如果没有再去创建实例
        if(instance==null){
            synchronized (Person.class){
                if(instance==null){
                    instance=new Person();//多线程问题
                }
            }
        }
        return instance;
    }
}
