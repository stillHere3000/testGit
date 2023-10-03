/*
 * Design a class named Timer that contains the following three private instance data fields:
     hours: an integer that holds the number of hours. 
     minutes: an integer that holds the number of minutes. 
     seconds: an integer that holds the number of seconds. 

In addition, the class should have the following constructors and methods:
    1. A no-arg constructor that creates a default Timer object (The data fields hours, minutes, seconds are defaulted to 0). 
    2. A constructor that constructs a Timer object with three specified values for hours, minutes, and seconds. 
    3. Three public setter methods for the data fields hours, minutes and seconds. 
    4. Three public getter methods for the data fields hours, minutes and seconds.

    In the second constructor and three setter methods above, make sure that the three data fields are greater than or equal to 0. e.g., if the value used to set the data field hours is negative, you should then set hours to 0 instead. 
         Write a test program to do the following tasks:
    1. Prompt the user to enter three groups of values of hours, minutes and seconds and use these values to create an array of three Timer objects. 
    2. Calculate and print the total number of hours, minutes, and seconds in these three objects. 

A sample dialog is: 
Enter the first Timer object: 1 2 3             
Enter the second Timer object: 4 5 6
Enter the third Timer object: 7 8 -1
The total number of hours is 12                      (sum of 1, 4 and 7)
The total number of minutes is 15		  (sum of 2, 5, and 8)
The total number of seconds is 9 		  (sum of 3, 6 and 0)
 * 
 */

 //import java.sql.Time;
import java.util.Scanner;



public class TimerObj {

    private int numHours;
    private int numMinutes;
    private int numSeconds;

    static int totalHours=0;
    static int totalMinutes=0;
    static int totalSeconds=0;



    public TimerObj (){
        numHours= numMinutes= numSeconds= 0;
    }

    public TimerObj(int hrs, int mins, int secs){
        this.numHours= (hrs >= 0)? hrs: 0 ;
        this.numMinutes= (mins >= 0)? mins: 0 ;
        this.numSeconds= (secs >= 0)? secs: 0 ;

        totalHours =totalHours + this.numHours;        totalMinutes += this.numMinutes;         totalSeconds += this.numSeconds;

    }

    public void setNumHours(int hrs){
       this.numHours= (hrs >= 0)? hrs: 0 ;
    }

    public int getNumHours(){
        return this.numHours;
    }

    public void setMinutes(int mins){
        this.numMinutes= (mins >= 0)? mins: 0 ;
    }

    public int getMinutes(){
        return this.numMinutes;
    }

    public void setSeconds(int secs){
        this.numSeconds= (secs >= 0)? secs: 0 ;
    }

    public int getSeconds(){
        return this.numSeconds;
    }




    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the first timer object");
        Scanner userInput= new Scanner(System.in);
        TimerObj t1= captureTimerValues(userInput);
        System.out.println("Please enter the second timer object");
        TimerObj t2= captureTimerValues(userInput);
        System.out.println("Please enter the second timer object");
        TimerObj t3= captureTimerValues(userInput);

        System.out.println("Total number of Hours\t"+totalHours);  
        System.out.println("Total number of Minutes\t"+totalMinutes);
        System.out.println("Total number of Seconds\t"+totalSeconds);
        
    }

    public static TimerObj captureTimerValues(Scanner in ){
        int hrs, mins, secs; hrs= mins= secs= -99;
        for(int i = 0;  i < 3 ; i++){
           switch(i){                
                case 0:    hrs= in.nextInt();       break;
                case 1:    mins= in.nextInt();       break;
                case 2:    secs= in.nextInt();       break;
                default:                            break;
           }
        }
        return (new TimerObj(hrs, mins, secs)); 
    }

    
}
