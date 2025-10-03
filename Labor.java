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
    public Labor(String gebaude, int stock, boolean beamer, int platze)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setPlatze(platze);
    }
    public Labor(String gebaude, int stock, boolean beamer)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setPlatze(25);
    }
    public Labor(String gebaude, int stock, int platze)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(true);
        setPlatze(platze);
    }
    public Labor(int stock)
    {
        setGebaude("B");
        setStock(stock);
        setBeamer(true);
        setPlatze(25);
    }
    public Labor()
    {
        setGebaude("B");
        setStock(2);
        setBeamer(true);
        setPlatze(25);
    }
    
    public void setGebaude(String gebaude)
    {
        // set the property gebaude to the value of the parameter newGebaude.
        this.gebaude = gebaude;
    }
        public void setStock(int stock)
    {
        // set the property stock to the value of the parameter newStock.
        this.stock = stock;
    }
        public void setBeamer(boolean beamer)
    {
        // set the property beamer to the value of the newBeamer.
        this.beamer = beamer;
    }
        public void setPlatze(int platze)
    {
        // set the property platze to the value of the newPlatze.
        this.platze = platze;
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
    
    //ifAbfrage:Eigenschaft:beamer/ kein beamer
    public void printLabor()
    {
     if(beamer == true)
        {
            System.out.println("Gebäude: " + gebaude + ", Stockwerk: " + stock + ".Stock, und ja, es gibt Beamer, Platzanzahl: " + platze + " Plätze sind vorhanden.");
        }
        else{
         System.out.println("Gebäude: " + gebaude + ", Stockwerk: " + stock + ".Stock, und nein, es gibt kein Beamer, Platzanzahl: " + platze + " Plätze sind vorhanden.");   
        }
    }
    }