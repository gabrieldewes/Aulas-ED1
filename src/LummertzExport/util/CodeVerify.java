package LummertzExport.util;

/**
 * Created by gabriel on 10/05/16.
 */
public class CodeVerify {

    public static boolean verify (String code) {
        /* 2 letras, 4 números */
        if (code.length() == 6) {
            return false;
            /*for (int i = 0; i < code.length(); i++) {
                if (i < 3) {
                    if (isNumber(code.charAt(i))) {
                        return true;
                    } else {

                    }
                } else {
                    if (isDigit(code.charAt(i))) {
                        return true;
                    } else {

                    }
                }
            }*/
        }
        return true;
    }

    private static boolean isNumber (char c) {

        return true;
    }

    private static boolean isDigit (char c) {

        return true;
    }
}
