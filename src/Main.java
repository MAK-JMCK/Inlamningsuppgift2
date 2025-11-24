import java.util.Scanner;
//        En klass som läser in text och skriver ut resultatet till användaren
public class Main {
    static void main(String[] args) {

//      Skapar ett objekt till min Logik klass och en Scanner objekt för att läsa in ord
        Scanner s = new Scanner(System.in);
        Logik ordArray = new Logik();


//      Skriver ut en välkomst text och instruktioner till användaren
        System.out.println("Välkommen till slutUppgift av kurs 2");
        System.out.println("Börja med att mata in dina ord/meningar:");
        System.out.println("Skriv Stop för att avsluta programmet ");

//      Här skapar jag en While loop som ska kolla min metod isStop är false
        while (!ordArray.isStop()){
            String ord = s.nextLine();// skapar en ny String ord som ska spara orden i sig
            ordArray.addWord(ord);// skickar ord vidare till min logik class för att gå igenom dem.
        }

//      Skriver ut resultatet från min logik class med hjälp av get.
        System.out.println("Antal Rader: " + ordArray.getAntalRader());
        System.out.println("Antal Tecken: "+ ordArray.getAntalTecken());
        System.out.println("Antal Ord: "+ ordArray.getAntalOrd());
        System.out.println("längsta ordet/orden är: " + ordArray.getLongestWords());
        System.out.println("Tack för att du använde programmet");
    }
}