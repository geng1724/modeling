package zhongjiezhe;

public abstract class User {
private DailiZhe dailiZhe;
    public DailiZhe dailiZhe(){
        return dailiZhe;
    }
    public User(DailiZhe dailiZhe){
        this.dailiZhe =dailiZhe;
    }
    public abstract void work();
}
