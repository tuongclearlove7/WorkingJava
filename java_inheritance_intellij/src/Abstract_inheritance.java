abstract class Abstract_inheritance2{

    public void me(){

            System.out.print("me");
    }

    public abstract void callme1();
    public abstract void callme2();
    public abstract void callme3();

}

abstract class Abstract_inheritance3 extends Abstract_inheritance2{

    public void callme1(){

        System.out.print("callme1\n");
    }
}

class Abstract_inheritance4 extends Abstract_inheritance3{

    public void callme2(){

        System.out.print("callme2\n");
    }

    public void callme3(){

        System.out.print("callme3\n");
    }
}

public class Abstract_inheritance {

    public static void main(String a[]){

        Abstract_inheritance2 object = new Abstract_inheritance4();


        object.callme1();
        object.callme2();
        object.callme3();

    }
}