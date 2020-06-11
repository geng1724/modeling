package Jieshiqi;

public class Minus implements Jieshiqi {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
