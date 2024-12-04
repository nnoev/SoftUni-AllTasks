package inheritance.lab.stack.of.strings;

import java.util.ArrayList;

public class StackOfStrings {
    private final ArrayList<String> data;
    public StackOfStrings(){
        this.data = new ArrayList<>();
    }

    public void push(String item){
        data.addLast(item);
    }
    public String  pop(){
       return data.removeLast();
    }
    public String peek(){
       return data.getLast();
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
}
