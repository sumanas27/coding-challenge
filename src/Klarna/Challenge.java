package Klarna;


/**
 * Java program to show Ordinals from numbers.
 * example : 1 -> 1st
 *           2 -> 2nd
 *           3 -> 3rd ...
 *           11 -> 11th
 *           12 -> 12th
 *           123 -> 123th
 */

class Challenge {

    public static String numberToOrdinal( Integer number ) {
        if( number > 10000 ) {
            return null;
        }
        String suffix = number > 0 ? "th" : "";
        if( number >= 0 ) {
            if( ( number / 10 ) % 10 != 1 ) {
                switch( number % 10 ) {
                    case 1:
                        suffix = "st";
                        break;
                    case 2:
                        suffix = "nd";
                        break;
                    case 3:
                        suffix = "rd";
                        break;
                }
            }
        }
        return number.toString() + suffix;
    }
}
