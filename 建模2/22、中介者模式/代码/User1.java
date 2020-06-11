package zhongjiezhe;

public class User1 extends User{
    public User1(DailiZhe dailiZhe){
        super(dailiZhe);
    }
    @Override
    public void work() {
        System.out.println("小明");
    }
}
