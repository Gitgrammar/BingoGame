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
    System.out.print("BET枚数を入力。0で終了　1-100>");
    int BET=sc.nextInt();
    Random rand=new Random();
    
   
    if(BET==0){
      System.out.println("終了します。");
    }
   else{
      Human you=new Human(age,name,coin,BET);
      for(int i=0;i<BET;i++){
         int select=rand.nextInt(100)+1;
         System.out.println(select);
       }
  you.showInfo();
   }
    
   } 
}
