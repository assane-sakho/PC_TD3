package exo;

public class Race {
    static double val = 0.0;

    public class thread_plus extends Thread {
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                val += 1.0;
            }
        }
    }

    public class thread_moins extends Thread {
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                val -= 1.0;
            }
        }
    }

    public double go() throws InterruptedException {
        thread_plus Tp = new thread_plus();
        thread_moins Tm = new thread_moins();
        Tp.start();
        Tm.start();
        Tp.join();
        Tm.join();
        return val;
    }

    public static void main(String[] args) throws InterruptedException {
        Race r = new Race();
        r.go();
    }
}
