

public class StringReverse {
    // reverse StringBuilderilla
    public String withSBuilder(String teksti) {
        StringBuilder sb = new StringBuilder(teksti);
        sb.reverse();
        return sb.toString();
    }




    public String stringReverser(String teksti) {
    // reverse vaihtamalla merkkien paikkaa

        char[] merkit = teksti.toCharArray();


        int vasen;
        int oikea = teksti.length() - 1;


        for (vasen = 0; vasen < oikea; vasen++, oikea--) {
            char apu = merkit[vasen];
            merkit[vasen] = merkit[oikea];
            merkit[oikea] = apu;
        }

        return String.valueOf(merkit);
    }
}
