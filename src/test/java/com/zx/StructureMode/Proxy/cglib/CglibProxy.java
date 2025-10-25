package com.zx.StructureMode.Proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {
    public static<T> T createProxy(T t){
        //1.创建一个增强器
        Enhancer enhancer = new Enhancer();
        //2.设置要增强哪个类的功能，增强器为该类创建一个子类（此时可以获得父类（被代理类）的所有方法）
        enhancer.setSuperclass(t.getClass());
        //3.回调
        enhancer.setCallback( new MethodInterceptor() {

            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //编写拦截器逻辑
                System.out.println("======前置=======");
                Object o1 = methodProxy.invokeSuper(o, objects);
                System.out.println("======后置");
                return o1;
            }
        });
        Object proxy = enhancer.create();
        return (T) proxy;
    }
}
