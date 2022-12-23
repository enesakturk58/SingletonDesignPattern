package versiyon3;

public class SingletonV3 {
    private static SingletonV3 nesne1;
    private int xV3 =0;
    private SingletonV3(){} // Bu sinifa disaridan new methotu ile eriseme engellendi.

    public static SingletonV3 getNesne1(){
        if(nesne1==null){
            nesne1=new SingletonV3();
        }
            return nesne1;
    }
    public int getxV3(){
        return xV3;
    }
    public void xV3Arttir(int i){
        xV3 = xV3 +i;
        System.out.println("xV3 degeri " + i + " artti . Yeni deger : " + getxV3());
    }

}
