public class LibraryRoyaltyCalculator {

    /*You can have multiple main methods, you just need to specify which one you want to use when you run the code in
    IDE, CLi, or whatever program you use to compile the code with.
    */
    public static void main(String[] args) {


          /*
          The code here is pretty self-explanatory. You need to init and declare an Author object. Give the Author a name
          either full name, first name or pen name, then you init and declare the title subclasses AudioBook and PrintedBook
          You pass in the given arguments in their respective constructors. Then we add them to the ArrayList which is takes
          in one object type which is Title, and since books and audiobooks are subclasses of Title, we can just go ahead and use
          .add to add them to the list. We call the Author method calculateTotalPay to get the authors full compensation.
          Finally we print out the author object, which gives returns a nice string with the information we want. This is only
          possible because of the Author @Override of the toString method. 
           */

            Author lovecraft = new Author("H.P. Lovecraft");
            AudioBook iNTMOM = new AudioBook("In The Mouth of Madness","skøn",10000, 600);
            PrintedBook cthulhu = new PrintedBook("The Call of Cthulhu", "skØn", 100, 500);
            PrintedBook colorOutOfSpace = new PrintedBook("The Color Out of Space", "SKØN", 250, 350);
            lovecraft.addTitle(iNTMOM);
            lovecraft.addTitle(cthulhu);
            lovecraft.addTitle(colorOutOfSpace);
            lovecraft.calculateTotalPay();

            System.out.println(lovecraft);
    }
}
