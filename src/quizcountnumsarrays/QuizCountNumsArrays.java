/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quizcountnumsarrays;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author tdissinger
 */
public class QuizCountNumsArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numbers x = new Numbers("numbers.txt");
        x.countNumbers();
        
        
    }
}

class Numbers{
  private int[] myData = new int[1000];
  private int myHowMany;

  public Numbers(String fileName){
    myHowMany = 0;
    this.loadFile(fileName); 
  }

  private void loadFile (String fileName){
  /* Loads text file numbers.txt into vector data.  Values are stored from
  positions 0..howMany-1.  Returns the number of data values as howMany */
  
    int  index=0;
    Scanner inFile;
    
    try{
    	inFile = new Scanner(new File(fileName));
    
    	while (inFile.hasNext()){
      		myData[index] = inFile.nextInt();
      		index++;
    	}
    	inFile.close();
    }catch(IOException i){
    	System.out.println("Error: " + i.getMessage());
    }
    myHowMany = index;
  }
  
  public void countNumbers(){
    System.out.println("Total numbers: " + myHowMany);
    int[] numArrays = new int[myHowMany];
    for(int i = 0; i < myData.length - 1; i++) {
        numArrays[myData[i]]++;
    }
    for(int i = 0; i <= 100; i++) {
        System.out.println(i + ":" + numArrays[i]);
    }
  }
}
