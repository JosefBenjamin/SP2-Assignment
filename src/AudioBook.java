//Extends because the superclass is abstract and not interface
public class AudioBook extends Title {
    private int durationMinutes;

    //Exact same arguments as Title constructor, plus some unique to the AudioBook class
    public AudioBook(String title, String literatureType, int copies, int durationMinutes) {
        //Super keyword is embedded in Java, it allows us to access superclass constructor
        //which in turn access the superclass instance variables passed into the (super)constructor
        super(title, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }


    //Could have used an Switch/Case statement, I just prefer if-else
    //This code test to see which literaturetype we are dealing with and give us a calculation based on that
    //The final return statement is needed to so that we don't get a runtime/compile error
    @Override
    public double calculatePoints() {
        final double theHalf = 0.5;
    if(getLiteratureType().equalsIgnoreCase("BI") || getLiteratureType().equalsIgnoreCase("TE")) {
        return (durationMinutes * theHalf) * 1.5 * copies;
    } else if(getLiteratureType().equalsIgnoreCase("LYRIK")) {
        return (durationMinutes * theHalf) * 3.0 * copies;
    } else if(getLiteratureType().equalsIgnoreCase("SKØN")) {
        return (durationMinutes * theHalf) * 0.85 * copies;
    } else if(getLiteratureType().equalsIgnoreCase("FAG")) {
        return (durationMinutes * theHalf) * 0.5 * copies;
    }
        return 0.0;
    }

    //Redundant codeblock, however you can use it to note that you it is good practice to @Override inherented methods
    @Override
    public double calculateLiteraturePoints() {
        return 0.0;
  }

}
