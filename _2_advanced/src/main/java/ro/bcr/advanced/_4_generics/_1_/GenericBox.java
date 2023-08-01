package ro.bcr.advanced._4_generics._1_;

public class GenericBox<T> {

    private T objectInside;

    public void putObjectInside(T obj){
        this.objectInside = obj;
    }

    public T getObjectInside(){
        return this.objectInside;
    }

}
