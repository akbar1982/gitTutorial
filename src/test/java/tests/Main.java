package tests;
import utils.MyClass;

public class Main {

    public static void main(String[] args) {


        MyClass object = new MyClass(2);

// calling non static method
        object.myMethod1();
// calling static method
        MyClass.myMethod();

        object.setNum1(5);
        object.getNum1();

        int a = 50;
        int b = 60;
        int c = 50;
        int result = a+b;
//        result = b-a;
//        result = a/b;
        result = a%b;

        for(int i=0; i<10; i++){
            System.out.println("This is inside the loop " + i);
        }
        System.out.println(a!=b);


        if( a==b & a==c ){
            System.out.println("the values of a b c equal ");
        }else if (a==b || a==c ){
            System.out.println("Either one of the conditions is true ");
        }
        System.out.println(c);
        c -=40;
        System.out.println(c);


    }
}
