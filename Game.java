package GameStopClone;

public class Game extends Product{
    private String genre;

    public Game(int IDNumber, String title, String description, String manufacturer, float price, String genre){
        super(IDNumber,title,description,manufacturer,price);
        setGenre(genre);
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString(){
        return super.toString() + "\nGenre: " + getGenre();
    }
}
