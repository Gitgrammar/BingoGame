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
  
    int [][]array=new int[3][3];
   
    if(BET==0){
      System.out.println("終了します。");
    }
   else{
      for(int i=0;i<=array.length;i++){
         for(int j=0;j<=i;j++){
             int pickedNum=rand.nextInt(9);
             array[i][j]=pickedNum;
         }
         System.out.println(Arrays.toString(array));
         System.out.println();
   }
    
   } 
}
}
