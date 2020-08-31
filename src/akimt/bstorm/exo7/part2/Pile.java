package akimt.bstorm.exo7.part2;

public interface Pile<T> {

    T peek();
    T pop();
    void push(T toPush);

}
