package zerenlian;

public class XiaMingLing implements Mingling{
    private TingLingzhe tingMingLing;
    public XiaMingLing(TingLingzhe tingMingLing){
        this.tingMingLing=tingMingLing;
    }
    @Override
    public void minling1() {
        tingMingLing.tingmingling();
    }

}
