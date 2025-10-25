package com.zx.StructureMode.AdapterMode.Adapter;

import com.zx.StructureMode.AdapterMode.Player;
import com.zx.StructureMode.AdapterMode.Zh_JPTranslator;

/**
 * 继承方式:类结构模型，适配器转换到了翻译器的功能
 */
public class JPMoviePlayerAdapter1  extends Zh_JPTranslator implements Player {
    //被适配的对象
    private Player target;

    public JPMoviePlayerAdapter1(Player target) {
        this.target = target;
    }
    @Override
    public String play() {
        String play = target.play();
        //准换字幕
        String translate = translate(play);
        System.out.println("日文："+translate);
        return play;
    }
}
