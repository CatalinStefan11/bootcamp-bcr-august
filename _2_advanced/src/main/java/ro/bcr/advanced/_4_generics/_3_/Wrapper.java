package ro.bcr.advanced._4_generics._3_;

public class Wrapper<T> {

    private T obj;

    public void putObjectInside(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }
}
