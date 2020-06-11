package diedaizi;

public class DiedaiziA implements Diedaizi {
    private Juji juji;
    private int pos = -1;
    public  DiedaiziA(Juji juji){
        this.juji =juji;
    }
    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return juji.get(pos);
    }

    @Override
    public Object next() {
        if(pos > 0){
            pos++;
        }
        return juji.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<juji.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return juji.get(pos);
    }
}
