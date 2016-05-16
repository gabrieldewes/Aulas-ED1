package LummertzExport.util;

/**
 * Created by gabriel on 10/05/16.
 */
public class CodeVerify {

    public boolean verify (String code) {
        /* 2 letras, 4 números */
        for (int i=0; i<code.length(); i++) {
            if (i < 3) {
                if (isNumber(code.charAt(i))) {

                } else {

                }
            } else {
                if (isDigit(code.charAt(i))) {

                } else {

                }
            }
        }
        return false;
    }

    public boolean isNumber (char c) {

        return false;
    }

    public boolean isDigit (char c) {

        return false;
    }
}
