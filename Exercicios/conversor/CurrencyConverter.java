package conversor;

public class CurrencyConverter {

    public static double dollarToReal(double  a, double b){    
        double dollarToReal = b * (a + (a*0.06));
        return dollarToReal;      
}
    }