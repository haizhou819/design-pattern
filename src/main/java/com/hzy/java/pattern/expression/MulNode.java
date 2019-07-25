package com.hzy.java.pattern.expression;

public class MulNode extends SymbolNode{
    public MulNode(Node left,Node right){
        super(left,right);
    }
    
    public int interpret(){
        return left.interpret() * right.interpret();
    }
}