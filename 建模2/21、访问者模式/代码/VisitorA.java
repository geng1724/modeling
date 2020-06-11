package fangwenzhe;

public class VisitorA implements Visitor {
    @Override
    public void visit(ZhuRen zhuRen) {
        System.out.println("拜访："+zhuRen.getzhuren());
    }
}
