package ro.bcr.advanced._4_generics._3_;

public class DemoWrapper {

    public static void main(String[] args) {

        Wrapper<int[]> myIntWrapper = new Wrapper<>();

        myIntWrapper.putObjectInside(new int[]{1,2,3,4,5});

        for(var el : myIntWrapper.getObj()){
            System.out.println(el);
        }

    }
}
