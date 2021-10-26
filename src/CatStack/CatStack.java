package CatStack;

public interface CatStack {
    public void push(Cat c);
    public Cat pop();
    public boolean isEmpty();
    public Cat top();
    public int size();
    public void display();
}
