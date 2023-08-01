package ro.bcr.advanced._4_generics._4_;

public class Bag<T> {

    private T[] items;

    public Bag(T[] items) {
        this.items = items;
    }

    public void printItems(){
        for(T item : items){
            System.out.println("Item: " + item);
        }
    }
}
