public class Labor 
{
    private String gebaude; // In welche Gebaude der Labor sich befindet
    private int stock;      // In welcher Stock der Labor sich befindet
    private boolean beamer; // Ob der Labor beamer hat oder nicht (Ja oder Nein)
    private int platze;     // Wie vile Plätze im Labor gibt
    
    //Constructor
    /*
     * It is creating a new Instance of the class Labor.
     */
    public Labor(String newGebaude, int newStock, boolean newBeamer, int newPlatze)
    {
        setGebaude(newGebaude);
        setStock(newStock);
        setBeamer(newBeamer);
        setPlatze(newPlatze);
    }
    
    public void setGebaude(String newGebaude)
    {
        // set the property gebaude to the value of the parameter newGebaude.
        gebaude = newGebaude;
    }
    
    public void setStock(int newStock)
    {
        // set the property stock to the value of the parameter newStock.
        stock = newStock;
    }
    
    public void setBeamer(boolean newBeamer)
    {
        // set the property beamer to the value of the newBeamer.
        beamer = newBeamer;
    }
    
    public void setPlatze(int newPlatze)
    {
        // set the property platze to the value of the newPlatze.
        platze = newPlatze;
    }
    
    public String getGebaude()
    {
        return gebaude;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
    
    public int getPlatze()
    {
        return platze;
    }
    }