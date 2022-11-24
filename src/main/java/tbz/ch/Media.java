package tbz.ch;

public abstract class Media implements MediaInt {

    public Media(String title, String year, double price) {
        Title = title;
        Year = year;
        Price = price;
    }

    protected String Title;
    protected String Year;
    protected double Price;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
