
package BingoGame;
import java.util.*;
public class BingoApp {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("あなたの名前を入力してください。>>");
    String name=sc.next();
    System.out.print("年齢を入れてください。>>");
    int age=sc.nextInt();
    int coin=100;
    int BET=sc.nextInt();
    Human you=new Human(age,name,coin,BET);
  you.showInfo();
    
    
   } 
}
