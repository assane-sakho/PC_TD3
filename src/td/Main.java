package td;

public class Main {
    public static void main(String[] args) {
        try
        {
            maClasse m = new maClasse();

            m.tP.run();
            m.tM.run();

            m.tP.join();
            m.tM.join();

            System.out.println("Val : " + m.val);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
