public class PrintedBook extends Title{
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super.Title(title, literatureType, copies);
        this.pages = pages;
    }

    protected double calculatePoints(){
        return this.pages * convertLiteratureType() * copies;
    }
}
