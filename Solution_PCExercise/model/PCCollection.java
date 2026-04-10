package model;


import java.util.ArrayList;
/**
 * PC 
 * 
 * 
 * @author (Kis Boisen Hansen) 
 * @version (2010.04.06)
 */
public class PCCollection
{
    // instance variables - replace the example below with your own
    private ArrayList<PC> MyPCCollection; 
    private static PCCollection instance;

    /**
     * Constructor for objects of class PCCollection
     */
    private PCCollection()
    {
        MyPCCollection = new ArrayList<PC>();
    }
    
    public static PCCollection getInstance(){
        if(instance == null){
            instance = new PCCollection();
        }
        return instance;
    }

    public void tilfoejPC(PC nyPC)
    {
        MyPCCollection.add(nyPC);
    }

    //min/max template
    public int findBiggestHarddisk()
    {
        int index = 0;
        int maxHarddisk = 0;
        int rememIndex = 0;
        for(PC pcObjekt : MyPCCollection)
        {
            if(pcObjekt.getHardDiskSize() > maxHarddisk)
            {
                rememIndex = index;
                maxHarddisk = pcObjekt.getHardDiskSize();
            }
            index++;
        }
        return MyPCCollection.get(rememIndex).getSerialNumber();
    }

    public double findAverage()
    {
        int total = 0;
        for(PC pcObjekt : MyPCCollection)
        {
            total = total + pcObjekt.getHardDiskSize();
        }
        if(MyPCCollection.size() > 0 )
        {
            return total / MyPCCollection.size();
        }
        else{
            return 0;
        }
    }

    public PC findPCMRamsize(int ramSize)
    {
        PC pcObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < MyPCCollection.size() && !found)
        {
            pcObjekt = MyPCCollection.get(index); 
            if(pcObjekt.getRamSize() > ramSize)
            {
                found = true;
            }
            else{
                index++;
            }
        }//end while
        return MyPCCollection.get(index);
    }
    
    public PC findPCSerialNo(int serialNo)
    {
        PC pcObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < MyPCCollection.size() && !found)
        {
            pcObjekt = MyPCCollection.get(index); 
            if(pcObjekt.getSerialNumber() == serialNo)
            {
                found = true;
            }
            else{
                index++;
            }
        }//end while
        if(found){
            pcObjekt = MyPCCollection.get(index); 
        }
        else{
            pcObjekt = null;
        }
        return pcObjekt;
    }

    public ArrayList<PC> findAllLoans()
    {
        ArrayList<PC> loans = new ArrayList<PC>();
        for(PC pcObjekt : MyPCCollection)
        {
            if(!pcObjekt.isInOffice()) 
            {
                loans.add(pcObjekt);
            }
        }//end foreach
        return loans;
    }

}
