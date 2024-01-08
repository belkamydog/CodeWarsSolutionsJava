package app;

import decoder.MorseCodeDecoder;

public class Main {
    public static void main(String[] args){
        MorseCodeDecoder morseCodeDecoder = new MorseCodeDecoder();
        System.out.println(morseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
//        System.out.println(morseCodeDecoder.decode("H e l l o  w o r l d"));

    }
}
