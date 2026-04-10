package tui;
import control.*;
import model.*;


import java.util.Scanner;
/**
 * Write a description of class MainMenu here.
 * 
 * @author (Kis Boisen Hansen, Anita Lykke Clemmensen) 
 * @version (2010.04.08, 2013.10.30)
 * Anita
 */
public class Menu
{
    private PCController pcCon;
    
    public Menu()
    {
        System.out.println("Singelton Execercise and layer exercise");
        pcCon = new PCController();
    }

    public void start()
    {
        mainMenuStart();
    }

    private void mainMenuStart()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            int choice = writeMainMenu();
            if(choice == 1)
            {
                startCreatePC();
            }
            else{
                if(choice == 2){ 
                    startFindPC();
                }
                else{
                    if(choice == 3){
                        //start?????
                    }//end if
                    else{
                        writeEnd();
                        exit = true;
                    }//end else
                }// end else
            }//end else
        }//end while
    }//end start

    private int writeMainMenu()
    {       
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** MainMenu ***");
        System.out.println(" (1)Create PC");
        System.out.println(" (2)Find PC");
        System.out.println(" (3) ");
        System.out.println(" (4) Close");
        System.out.print("\n Make your choice: ");

        int choise = keyboard.nextInt();

        return choise;
    }

    private void startCreatePC()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter serial number ");
        int inSerialNo = keyboard.nextInt();
        System.out.println("Enter processor ");
        String inProcessor = keyboard.next();

        //here you need to read more and
        //call the rigth methods
        PC pc = pcCon.createPC(inSerialNo, inProcessor);
        System.out.println("PC with serialnumber " + pc.getSerialNumber() + " is created");
        pause();
    }
    
    private void startFindPC()
    {
        //Finish the find PC       
    }

    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }

    private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        String wait = keyboard.nextLine();
    }

}
