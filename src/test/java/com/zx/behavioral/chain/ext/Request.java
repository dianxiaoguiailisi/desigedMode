package com.zx.behavioral.chain.ext;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Request {
    String msg;
    public Request(String msg) {
        this.msg = msg;
    }

}
