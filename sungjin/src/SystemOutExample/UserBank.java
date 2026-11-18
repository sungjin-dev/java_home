package SystemOutExample;

public class UserBank<T,M,C> extends Bank<T, M>{
    private C brand;
    public C getbrand() {
        return this.brand;
    }
    public void setBrand(C brand) {
        this.brand = brand;
    }
}
