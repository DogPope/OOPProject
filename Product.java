package GameStopClone;

public abstract class Product {
    private int IDNumber;
    String title;
    String description;
    String manufacturer;
    float price;

    public Product(int IDNumber, String title, String description, String manufacturer, float price){
        setIDNumber(IDNumber);
        setTitle(title);
        setDescription(description);
        setManufacturer(manufacturer);
        setPrice(price);
    }

    public Product(){
        this(0,"No title given","No description available!","No manufacturer data available!",0f);
    }

    public float getPrice(){
        if(price > 0f)
            return price;
        else
            return 0f;
    }
    public void setPrice(float price){
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    private void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    public int getIDNumber(){
        return IDNumber;
    }
    public String toString(){
        return "Title: " + getTitle() +
                "\nManufacturer:" + getManufacturer() +
                "\nDescription: " + getDescription() +
                "\nID Number: " + getIDNumber();
    }
}
