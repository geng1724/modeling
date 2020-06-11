package zhongjiezhe;

public class User2 extends User {
    public User2(DailiZhe dailiZhe){
        super(dailiZhe);
    }
    @Override
    public void work() {
        System.out.println("小张");
    }
}
