package com.zx.behavioral.interpreter;

import java.util.Set;

/**
 * 终结符表达式
 */
public class TerminalExpression extends IDCardExpression {
    IDCardExpression childExp;//子解析规则
    Set<String> data;
    String symbol;

    public TerminalExpression( Set<String> data, String symbol) {
        this.data = data;
        this.symbol = symbol;
    }
    @Override
    public boolean interpret(String expression) {
        //1.先按照指定符号分割
        String[] split = expression.split(symbol);
        for (String s : split) {
            if(data.contains(s)){//说明是免费的信息里面
                return true;
            }
        }
       // childExp.interpret(expression);//可以继续子解析
        return false;//不在免费行列
    }
}
