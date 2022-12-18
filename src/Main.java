public class Main {
    public static void main(String[] args) {

        Singelton s1 = Singelton.getNesne1();
        Singelton s2 = Singelton.getNesne1();

        System.out.println("s1 icin x degeri : " + s1.getX());

        s1.xArttir(5);

        System.out.println("s1 icin x degeri : " + s1.getX());
        System.out.println("s2 icin x degeri : " + s2.getX());

        s2.xArttir(10);
        System.out.println("s1 icin x degeri : " + s1.getX());
        System.out.println("s2 icin x degeri : " + s2.getX());

        Singelton s3 = Singelton.getNesne1();

        System.out.println("s3 icin x degeri : " + s3.getX());


    }
}