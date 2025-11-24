//    En annan klass som räknar raderna och har koll på antalet tecken osv.
public class Logik {
    // Här Skapar jag mina attribut
    private int antalRader = 0;
    private int antalTecken = 0;
    private boolean stop = false;
    private int antalOrd = 0;
    private String longestWords = "";
    private int maxLength = 0;

    // skapar inget konstruktor eftersom jag inte behöver lägga till några attribut vid skapandet av objektet.
// Börjar istället direkt med att skapa min addWord metod som ska ta in ord från användaren.
    public void addWord(String word) {
//    If sats som kollar om ordet är stop oavsett om det är uppercase eller lowercase.
        if (word.equalsIgnoreCase("stop")) {
            stop = true;

        } else {
// skapar en String array som spara alla ord i sig genom att dela upp strängen med blanksteg även om det är flera.
            String[] words = word.split("\\s+");

            antalRader++;
            antalTecken += word.length();
            antalOrd += words.length;

// Skapar en for loop för att gå igenom alla skapade ord för att sedan jämföra alla ord som kommer in och spara det längsta
            for (int i = 0; i < words.length; i++) {
                String currentWord = words[i]; // skapar en ny string som sparar det nuvarande ordet i loopen

                int wordLength = currentWord.length();// sparar längden av det nuvarande ordet för att sedan börja jämföra längderna.


                if (wordLength > maxLength) {
                    // ifall ett nytt längst ord hittat då uppdateras längd och ord
                    maxLength = wordLength;
                    longestWords = currentWord;

                } else if (wordLength == maxLength) {
                    // ifall ett ord med samma längd hittas då läggs det till i strängen med kommatecken så slipper jag skapa en lista eller array för att spara dem.
                    longestWords += ", " + currentWord;

                }
            }
        }


    }

    public int getAntalRader() {
        return antalRader;
    }

    public int getAntalTecken() {
        return antalTecken;
    }

    public boolean isStop() {
        return stop;
    }

    public int getAntalOrd() {
        return antalOrd;
    }

    public String getLongestWords() {
        return longestWords;
    }
}