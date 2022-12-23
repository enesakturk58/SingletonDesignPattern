import versiyon2.SingletonV2;
import versiyon3.SingletonV3;
import versiyon4.SingeltonV4;

public class Main {
    public static void main(String[] args) {
        // V2
        {   System.out.println("Versiyon2 için örnek ; \n");

            SingletonV2 s1 = SingletonV2.getNesne();
            SingletonV2 s2 = SingletonV2.getNesne();

            System.out.println("s1 icin xV2 degeri : " + s1.getxV2());

            s1.xV2Arttir(5);

            System.out.println("s1 icin xV2 degeri : " + s1.getxV2());
            System.out.println("s2 icin xV2 degeri : " + s2.getxV2());

            s2.xV2Arttir(10);

            System.out.println("s1 icin xV2 degeri : " + s1.getxV2());
            System.out.println("s2 icin xV2 degeri : " + s2.getxV2());

            SingletonV2 s3 = SingletonV2.getNesne();

            System.out.println("s3 icin xV2 degeri : " + s3.getxV2());
            System.out.println("--------------------------");
        }
        // V3
        {
            System.out.println("Versiyon3 için örnek ; \n");

            SingletonV3 s1 = SingletonV3.getNesne1();
            SingletonV3 s2 = SingletonV3.getNesne1();

            System.out.println("s1 icin xV3 degeri : " + s1.getxV3());
            s2.xV3Arttir(5);

            System.out.println("s1 icin xV3 degeri : " + s1.getxV3());
            System.out.println("s2 icin xV3 degeri : " + s2.getxV3());

            s2.xV3Arttir(10);

            System.out.println("s1 icin xV3 degeri : " + s1.getxV3());
            System.out.println("s2 icin xV3 degeri : " + s2.getxV3());

            SingletonV3 s3 = SingletonV3.getNesne1();

            System.out.println("s3 icin xV3 degeri : " + s3.getxV3());
            System.out.println("--------------------------");



        }
        // V4
        {   System.out.println("Versiyon4 için örnek ; \n");

            SingeltonV4 s1 = SingeltonV4.getNesne1();
            SingeltonV4 s2 = SingeltonV4.getNesne1();

            System.out.println("s1 icin xV4 degeri : " + s1.getxV4());

            s1.xV4Arttir(5);

            System.out.println("s1 icin xV4 degeri : " + s1.getxV4());
            System.out.println("s2 icin xV4 degeri : " + s2.getxV4());

            s2.xV4Arttir(10);
            System.out.println("s1 icin xV4 degeri : " + s1.getxV4());
            System.out.println("s2 icin xV4 degeri : " + s2.getxV4());

            SingeltonV4 s3 = SingeltonV4.getNesne1();

            System.out.println("s3 icin xV4 degeri : " + s3.getxV4());
            System.out.println("--------------------------");
        }

    }
}