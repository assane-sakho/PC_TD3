package td;

public class maClasse {
    int val;

    thread_plus tP;
    thread_moins tM;

    public maClasse()
    {
        tP = new thread_plus();
        tM = new thread_moins();

        val = 0 ;
    }


    public class thread_plus extends Thread {
        public void run() {
            synchronized(maClasse.this)
            {
                for (int i = 0; i < 15; i++) {
                    val = val + 1;
                }
            }

        }
    }

    public class thread_moins extends Thread {
        public void run() {
            synchronized(maClasse.this) {
                for (int i = 0; i < 15; i++) {
                    val = val - 1;
                }
            }
        }
    }
}
