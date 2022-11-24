package tbz.ch;

public class Book extends Media {

    private int ISBM_Nr;

    public Book(String title, String year, double price, int ISBM_Nr) {
        super(title, year, price);
        this.ISBM_Nr = ISBM_Nr;
    }

    public int getISBM_Nr() {
        return ISBM_Nr;
    }

    public void setISBM_Nr(int ISBM_Nr) {
        this.ISBM_Nr = ISBM_Nr;
    }
}
