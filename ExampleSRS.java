class SusResStop implements Runnable {
    Thread thread;
    boolean suspendFlag, stopFlag;

    SusResStop(String threadName) {
        thread = new Thread(this, threadName);
        suspendFlag = false;
        stopFlag = false;
        thread.start();
    }

    public void run() {
        try {
            int j = 1;
            while (++j < 20) {
                synchronized(this) {
                    while (suspendFlag) {
                        wait();
                    }
                    if (stopFlag) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }

    synchronized void myStop() {
        suspendFlag = false;
        stopFlag = true;
        notify();
    }
}

public class ExampleSRS {
    public static void main(String[] args) {
        try {
            SusResStop srs = new SusResStop("SRS");
            System.out.println("Thread SRS is created and started ");
            Thread.sleep(2000);

            srs.mySuspend();
            System.out.println("Thread SRS is suspended ");
            Thread.sleep(2000);

            System.out.println("Thread SRS is resumed ");
            srs.myResume();
            Thread.sleep(2000);

            srs.mySuspend();
            System.out.println("Thread SRS is suspended ");
            Thread.sleep(2000);

            srs.myResume();
            System.out.println("Thread SRS is resumed ");
            Thread.sleep(2000);

            srs.myStop();
            System.out.println("Thread SRS is stopped ");
        } catch (InterruptedException e) {
            System.out.println("Generated interrupted exception");
        }
    }
}

