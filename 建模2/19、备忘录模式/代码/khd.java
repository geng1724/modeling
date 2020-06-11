package beiwanglu;

public class khd {
    public static void main(String[] args) {
      Shuju shuju=new Shuju("天王盖地虎，宝塔镇河妖");
        CunChu cunChu =new CunChu(shuju.createBeiwanglu());
        System.out.println("初始状态为"+shuju.getValue());
        shuju.setValue("天王盖地虎，小鸡炖蘑菇");
        System.out.println("修改为"+shuju.getValue());
        shuju.restoreBeiwanglu(cunChu.getBeiWangLu());
        System.out.println("恢复为"+shuju.getValue());
    }
}
