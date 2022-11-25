class Myclass0 {

    void run(){

        System.out.println("running");
    }
}

class Myclass1 extends Myclass0{

    void run(){

        System.out.println("running 60km");
    }

    public String toString(){

        return "student1";
    }
}
class Myclass2 extends Myclass1{


    public String toString(){

        return "student2";
    }
}

class Myclass3 extends Myclass2{

    int num1(){

        int n = 1;

        return n;

    }

    int num2(){

        int n = 2;

        return n;

    }
}

class Myclass4 extends Object{

    public String toString(){

        return "person";
    }
}


public class Main {

    public static void m(Object x){

        System.out.println(x.toString());
    }

    public static void main(String args[]){

        Myclass0 class1 = new Myclass0();
        Myclass1 class2 = new Myclass1();
        Myclass3 class3 = new Myclass3();
        Myclass3 class4 = new Myclass3();

        class1.run();
        class2.run();
        class3.num1();
        class4.num2();

        m(new Myclass1());
        m(new Myclass2());
        m(new Myclass3());
        m(new Myclass4());

    }
}
