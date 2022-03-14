public class LuxExpress {
    Kaart[] kaardipakk;
    public static void main(String[] args) {
        char[] symbolid = {'♣', '♦', '♠' , '♥'};
        String[] tugevus = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int indeks = 0;
        for (String number : tugevus) {
            for (char mast : symbolid) {
                System.out.println(mast + number);
                indeks++;
            }
        }
    }
}
