package zerenlian;

public class khd {
    public static void main(String[] args) {
        System.out.println("父亲欠了10万，出了意外，问谁偿还？");
        ErZi erzi1=new ErZi("张大");
        ErZi erzi2=new ErZi("张二");
        ErZi erzi3=new ErZi("张三");
        erzi1.setZeren(erzi2);
        erzi2.setZeren(erzi3);
        erzi1.zeren();
    }
}
