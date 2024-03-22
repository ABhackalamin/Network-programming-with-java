class A extends Thread{
    public void run(){
        for( int i=0;i<=5;i++){
            System.out.println("The Thread A i : "+i);
        }
        System.out.println("Exit from A");
    }
    
}
class B extends Thread{
    public void run(){
        for( int j=0;j<=5;j++){
            System.out.println("The Thread B j : "+j);
        }
        System.out.println("Exit from B");  
    }
}
class C extends Thread{
    public void run(){
        for( int k=0;k<=5;k++){
            System.out.println("The Thread C  k: "+k);
        }
        System.out.println("Exit from A");  
    }
}

public class Threadtest {
    public static void main(String[] args) {
        System.out.println("The thred is runing");
        new A().start();
        new B().start();
        new C().start();
    }
}
