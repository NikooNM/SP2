import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title){
        titles.add(title);
    }

    public float calculateTotalPay(){
        double totalPay = 0.0;
        for (Title t : titles){
            totalPay += t.calculateRoyalty();
        }
        return (float)totalPay;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString () {
        return getName() + ": " + calculateTotalPay() + " kr.";
    }
}
