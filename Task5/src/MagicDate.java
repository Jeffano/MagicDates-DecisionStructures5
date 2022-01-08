/**
 * Name: Jeffano John
 * Date: Thursday October 28th 2021
 * Student #: 251230759
 * Description: A MagicDate class is made to store the month,day and year and to check if it is a magic date
 */

public class MagicDate {
    //An int to hold the month,day,year
    private int month;
    private int day;
    private int year;

    //Initializing the Magic Date constructor
    public MagicDate(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    //Creating a isMagic method to calculate if the date is magic
    public boolean isMagic(){
        //Using an if statement and returning true if the date is a MagicDate and false if it isnt.
        if ((month * day) == year){
            return true;
        }
        else{
            return false;
        }
    }
}
