package tbz.ch;

public class DVD extends Media {

    private int Length;

    public DVD(String title, String year, double price, int length) {
        super(title, year, price);
        this.Length = length;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }
}
