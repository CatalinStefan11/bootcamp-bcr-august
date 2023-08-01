package ro.bcr.fundamentals._7_arrays;

public class DemoArray {

    public static void main(String[] args) {

        int[] emptyArray = {};

        System.out.println("length= " + emptyArray.length);

        int[] fixedArray = new int[5];
        System.out.println("length= " + fixedArray.length);

        int[] array = {1, 2, 3, 4, 5};

        for(var el : array){
            System.out.println(el);
        }

        System.out.println("-----------------");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

}
