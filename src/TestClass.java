import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestClass {
//testar om min klass fungerar som den ska och att den returnar antal tecken.
    @Test
    public void testAddWord(){
        Logik ordArray = new Logik();
        ordArray.addWord("Amjad");
        assertEquals(5,ordArray.getAntalTecken());
    }
//    testar stop funktionen
    @Test
    public void testStop(){
        Logik ordArray = new Logik();
        ordArray.addWord("stop");
        assertTrue(ordArray.isStop());
        assertEquals(0,ordArray.getAntalTecken());
        assertEquals(0,ordArray.getAntalOrd());
        assertEquals("",ordArray.getLongestWord());
    }
//    testar skriva stop med storabokstäver
    @Test
    public void testUpperCaseStop(){
        Logik ordArray = new Logik();
        ordArray.addWord("STOP");
        assertTrue(ordArray.isStop());
        assertEquals(0,ordArray.getAntalTecken());
    }
//    testar längsta ordet
    @Test
    public void testLongWord(){
        Logik ordArray = new Logik();
        ordArray.addWord("amjad");
        ordArray.addWord("Amjadkryem");
        ordArray.addWord("amjadkrye");
        ordArray.addWord("amjadkrye ECUtbildning HelloWorld");
        assertEquals("ECUtbildning",ordArray.getLongestWord());
    }



}
