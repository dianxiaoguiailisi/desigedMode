package com.zx.behavioral.chain.ext;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    int cursor = 0;
    //filter链条
    List<Filter> filterChains = new ArrayList<>();
    //目标方法
    My target;

    public void setTarget(My target) {
        this.target = target;
    }

    public My getTarget() {
        return target;
    }

    public void addFilter(Filter filter) {
        filterChains.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if(cursor<filterChains.size()){//油标小于总数量filter，一直往下执行
            //执行第一个filter，依次往下
            Filter filter = filterChains.get(cursor);
            cursor++;
            //执行filter
            filter.doFilter(request,response,chain);
        }else {
            //filter执行完后执行目的方法
            target.hello();
        }

    }
}
