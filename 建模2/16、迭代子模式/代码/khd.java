package diedaizi;

public class khd {
    public static void main(String[] args) {
        Juji juji = new JuJiA();
        Diedaizi ddz =juji.diedaizi();
        while(ddz.hasNext()){
            System.out.println(ddz.next());
        }
    }
}
