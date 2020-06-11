package gongchang;

public class UndergraduateFactory implements IFactory {
    @Override
    public Teacher createteacher() {
        return new Undergraduate();
    }
}
