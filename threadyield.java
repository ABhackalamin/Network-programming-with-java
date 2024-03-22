
class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                Thread.yield(); // Yield the execution of Thread A
            }
            System.out.println("\t From Thread A: i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t From Thread B: j = " + j);
            if (j == 3) stop();
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\t From Thread C: k = " + k);
            if (k == 1) {
                try {
                        sleep(1000); // Pause for 1 second
                } 
                catch (Exception e) {
                   
                }
            }
        }
        System.out.println("Exit from C");
    }
}

public class threadyield {
    public static void main(String[] args) {
        System.out.println("Start thread A");
        A threadA = new A();
        threadA.start();

        System.out.println("Start thread B");
        B threadB = new B();
        threadB.start();

        System.out.println("Start thread C");
        C threadC = new C();
        threadC.start();

        System.out.println("End of the main thread");
    }
}

