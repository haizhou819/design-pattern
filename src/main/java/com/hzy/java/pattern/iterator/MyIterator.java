package com.hzy.java.pattern.iterator;

import java.util.List;

public class MyIterator implements Iterator{
    private List<Object> list;
    private int index = 0;

    public MyIterator(List<Object> list) {
        this.list = list;
    }
    @Override
    public Object previous() {
        if((this.index - 1) < 0){
            return null;
        }else{
            return this.list.get(--index);
        }
        
    }


    @Override
    public Object next() {
        if((this.index + 1) >= this.list.size()){
            return null;
        }else{
            return this.list.get(++index);
        }
    }


    @Override
    public boolean hasNext() {
        if(this.index < (this.list.size() - 1)){
            return true;
        }
        return false;
    }
    /**
     * 〈一句话功能简述〉
     * 〈功能详细描述〉
     * @see com.pichen.dp.behavioralpattern.iterator.Iterator#first()
     * @return
     */
    @Override
    public Object first() {
        if(this.list.size() <= 0){
            return null;
        }else{
            return this.list.get(0);
        }
    }
}
