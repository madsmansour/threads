import java.util.concurrent.ThreadLocalRandom;

/**
 * Illustrerer, hvordan tråde fungerer
 */


public class Main {

    private static final int GENTAGELSER = 1000;
    private static final int LINELENGTH = 40;

    public static void main(String[] args) {

        // visBogstav("a");
        // visBogstav("b");

        // TODO 3 Instantier objekter som skal køre hver for sig
       /* Opgave opgaveA = new Opgave("a");
        Opgave opgaveB = new Opgave("b");
        Opgave opgaveC = new Opgave("c");
*/
        // TODO 4 Opret tråde med ovenstående objekter som argument
       /* Thread threadA = new Thread(opgaveA);
        Thread threadB = new Thread(opgaveB);
        Thread threadC = new Thread(opgaveC);
*/
        for (int i = 65; i < 100 ; i++) {
            char a = (char) i;
            Opgave opgaveA = new Opgave(String.valueOf(a));

            Thread threadA = new Thread(opgaveA);

            {

            }
            threadA.start();
        }
        // TODO 5 Start trådene
    }

    // public static void visBogstav(String bogstav) {
    // }

    // TODO 1 Opret en klasse, som implementerer Runnable
    public static class Opgave implements Runnable {

        String bogstav;

        public Opgave(String bogstav) {
            this.bogstav = bogstav;
        }

        // TODO 2 Override run() metoden, den skal indeholde den kode, som skal køre i en tråd for sig
        @Override
        public void run() {
            for (int i = 0; i < GENTAGELSER; i++) {

                System.out.print(bogstav + Thread.currentThread().getId() + "\n");
                if (Thread.currentThread().getId() == 37 ){
                    Thread.currentThread().setPriority(1);
                }
            }
        }
    }

}