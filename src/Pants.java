public class Pants extends Clothes {
    private int pockets;
    public Pants(String c, String s, String b, int pockets) {
        super(c, s, b);
        this.pockets = pockets;
    }
    public int getPockets() {
        return pockets;
    }
}
