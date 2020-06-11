package zerenlian;

public class ErZi extends BaBa implements Zeren {
    private String name;

    public String getName() {
        return name;
    }

    public ErZi(String name) {
        this.name = name;
    }

    @Override
    public void zeren() {
        System.out.println(name+"偿还");
        if(getZeren()!=null){
            getZeren().zeren();
        }
    }
}
