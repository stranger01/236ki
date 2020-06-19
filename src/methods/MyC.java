package methods;

public class MyC {
    int x;

    MyC(int i){
        x = i;
    }
}

class ParmConsDemo{
    public static void main(String[] args) {
        MyC t1 = new MyC(10);
        MyC t2 = new MyC(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
