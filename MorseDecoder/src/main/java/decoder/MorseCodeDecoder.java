package decoder;

import org.jetbrains.annotations.NotNull;

public class MorseCodeDecoder {

    public String decode(@NotNull String morseCode) {
        MorseCode decoder = new MorseCode();
        morseCode = morseCode.trim();
        String [] words = morseCode.split("   ");
        StringBuilder result = new StringBuilder();
        for (String i : words){
            for (String j : i.split(" ")){
                String token = decoder.get(j);
                if (token != null) result.append(token);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
