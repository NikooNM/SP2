public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super.Title(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints(){
        return (durationInMinutes / 2) * convertLiteratureType() * copies;
    }
}
