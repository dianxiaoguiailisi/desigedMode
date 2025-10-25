package com.zx.behavioral.interpreter;

/**
 * 表达式解析器：身份信息表达式
 */
public  abstract class IDCardExpression {
    /**
     * 定义解析逻辑：
     * 假设解析到信息的格式：上海市:张翁-医生
     * 表达式中":"城市;"-"职业
     * @param expression
     * @return
     */
    abstract  public boolean interpret(String expression);
}
