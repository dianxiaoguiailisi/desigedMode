package com.zx.behavioral.chain.ext;

import com.zx.behavioral.chain.Teacher;

public interface Filter {
    void doFilter(Request request, Response response,FilterChain chain);
}
