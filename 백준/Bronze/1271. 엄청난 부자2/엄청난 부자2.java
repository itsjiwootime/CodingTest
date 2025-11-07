import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();  
        String[] parts = line.split(" ");  

        BigInteger n = new BigInteger(parts[0]);
        BigInteger m = new BigInteger(parts[1]);

        BigInteger quotient = n.divide(m);   
        BigInteger remainder = n.remainder(m); 

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
