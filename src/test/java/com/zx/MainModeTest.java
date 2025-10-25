package com.zx;

import com.apple.laf.AquaButtonBorder;
import com.sun.net.httpserver.Filter;
import com.zx.StructureMode.AdapterMode.Adapter.JPMoviePlayerAdapter2;
import com.zx.StructureMode.AdapterMode.MoviePlayer;
import com.zx.StructureMode.AdapterMode.Adapter.JPMoviePlayerAdapter1;
import com.zx.StructureMode.BridgeMode.OfflineSale;
import com.zx.StructureMode.BridgeMode.XiaoMiPhone;
import com.zx.CreateMode.Builder.AbstractBuilder;
import com.zx.CreateMode.Builder.Phone;
import com.zx.CreateMode.Builder.XiaoMiBuilder;
import com.zx.CreateMode.AbstractFactory.Mask.AbstractMask;
import com.zx.CreateMode.AbstractFactory.WuLinFactory;
import com.zx.CreateMode.AbstractFactory.Mask.MaskFactory.WuLinWuHanMaskFactory;
import com.zx.StructureMode.Proxy.cglib.CglibProxy;
import com.zx.StructureMode.Proxy.dynamic.JdkTiktokProxy;
import com.zx.StructureMode.decorator.LeiTikTok;
import com.zx.StructureMode.decorator.ManTikTok;
import com.zx.StructureMode.decorator.MeiYanDecorator;
import com.zx.StructureMode.flyweight.AbstractWaitressFlyweight;
import com.zx.StructureMode.flyweight.ZuDao;
import com.zx.behavioral.Visitor.UpdatePack;
import com.zx.behavioral.Visitor.XiaoAi;
import com.zx.behavioral.chain.Teacher;
import com.zx.behavioral.chain.ext.*;
import com.zx.behavioral.interpreter.Area;
import com.zx.behavioral.memento.LeiGamer;
import com.zx.behavioral.observer.HumanFans;
import com.zx.behavioral.observer.MMTikToker;
import com.zx.behavioral.observer.RobotFans;
import com.zx.behavioral.state.SKTTeam;
import com.zx.behavioral.state.VocationState;
import org.junit.Test;

public class MainModeTest {
    /**
     * 测试工厂模式
     */
    @Test
    public void test() {
        WuLinFactory wuLinFactory = new WuLinWuHanMaskFactory();
        AbstractMask mask = wuLinFactory.newMask();
        mask.protectedMe();
    }
    /**
     * 测试builder模式
     */
    @Test
    public void BuilderTest(){
        AbstractBuilder builder = new XiaoMiBuilder();
        Phone ph =builder.customMem("16G")
                    .customCpu("晓龙8888").customDisk("1 T").customCam("2亿").getProduct();
        System.out.println(ph.toString());
    }
    /**
     * 适配器模式：类结构模型
     */
    @Test
    public void AdapterTest1(){
        MoviePlayer player = new MoviePlayer();
        JPMoviePlayerAdapter1 adapter = new JPMoviePlayerAdapter1(player);
        adapter.play();
    }
    @Test
    public void AdapterTest2(){
        MoviePlayer player = new MoviePlayer();
        JPMoviePlayerAdapter2 adapter = new JPMoviePlayerAdapter2(player);
        adapter.play();
    }

