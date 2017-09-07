import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class ATM{
  public static void main(String args[]) throws IOException{
  try{ int w;
    double b;
    Scanner s = new Scanner(System.in);
    whule(s.hasNext()){
    w = s.nextInt();
    b = s.nextDouble();
    if(w % 5 != 0){
      DecimalFormat a = new DecimalFormat("#.00");
      System.out.println(a.format(b));
    }
    else if(w >= b){
      DecimalFormat a = new DecimalFormat("#.00");
      System.out.println(a.format(b));
    }
    else{
      b = b-w;
      b = b - 0.5;
      DecimalFormat a = new DecimalFormat("#.00");
      System.out.println(a.format(b));
    }
  }
  }catch(Exception e){
      System.out.println(e);
      return;
    }
    }
  }
