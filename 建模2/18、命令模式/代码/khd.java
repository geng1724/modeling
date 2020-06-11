package zerenlian;

public class khd {
    public static void main(String[] args) {
        System.out.println("听我命令");
        TingLingzhe tingLingzhe =new TingLingzhe();
        Mingling mingling =new XiaMingLing(tingLingzhe);
        XiaLingZhe xiaLingZhe =new XiaLingZhe(mingling);
        xiaLingZhe.minling();
    }
}
