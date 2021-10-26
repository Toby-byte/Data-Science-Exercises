package CatQueue;

import java.util.ArrayList;

public class CatQueue implements ArrayCatQueue{
   ArrayList<Cat> catsInQueue = new ArrayList<>();

    @Override
    // cat går ind i kø
    public void enqueue(Cat c) {
        catsInQueue.add(c);
    }

    @Override
    // cat går ud af kø
    public Cat dequeue() {
        Cat deletedCat = catsInQueue.get(catsInQueue.size()-1);
        catsInQueue.remove(catsInQueue.size()-1);
        return deletedCat;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return catsInQueue.size();
    }

    @Override
    public void display() {

    }
}
