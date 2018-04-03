package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
   Element top;
    int len = 0;

    @Override
    public void push(char w) {
        Element e = new Element();
        e.w = w;
        e.next=top;
        top = e;
        len++;
    }

    @Override
    public char pop() {
        if(top == null){
            throw new NoSuchElementException();
        }else{
            char h = top.w;
            top=top.next;
            len--;
            return h;
        }
    }

    @Override
    public int size() {
        return len;
    }
}
