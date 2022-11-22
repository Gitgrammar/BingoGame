
package BingoGame;
import java.util.*;
public class BingoApp {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("あなたの名前を入力してください。");
    String name=sc.next();
    System.out.println("年齢を入れてください。");
    int age=sc.nextInt();
    Human you=new Human(age,name);
    System.out.println(you);
    
    
   } 
}
