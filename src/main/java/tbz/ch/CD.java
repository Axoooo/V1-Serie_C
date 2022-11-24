package tbz.ch;

public class CD extends Media {

    private String BandName;

    public CD(String title, String year, double price, String BandName) {
        super(title, year, price);
        this.BandName = BandName;
    }

    public String getBandName() {
        return BandName;
    }

    public void setBandName(String bandName) {
        BandName = bandName;
    }
}
