package decoder;

import java.util.HashMap;

public class MorseCode{
    private final HashMap<String, String> alfaBet;
    
    public MorseCode(){
        alfaBet = new HashMap<String, String>();
        alfaBet.put(".-", "A");
        alfaBet.put("-...", "B");
        alfaBet.put("-.-.", "C");
        alfaBet.put("-..", "D");
        alfaBet.put(".", "E");
        alfaBet.put("..-.", "F");
        alfaBet.put("--.", "G");
        alfaBet.put("....", "H");
        alfaBet.put("..", "I");
        alfaBet.put(".---", "J");
        alfaBet.put("-.-", "K");
        alfaBet.put(".-..", "L");
        alfaBet.put("--", "M");
        alfaBet.put("-.", "N");
        alfaBet.put("---", "O");
        alfaBet.put(".--.", "P");
        alfaBet.put("--.-", "Q");
        alfaBet.put(".-.", "R");
        alfaBet.put("...", "S");
        alfaBet.put("-", "T");
        alfaBet.put("..-", "U");
        alfaBet.put("...-", "V");
        alfaBet.put(".--", "W");
        alfaBet.put("-..-", "X");
        alfaBet.put("-.--", "Y");
        alfaBet.put("--..", "Z");
    }

    public String get(String morseCode){
        return alfaBet.get(morseCode);
    }
}
