package com.zx.StructureMode.Proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkTiktokProxy<T> implements InvocationHandler {
    private T target;
    //接收被代理对象
    public JdkTiktokProxy(T target) {
        this.target = target;
    }

    /**
     * 获取被代理对象的代理对象
     * @param t 被代理对象
     * @return
     * @param <T> 代理对象
     */
    public static<T> T getProxy(T t){
        /**
         * ClassLoader loader：当前被代理对象的类加载器（从哪里加载）
         * Class<?>[] interfaces：当前被代理对象所实现的所有接口
         *  InvocationHandler h：当前被代理对象执行目标方法时候，使用h可以定义拦截增强方法
         */
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new JdkTiktokProxy(t));
        return (T) o;
    }

    /**定义目标方法的拦截逻辑，每一个方法都会进来
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强
        System.out.println("=========前置增强=======");
        //反射执行
        Object invoke = method.invoke(target, args);
        //增强
        System.out.println("======后置增强======");
        return invoke;//返回原方法返回值
    }
}
