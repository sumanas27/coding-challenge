package Klarna; /**
 * Evaluate RPN expression. Only + - * / on float/int arguments are supported.
 * All numbers are treated as floats so expect precision quirks.
 * Implement RPN calculator. Allowed operations are sum, subtract, multiply, divide with
 * integers and floats.Return float.
 * Ignore division by zero and possible stack errors.
 */

import java.util.Stack;
import java.util.StringTokenizer;


public class Calc {

    private interface Operation {

        float operate( float a, float b );
    }

    private static void doOperation( Stack<Float> stack, Operation ops ) {
        float op1 = stack.pop();
        float op2 = stack.pop();
        stack.push( ops.operate( op2, op1 ) );
    }

    public double evaluate( String expr ) {
        //Empty expression should evaluate to 0.
        if( expr.equals( "" ) ) {
            return 0;
        }
        StringTokenizer stringTokenizer = new StringTokenizer( expr, " " );

        Stack<Float> floats = new Stack<>();

        while( stringTokenizer.hasMoreTokens() ) {
            String token = stringTokenizer.nextToken();
            switch( token ){
                case "+":
                    doOperation( floats, (op1, op2) -> op1 + op2 );
                    break;
                case "-":
                    doOperation( floats, (op1, op2) -> op1 - op2 );
                    break;
                case "*":
                    doOperation( floats, (op1, op2) -> op1 * op2 );
                    break;
                case "/":
                    doOperation( floats, (op1, op2) -> op1 / op2 );
                    break;
                default:
                    floats.push( Float.parseFloat( token ) );
            }
        }

        return floats.isEmpty() ? 0.0 : floats.pop();
    }
}