package CatStack;

public class CatImplementation {
    public static void main(String[] args) {
        Cat cat = new Cat("fido",10);
        Cat cat1 = new Cat("lincon",10);
        Cat cat2 = new Cat("mr.x",10);
        Cat cat3 = new Cat("baba",10);

        CatsInStack catsInStack = new CatsInStack();

        catsInStack.push(cat);
        catsInStack.push(cat1);
        catsInStack.push(cat2);
        catsInStack.push(cat3);
        catsInStack.display();
        Cat poppedCat = catsInStack.pop();
        System.out.println("The popped cat is " + poppedCat.toString());
        catsInStack.display();
        catsInStack.push(cat3);
        catsInStack.display();


    }



}
