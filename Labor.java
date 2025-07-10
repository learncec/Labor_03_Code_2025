public class Labor 
{
    private String gebaude;
    private int stock;
    private boolean beamer;
    private int platze;
    
    public void setGebaude(String newGebaude)
    {
        gebaude = newGebaude;
    }
    
    public void setStock(int newStock)
    {
        stock = newStock;
    }
    
    public void setBeamer(boolean newBeamer)
    {
        beamer = newBeamer;
    }
    
    public void setPlatze(int newPlatze)
    {
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