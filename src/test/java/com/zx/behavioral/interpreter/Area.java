package com.zx.behavioral.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * 环境类：风景区
 */
public class Area {
    Set<String> city =new HashSet<>();

    Set<String> type  =new HashSet<>();

    IDCardExpression idCardExpression;//表达式解析器


    //环境类持有表达式
    public Area(){
        //{"医生","老人","儿童"};
        //{"武汉市","上海市"};//免费城市
        city.add("武汉市");
        city.add("上海市");

        type.add("医生");
        type.add("老人");
        type.add("儿童");
        //最小解析
        TerminalExpression city = new TerminalExpression(this.city,":");
        //最小解析
        TerminalExpression type = new TerminalExpression(this.type,"-");

        //只要以上满足一个即可
        idCardExpression = new OrExpression(type,city);
    }

    /**
     * 传入表达式：判断当前表达式是否制定免费人群
     * @param ticket
     */
    public void getTicket(String ticket){
        boolean interpret = idCardExpression.interpret(ticket);
        if(interpret){
            System.out.println("免费通过");
        }else {
            System.out.println("请款");
        }
    }
}
