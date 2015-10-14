package utils;

public class PrimeInspector {
    private static String isPrimeMessage(int number){
        return number + " is prime";
    }
    
    private static String isNotPrimeMessage(int number, int divisible){
        return number + " is not prime. It is divisible by " + divisible + ".";
    }
    
    public static String primeStatus(int number){
        if( number % 2 == 0 ) isNotPrimeMessage(number, 2);
        
        for( int i = 2; i < number; i++ ){
            if( number % i == 0 ) return isNotPrimeMessage(number, i);
        }
        
        return isPrimeMessage(number);
    }
    
    
}
