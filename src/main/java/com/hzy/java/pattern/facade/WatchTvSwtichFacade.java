package com.hzy.java.pattern.facade;

public class WatchTvSwtichFacade {
     Light light;
     AirCondition ac;
     Television tv;
     Screen screen;
     
     public WatchTvSwtichFacade(){
         this.light = new Light();
         this.ac = new AirCondition();
         this.tv = new Television();
         this.screen = new Screen();
     }
     
     public void on(){
         light.on();       //首先开灯
         ac.on();          //然后是打开空调
         screen.down();    //把银幕降下来
         tv.on();          //最后是打开电视
     }
     
     public void off(){
         tv.off();         //首先关闭电视机
         screen.up();      //银幕升上去
         ac.off();         //空调关闭
         light.off();      //最后关灯
     }
}
