public class Shirt extends Clothes {
    //v neck, turtleneck, u neck
    private String neck;
    public Shirt(String name, String size, String brand, String neck) {
        super(name, size, brand);
        this.neck = neck;
    }

    public String getNeck() {
        return neck;
    }
}
