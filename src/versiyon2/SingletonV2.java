package versiyon2;

public class SingletonV2 {

    private static SingletonV2 nesne = new SingletonV2();
    private int xV2 =0;

    private SingletonV2 (){}

    public static SingletonV2 getNesne(){
            return nesne;
    }

    public int getxV2() {
        return xV2;
    }
    public void xV2Arttir(int i){
        xV2 = xV2 +i;
        System.out.println("xV2 degeri " + i + " artti . Yeni deger : " + getxV2());
    }
}
