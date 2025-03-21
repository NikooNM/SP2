public class LibraryRoyalityCalculator {
    public static void main(String[] args) {
        Author olgaRavn = new Author("Olga Ravn");

        AudioBook celestineAudioBook = new AudioBook("Celestine", "SKØN", 140, 166);
        PrintedBook voksbarnetPrintedBook = new PrintedBook("Voksbarnet", "SKØN", 140, 160);

        olgaRavn.addTitle(celestineAudioBook);
        olgaRavn.addTitle(voksbarnetPrintedBook);

        float totalPayOlgaRavn = olgaRavn.calculateTotalPay();

        System.out.println(olgaRavn);
    }
}