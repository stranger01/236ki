package methods;

public class myClass {
    int x;

    myClass(){
        x = 10;
    }
}

class consDemo{
    public static void main(String[] args) {
        myClass t1 = new myClass();
        myClass t2 = new myClass();

        System.out.println(t1.x + "" + t2.x);
    }
}