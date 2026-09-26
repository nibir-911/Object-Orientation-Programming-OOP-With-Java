public class DataTypes {
    public static void main(String[] args) {
        /*
        There are 2 types of data types in java:
        1. Primitive Data Types: int, float, double, char, boolean, byte, short, long
        2. Non-Primitive Data Types: String, Arrays, Classes, Interfaces, etc.
        */

        // Primitive Data Types
        int a =10; //4 bytes
        boolean isJavaGood = true; // 1 byte
        float b= 22.5f; // 4bytes
        double c= 22.5; // 8 bytes
        long d= 22000000; // 8 bytes
        byte e= 123; //1 byte
        short f= 22000; // 2 bytes
        char s= 'A'; // 2 bytes

        //non-Primitive Data Types
        String name= " Raihan Chowdhury";
        int arr[] = {1,2,3,4,5};
        StringBuilder sb= new StringBuilder("Raihan Chowdhury"); //Class Object

        //Output
        System.out.println("a=" + a);
        System.out.println("isJavaGood=" + isJavaGood);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
        System.out.println("s=" + s);
        System.out.println("name=" + name);


        System.out.print("arr=");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("sb=" + sb);

    }
}
