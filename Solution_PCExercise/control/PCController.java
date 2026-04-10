package control;
import model.*;


/**
 * Write a description of class PCController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PCController
{
    // instance variables - replace the example below with your own
    private PCCollection pcc;
    private PC pc;

    /**
     * Constructor for objects of class PCController
     */
    public PCController()
    {
        // initialise instance variables
        pcc = PCCollection.getInstance();

    }
    
    public PC createPC(int serialNO, String processor){
        pc = new PC(serialNO, processor);
        pcc.tilfoejPC(pc);
        return pc;
        
    }

    public PC findPCDev2(int serialNo){
        return pcc.findPCSerialNo(serialNo);
    }

}