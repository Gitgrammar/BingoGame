
package BingoGame;
import java.util.*;
/**
 * Array
 */
public class Array {
    int i;
    int j;
    int[][]array=new int[i][j];


    Array(int i,int j,int[][]array){
        this.i=i;
        this.j=j;
        this.array=array;
    }
    Random rand=new Random();
    

    public void assign(){
        for(int i=0;i<=0;i++){
            for(int j=0;j<=i;j++){
                int pickedNum=rand.nextInt(9);
                array[i][j]=pickedNum;
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
        
    }

    
}