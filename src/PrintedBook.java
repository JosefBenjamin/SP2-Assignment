public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

     @Override
     public double calculatePoints() {
             final double theHalf = 0.5;
         if(getLiteratureType().equalsIgnoreCase("BI") || getLiteratureType().equalsIgnoreCase("TE")) {
             return (pages * theHalf ) * 3.0 * copies;
         } else if(getLiteratureType().equalsIgnoreCase("LYRIK")) {
             return (pages * theHalf) * 6.0 * copies;
         } else if(getLiteratureType().equalsIgnoreCase("SKØN")) {
             return (pages * theHalf) * 1.75 * copies;
         } else if(getLiteratureType().equalsIgnoreCase("FAG")) {
             return (pages * theHalf) * 1.0 * copies;
         }
         return 0.0;
    }

    @Override
    public double calculateLiteraturePoints() {

        return 0.0;

    }
}
