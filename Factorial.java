import java.util.Scanner;
class Factorial{
  public static void main(String[] args){
    int n;
    Factorial fc = new Factorial();
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int c=0;
    int num;
    for(int i=0;i<n;i++){
      c = 0;
      num = s.nextInt();
      while(num>0){
        c+=num/5;
        num/=5;
      }
      System.out.println(c);
    }

  }
}
