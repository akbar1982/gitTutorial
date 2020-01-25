package utils;

public class MyClass {

    // this variable belong to the class
   public static int num = 1;

    // this variable belongs to the object
   private int num1;


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Constructer
   public MyClass(int num1) {

       this.num1 = num1;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        MyClass.num = num;
    }



    public void myMethod1(){

       System.out.println("This is myMethod1");
    }

    public static void myMethod(){

       System.out.println("This is myMethod");
    }
}
