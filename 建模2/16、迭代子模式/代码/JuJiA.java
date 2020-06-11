package diedaizi;

public class JuJiA implements Juji {
    public String aaa[] = {"A","B","C","D","E"};
    @Override
    public Diedaizi diedaizi() {
        return new DiedaiziA(this);
    }

    @Override
    public Object get(int i) {
        return aaa[i];
    }

    @Override
    public int size() {
        return aaa.length;
    }
}