    /**
     * 桥接模式
     */
    @Test
    public void BridgeTest(){
        XiaoMiPhone xiaoMiPhone = new XiaoMiPhone();
        xiaoMiPhone.setSale(new OfflineSale("线下",9999));

        String phone = xiaoMiPhone.getPhone();
        System.out.println(phone);
    }
    /**
     * 装饰器
     */
    @Test
    public void DecoratorTest(){
        ManTikTok  manTikTok= new LeiTikTok();
        MeiYanDecorator decorator = new MeiYanDecorator(manTikTok);
        decorator.tiktok();
    }
    /**
     * 代理模式
     */
    @Test
    public void DynamicProxyTest(){
        ManTikTok leiTikTok = new LeiTikTok();
        /**
         * 动态代理机制：JDK要求被代理的对象必须有接口
         */
        ManTikTok proxy = JdkTiktokProxy.getProxy(leiTikTok);
        proxy.tiktok();
    }
    @Test
    public void CglibProxyTest(){
        LeiTikTok leiTikTok = new LeiTikTok();
        LeiTikTok proxy = CglibProxy.createProxy(leiTikTok);
        proxy.tiktok();
    }
    /**
     * 享元模式
     */
    @Test
    public void FlyweightTest(){
        AbstractWaitressFlyweight waitress = ZuDao.getWaitress("");
        waitress.service();
        System.out.println(waitress);

        AbstractWaitressFlyweight waitress2 = ZuDao.getWaitress("");
        waitress2.service();
        System.out.println(waitress);

        waitress.end();//一号使用结束

        AbstractWaitressFlyweight waitress3 = ZuDao.getWaitress("");
        waitress3.service();

        System.out.println(waitress);

    }
    @Test
    public void StateTest(){
        SKTTeam sktTeam = new SKTTeam();
        sktTeam.setTeamState(new VocationState());
        sktTeam.startGame();
        sktTeam.startGame();
        //切换状态
        sktTeam.nextState();
        sktTeam.startGame();
    }
    @Test
    public void obsterverTest(){
        //主播1
        MMTikToker mmTikToker1 = new MMTikToker();
        //粉丝1
        HumanFans Fans = new HumanFans();
        Fans.setFansName("crazyfans");
        Fans.follow(mmTikToker1);//关注主播
        //主播开始卖货
        mmTikToker1.startSell();
        //粉丝1
        HumanFans humanFans = new HumanFans();
        humanFans.setFansName("zx");
        humanFans.follow(mmTikToker1);//关注主播

        RobotFans robotFans = new RobotFans();
        robotFans.setFansName("robot");
        robotFans.follow(mmTikToker1);
        System.out.println("=========");
        mmTikToker1.endSell();
    }
    @Test
    public  void MementoTest() throws Exception {
        LeiGamer  leiGamer = new LeiGamer();
        leiGamer.playGame();
        //第一个保存
        leiGamer.saveGameRecord();
        leiGamer.playGame();
        leiGamer.playGame();
        //第二次保存记录
        leiGamer.saveGameRecord();
        //恢复记录
        LeiGamer fromMemento = leiGamer.getFromMemento(1);
        leiGamer.setFlag(true);
        System.out.println(leiGamer.getFlag());
        fromMemento.playGame();
    }
    @Test
    public  void InterpreterTest(){
        Area area = new Area();
        String test = "扬州市:张旭-傻子";
        area.getTicket(test);
    }
    @Test
    public void VisitorTest(){
        XiaoAi xiaoAi = new XiaoAi();
        xiaoAi.answerQuestion();
        //升级
        UpdatePack updatePack = new UpdatePack();
        xiaoAi.acceptUpdate(updatePack);
        xiaoAi.answerQuestion();
    }
    @Test
    public void ChainTest(){
        Teacher zx = new Teacher("zx");
        Teacher xjy = new Teacher("xjy");
        Teacher hejie = new Teacher("hejie");
        //3.构造链条
        zx.setNext(xjy);
        xjy.setNext(hejie);
        //调用
        zx.handlerRequest();
    }

    /**
     * 1-2-3-my-3-2-1
     */
    @Test
    public void ChainFilterTest(){

        FilterChain filterChain = new FilterChain();
    //定义过滤器
        HttpFilter httpFilter = new HttpFilter();
        CharacterFilter characterFilter = new CharacterFilter();
        EncodingFilter encodingFilter = new EncodingFilter();
        //添加过滤器
        filterChain.addFilter(httpFilter);
        filterChain.addFilter(characterFilter);
        filterChain.addFilter(encodingFilter);
        //添加目标方法
        My my = new My();
        filterChain.setTarget(my);

        //filter如何链式执行
        filterChain.doFilter(new Request("hello world"),
                    new Response("dadada"),
                filterChain
                );

    }
}
