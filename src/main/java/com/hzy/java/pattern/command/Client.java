package com.hzy.java.pattern.command;

public class Client {
	public static void main(String[] args) {
         Command openCommand,closeCommand,changeCommand;
         Television tv = new Television("袁海舟");
         
         openCommand = new OpenTvCommand(tv);
         closeCommand = new CloseTvCommand(tv);
         changeCommand = new ChangeChannelCommand(tv);
        
         Controller control = new Controller(openCommand,closeCommand,changeCommand);
         
         control.open();           //打开电视机
         control.change();         //换频道
         control.close();          //关闭电视机
	}
}
