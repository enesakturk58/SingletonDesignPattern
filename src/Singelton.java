public class Singelton {

    private static Singelton nesne1=null;
    private static Object kilitKontrol= new Object();
    private int x=0;
    private Singelton(){} // Bu sinifa disaridan new methotu ile eriseme engellendi.

    public static Singelton getNesne1(){
        if(nesne1==null){
            synchronized (kilitKontrol){  // coklu istemciler icin kilitleme mekanizmasi
                if (nesne1==null){
                    nesne1=new Singelton();
                }
            }
        }
        return nesne1;
    }
    public int getX(){
        return x;
    }
    public void xArttir(int i){
        x=x+i;
        System.out.println("x degeri " + i + " artti . Yeni deger : " + getX());
    }
}
