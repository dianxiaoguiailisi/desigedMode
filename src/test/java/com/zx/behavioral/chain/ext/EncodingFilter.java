package com.zx.behavioral.chain.ext;

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.msg+="00000";
        System.out.println("EncodingFilter.doFilter之前");
        chain.doFilter(request,response,chain);
        System.out.println("EncodingFilter.doFilter之后");
    }
}
