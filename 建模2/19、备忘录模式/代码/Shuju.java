package beiwanglu;

public class Shuju {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Shuju(String value) {
        this.value = value;
    }

    public BeiWangLu createBeiwanglu(){
        return new BeiWangLu(value);
    }

    public void restoreBeiwanglu(BeiWangLu beiWangLu){
        this.value = beiWangLu.getValue();
    }
}
