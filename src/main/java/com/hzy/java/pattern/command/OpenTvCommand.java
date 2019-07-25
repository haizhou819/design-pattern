package com.hzy.java.pattern.command;

public class OpenTvCommand implements Command{
     private Television tv;
     
     public OpenTvCommand(Television tv){
    	 this.tv = tv;
     }
     
     public void execute() {
         tv.open();
     }
}
