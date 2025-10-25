package com.zx.StructureMode.AdapterMode;

/**
 * 电影播放器：
 */
public class MoviePlayer implements Player {
    @Override
    public String play() {
        System.out.println("正在播放：黑马程序员");
        String content = "你好";
        System.out.println(content);//打印输出字幕
        return content;
    }
}
