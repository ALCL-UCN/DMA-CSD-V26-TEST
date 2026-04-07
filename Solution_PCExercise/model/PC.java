package model;


/**
 * 
 * Opgave 1 
 * 
 * @author (Kis BOisen Hansen) 
 * @version (2010.04.06)
 */
public class PC
{
    private int    serialNumber;
    private String processor;
    private int    hardDiskSize;
    private int    ramSize;
    private String operationalSystem;
    private String monitorType;
    private String graphicCard;
    private boolean loan; // true = in office

    public PC(int newSNumber, String newProcessor)
    {
        serialNumber = newSNumber;
        processor = newProcessor;
        loan = true; // is at home
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public String getProcessor()
    {
        return processor;
    }

    public int getHardDiskSize()
    {
        return hardDiskSize;
    }

    public int getRamSize()
    {
        return ramSize;
    }

    public String getOperationalSystem()
    {
        return operationalSystem;
    }

    public String getMonitorType()
    {
        return monitorType;
    }

    public String getGraphicCard()
    {
        return graphicCard;
    }

    public boolean getLoan()
    {
        return loan;
    }

    public boolean isInOffice()
    {
        return getLoan();
    }

    public void setSerialNumber(int newSNumber)
    {
        serialNumber = newSNumber;
    }

    public void setProcessor(String newProcessor)
    {
        processor = newProcessor;
    }

    public void setHardDiskSize(int newSize)
    {
        hardDiskSize =  newSize;
    }

    public void setRamSize(int nySize)
    {
        ramSize = nySize;
    }

    public void setOperationalSystem(String newOS)
    {
        operationalSystem = newOS;
    }

    public void setMonitorType(String newMonitorType)
    {
        monitorType = newMonitorType;
    }

    public void setGraphicCard(String newGraphicCard)
    {
        graphicCard = newGraphicCard;
    }

    public void setloan(boolean newState)
    {
        loan = newState;
    }
}
