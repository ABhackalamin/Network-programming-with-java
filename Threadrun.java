 class X extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("\t From thread X i is : "+i);
        }
        System.out.println("Exit from X");
    }
}

class Y extends Thread{
    public void run(){
        for(int j=0;j<=5;j++){
            System.out.println("\t From thread Y j is : "+j);
        }
        System.out.println("Exit from Y");
    }
}

 class Z extends Thread{
    public void run(){
        for(int k=0;k<=5;k++){
            System.out.println("\t From thread Z k is : "+k);
        }
        System.out.println("Exit from Z");
    }
}

public class Threadrun {
    public static void main(String[] args) {
        System.out.println("The thread is running");
        new X().run();
        new Y().run();
        new Z().run();
    }
}

