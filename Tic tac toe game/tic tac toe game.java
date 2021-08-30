package game;
import java.util.*;
public class TicTacToe {
	

	 // Compiler version JDK 11.0.2

	 
	   public static void main(String args[])
	   { 
	    Scanner sc = new Scanner(System.in);
	    
	    
	    boolean[] isEmpty = new boolean[9];
	    
	    for(int i = 0; i<9; i++) {
	      
	      isEmpty[i] = false;
	      
	    }
	    boolean running = true;
	    Random r = new Random();
	    int answer,cpu;
	    int stop = 1;
	    
	    String play;
	    
	    String[] pos = new String[9];
	    
	    for(int i = 0; i<9; i++) {
	      
	      pos[i] = " ";     
	    } 
	    while(running) {
	      
	    System.out.println("\nGive a number(1-9)");
	    answer = sc.nextInt();
	      
	    
	    if( answer == 1 && !isEmpty[0] ) {
	      
	      
	    pos[0] = "X";
	    isEmpty[0] = true;
	      
	     cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	          
	      
	    } 
	    
	    else if( answer == 2 && !isEmpty[1] ) {
	    
	    pos[1] = "X";
	    isEmpty[1] = true;
	    
	  
	    cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	    
	    }
	     
	  else if( answer == 3 && !isEmpty[2] ) {
	       
	       
	    pos[2] = "X";
	    isEmpty[2] = true;
	    
	      cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	          
	      
	    } 
	        
	    else if( answer == 4 && !isEmpty[3] ) {
	       
	       
	    pos[3] = "X";
	    isEmpty[3] = true;
	    
	    
	      cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	          
	    
	    }
	         
	   else if( answer == 5 && !isEmpty[4] ) {
	       
	       
	    pos[4] = "X";
	    isEmpty[4] = true;
	    
	     cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	          
	   
	   
	    } 
	    
	  else if( answer == 6 && !isEmpty[5] ) {
	       
	       
	    pos[5] = "X";
	    isEmpty[5] = true;
	    
	      cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	         
	  
	    } 
	      
	   else if( answer == 7 && !isEmpty[6] ) {
	       
	       
	    pos[6] = "X";
	    isEmpty[6] = true;
	    
	      cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	          
	    
	    
	    } 
	    
	  else if( answer == 8 && !isEmpty[7] ) {
	       
	       
	    pos[7] = "X";
	    isEmpty[7] = true;
	    
	     cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	           
	      
	    } 
	    
	   else if( answer == 9 && !isEmpty[8] ) {
	       
	       
	    pos[8] = "X";
	    isEmpty[8] = true;
	    
	  
	    cpu = r.nextInt(9);
	     
	     while(isEmpty[cpu]) {
	     
	      cpu = r.nextInt(9);
	     
	     }
	     
	     pos[cpu] = "O";
	     isEmpty[cpu] = true;
	     
	    System.out.println("");
	    System.out.println(pos[0] + "|" + pos[1] + "|" + pos[2]);
	    System.out.println("-+-+-");
	    System.out.println(pos[3] + "|" + pos[4] + "|" + pos[5]);
	    System.out.println("-+-+-");
	    System.out.println(pos[6] + "|" + pos[7] + "|" + pos[8]);
	          
	  
	      
	    } else {
	      
	      
	      System.out.println("The current position is not available,please give another : ");
	      
	      
	    }
	    
	    
	    if ( pos[0] == "X" && pos[1] == "X" && pos[2] == "X") {
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    
	    if( pos[3] == "X" && pos[4] == "X" && pos[5] == "X") {
	      
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    if( pos[6] == "X" && pos[7] == "X" && pos[8] == "X") {
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    if( pos[0] == "X" && pos[2] == "X" && pos[6] == "x") {
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    if( pos[1] == "X" && pos[4] == "X" && pos[7] == "X") {
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    if( pos[2] == "X" && pos[5] == "X" && pos[8] == "X") {
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    if ( pos[0] == "X" && pos[4] == "X" && pos[8] == "X") {
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    if( pos[2] == "X" && pos[4] == "X" && pos[6] == "X") {
	      
	      System.out.println("You won!");
	      stop = 0;
	      
	    }
	    
	    if ( stop == 0 ) {
	      
	    
	    System.out.println("\nDo you want to play again?(y/n)");
	    
	    play = sc.next();
	  
	    if( play.equals("y")) {
	      
	      for(int i = 0; i<9; i++) {
	        
	        pos[i] = " ";
	        isEmpty[i] = false;
	            
	      }  
	    } else {
	      
	      running = false;
	      
	    }
	    
	    stop = -1;
	    
	   }
	  

	  
	  }
	}
	 }
/*Give a number(1-9)
2

 |X|O
-+-+-
 | | 
-+-+-
 | | 

Give a number(1-9)
4

 |X|O
-+-+-
X| | 
-+-+-
O| | 

Give a number(1-9)
5

 |X|O
-+-+-
X|X| 
-+-+-
O|O| 

Give a number(1-9)
6

O|X|O
-+-+-
X|X|X
-+-+-
O|O| 
You won!

Do you want to play again?(y/n)
y

Give a number(1-9)
2

 |X|O
-+-+-
 | | 
-+-+-
 | | 

Give a number(1-9)
2
The current position is not available,please give another : 

Give a number(1-9)
*/


