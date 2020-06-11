package fangwenzhe;

public class khd {
    public static void main(String[] args) {
        Visitor visitor =new VisitorA();
        ZhuRen zhuRen =new ZhuRenA();
        zhuRen.accept(visitor);
    }
}
