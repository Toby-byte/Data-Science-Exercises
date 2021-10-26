package CatStack;

import java.util.ArrayList;

public class CatsInStack implements CatStack {
    ArrayList<Cat> catsInStack = new ArrayList<Cat>();

    @Override
    public void push(Cat c) {
        catsInStack.add(0,c);
    }

    @Override
    public Cat pop() {
        Cat deletedCat = catsInStack.get(0);
        catsInStack.remove(0);
        return deletedCat;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Cat top() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println(catsInStack);
    }
}
