import java.util.Scanner;
class Input{
  public static  void main(String[] args){
    Scanner s = new Scanner(System.in);
    long n;
    long i;
    int c = 0;
    long a;
    n = s.nextLong();
    i = s.nextLong();
    while(n != 0){
      a = s.nextLong();
      if(a%i==0){
        c++;
      }
      n--;
    }
    System.out.println(c);
  }
}
