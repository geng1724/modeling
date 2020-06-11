package fangwenzhe;

public class ZhuRenA implements ZhuRen {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getzhuren() {
        return "张三";
    }
}
