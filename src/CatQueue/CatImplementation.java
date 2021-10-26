package CatQueue;

import java.util.ArrayList;

public class CatImplementation {
    public static void main(String[] args) {

        Cat cat = new Cat("fido",10);
        Cat cat1 = new Cat("lincon",10);
        Cat cat2 = new Cat("mr.x",10);
        Cat cat3 = new Cat("baba",10);

        CatQueue catQueue = new CatQueue();

        catQueue.enqueue(cat);
        catQueue.enqueue(cat1);
        catQueue.enqueue(cat2);
        catQueue.enqueue(cat3);
        System.out.println(catQueue.catsInQueue);
        System.out.println(catQueue.dequeue());
        System.out.println(catQueue.catsInQueue);


    }
}
