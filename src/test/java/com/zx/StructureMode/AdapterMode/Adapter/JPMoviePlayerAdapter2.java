package com.zx.StructureMode.AdapterMode.Adapter;

import com.zx.StructureMode.AdapterMode.Player;
import com.zx.StructureMode.AdapterMode.Translator;
import com.zx.StructureMode.AdapterMode.Zh_JPTranslator;

/**
 * 组合方式:对象结构模型，适配器转换到了翻译器的功能
 */
public class JPMoviePlayerAdapter2  implements Player {
    //被适配的对象
    private Player target;
    //组合的方式
    private Translator translator = new Zh_JPTranslator();

    public JPMoviePlayerAdapter2(Player target) {
        this.target = target;
    }
    @Override
    public String play() {
        String play = target.play();
        //准换字幕
        String translate = translator.translate(play);
        System.out.println("日文："+translate);
        return play;
    }
}
