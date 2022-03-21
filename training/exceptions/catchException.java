package exceptions;

public class catchException {
    public static void main(String[] args) {
        //divideAndPrint(6,null);
        System.out.println(convertToDouble("23.44"));
    }

    static void divideAndPrint(Integer divident, Integer divisor)
    {
        String msg = "";
        try
        {
            msg = Integer.toString(divident.intValue() / divisor.intValue());
        }
        catch(ArithmeticException ae)
        {
            msg = "Division by zero.";
        }
        catch(Exception npe)
        {
            msg = "Error has occurred.";
        }
        finally
        {
            System.out.println(msg);
        }
    }

    static double convertToDouble(String str)
    {
        double val;
        try {    
            val = Double.parseDouble(str);
            return val;
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }
}