package Practice3;

public class Book {
    private String name;
    private int score;
    private double price;
    private String gender;

    public Book(){
        this("unnamed","a stranger",0,0.00);
    }

    public Book(String name, String gender, int score, double price) {
        this.name = name;
        this.score = score;
        this.price = price;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Book(" +
                "name='" + name + '\'' +
                ", gender='" + gender +
                ", score=" + score +
                ", price=" + String.format("%.2f", price) +
                 '\'' +
                ')';
    }


}
