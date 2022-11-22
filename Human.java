package BingoGame;

public class Human {
   int age;
   String name; 
   int coin;
   int BET;

   Human(int age,String name,int coin,int COIN){
    this.age=age;
    this.name=name;
    this.coin=coin;
    this.BET=BET;
   }
   public void showInfo(){
    
    if(this.age<18){
        System.out.println("18歳以下は利用できません");
       
    }
    else{
        System.out.printf("こんにちは%s(%d歳)さん%n残り枚数:%dBET枚数を入力。0で終了 1-100>",this.name,this.age,this.coin,this.BET);
    }
   }
   
}
