package com.hzy.java.pattern.responsibility;

public abstract class Leader {
	// 上级领导对于下一个处理节点
    protected Leader nextLeader;
    public String name;

    public Leader(String name,Leader nextLeader){
    	this.name = name;
        this.nextLeader = nextLeader;
    }

    public final void handlerRequest(int money){
        if (money < limit()) {
            handler(money);
        }else{
            if (nextLeader != null){
            	System.out.println(name + "审批不通过，找上级领导审批");
                nextLeader.handlerRequest(money);
            }
        }
    }

    /**
     * 真正处理逻辑
     * @param money
     */
    protected abstract void handler(int money);

    /**
     * 当前领导的最大权限
     * @return
     */
    protected abstract int limit();
}
