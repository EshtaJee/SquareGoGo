import ru.eshta_jee.maven.sqr.SQRServise;

public class Main {

    public static void main(String[] args) {
        SQRServise servise = new SQRServise();
        int x = servise.calcSquareRoot(200, 999);

        System.out.println();
        System.out.println("Таких чисел " + x);

    }

}
