package BingoGame;

public class Human {
   int age;
   String name; 

   Human(int age,String name){
    this.age=age;
    this.name=name;
   }
   void showInfo(){
    System.out.printf("こんにちは%s(%d歳)さん");
    if(this.age<18){
        System.out.println("18歳以下は利用できません");
    }
   }
   
}
