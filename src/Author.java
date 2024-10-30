import java.util.ArrayList;

public class Author {
    private final String name;
    private final ArrayList<Title> titles = new ArrayList<Title>();

    public Author(String name) {
        this.name = name;

    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    /*
    The important piece in this code is the for each loop, that allows us to loop through
    an arraylist no matter future size of it, and save it in a new variable title, by calling the calculateRoyalty method
    on each item in the arraylist, and then CONTINUOUSLY adding it to the total, we get accumulated royalties for the author.
    Also do note that double and float can be casted and used almost interchangeably, since the difference between is
    not what they do, they are both decimal numbers, but they just reserve a different amount of memory for the decimal numbers
     */
    public float calculateTotalPay() {
        float total = 0;
        for(Title title : titles) {
            total += (float) title.calculateRoyalty();
        }
        return total;
    }

    /*
    Very import piece of code here, this allows us to override the toString method, so we can actually print out our
    Author object and get the name of the author and their total compensation for their books audio or otherwise!
    Without this we would get this: public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    } Which prints out the memory address, the above is not the memory address but the toString method.
     */
    @Override
    public String toString() {
        return name + ": " + String.format("%.2f", calculateTotalPay()) + "kr";
    }
}
