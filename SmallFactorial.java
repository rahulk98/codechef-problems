import java.util.Scanner;
import java.math.BigInteger;
class SmallFactorial{
  public static BigInteger Factorial(int a){
    BigInteger f = new BigInteger("1");
    for(int i=2;i<=a;i++){
      f = f.multiply(BigInteger.valueOf(i));
    }
    return f;
  }
  public static void main(String[] args){
    int n;
    Scanner s = new Scanner(System.in);
    SmallFactorial sf  = new SmallFactorial();
    n = s.nextInt();
    int a;

    for(int i=0;i<n;i++){
    a = s.nextInt();
    System.out.println(sf.Factorial(a));
    }
  }
}
