package versiyon4;

public class SingeltonV4 {

    private static SingeltonV4 nesne1=null;
    private static Object kilitKontrol= new Object();
    private int xV4 =0;
    private SingeltonV4(){} // Bu sinifa disaridan new methotu ile eriseme engellendi.

    public static SingeltonV4 getNesne1(){
        if(nesne1==null){
            synchronized (kilitKontrol){  // coklu istemciler icin kilitleme mekanizmasi
                if (nesne1==null){
                    nesne1=new SingeltonV4();
                }
            }
        }
        return nesne1;
    }
    public int getxV4(){
        return xV4;
    }
    public void xV4Arttir(int iV4){
        xV4 = xV4 +iV4;
        System.out.println("xV4 degeri " + iV4 + " artti . Yeni deger : " + getxV4());
    }
}
