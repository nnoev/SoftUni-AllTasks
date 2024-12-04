package inheritance.lab.random.array.list;

import java.util.ArrayList;

public class RandomArrayList<T> extends ArrayList<T> {
    public T getRandomElement(){
        return super.removeFirst();
    }
}
