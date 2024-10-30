public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    //protected makes sure other classes can't access this variable, final makes sure no one changes it in this class.
    protected final double rate = 0.067574;

    //This constructor is the template for subclasses of the Title class
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    //getter method necessary because literatureType, meaning not even inherited classes can access it.
    public String getLiteratureType() {
        return literatureType;
    }


    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    public abstract double calculatePoints();

    //This is redundant code, not sure what the difference between this and calculatePoints and calculateLiteraturePoints is
    //Thus, this method is never used or called anywhere.
    public abstract double calculateLiteraturePoints();


}
