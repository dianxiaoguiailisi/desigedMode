package com.zx.behavioral.chain;

import lombok.Setter;

@Setter

public  class Teacher {
    private  String name;
    public  Teacher(String name){
        this.name=name;
    }
    //1.
    private Teacher next;//下一个处理的老师:链条的引用

    public void handlerRequest(){
        System.out.println(this+"正在处理。。。。");
        //2.
        if(next!=null){
            //下一个继续
            next.handlerRequest();
        }

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
