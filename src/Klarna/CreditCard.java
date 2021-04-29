package Klarna;


/**   Maskify credit card numbers
 *    Never mask credit cards with less than 6 characters.
 *    Mask all digits unless they are first or last four characters.
 *    Never mask non-digit characters.
 */

class CreditCard {

    public static String maskify( String creditCardNumber ) {
        // Add code here

        //The input string will never be null or undefined
        if( creditCardNumber == null ) {
            return null;
        }
        if( creditCardNumber.equals( "" ) ) {
            return "";
        }
        //Never mask credit cards with less than 6 characters.
        if( creditCardNumber.length() < 6 ) {
            return creditCardNumber;
        }
        char[] ccNumberCharacters = creditCardNumber.toCharArray();
        for( int i = 0; i < ccNumberCharacters.length; i++ ) {
            //Mask all digits unless they are first or last four characters.
            if( i == 0 || i >= ccNumberCharacters.length - 4 ) {
                continue;
            }
            //Never mask non-digit characters.
            if( ccNumberCharacters[i] >= '0' && ccNumberCharacters[i] <= '9' ) {
                ccNumberCharacters[i] = '#';
            }
        }
        return String.valueOf( ccNumberCharacters );
    }
}