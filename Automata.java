public class Automata
{
    private int benntlevoosszeg;
    
    public Automata()
    {
        benntlevoosszeg = 0;
    }
    
    public Automata(int kezdoosszeg)
    {
        
        
        if ( oszthatoetizzelmaradekosan(kezdoosszeg) )
        {
            benntlevoosszeg = kezdoosszeg;
            
        }
        else
        { 
            System.out.println("Hiba! Bejövő összeg nem osztható 10-el");
        }
    }
        
    
    
    public String elerhetoosszeg()
    {   
       int tmp = benntlevoosszeg; 
       int szazasokSzama = tmp / 100;
       tmp = tmp - (100 * szazasokSzama);
       int otvenesekSzama = tmp / 50;
       tmp = tmp - (50 * otvenesekSzama);
       int tizesekSzama = tmp / 10;
       
       String eredmeny = "A megadott összeg címletezve: ";
       if (szazasokSzama >0)
       {
           eredmeny = eredmeny + "Százasok száma: " + szazasokSzama;
       }
       
       if (otvenesekSzama > 0 )
       {
           eredmeny = eredmeny + "Ötvenesek száma: " + otvenesekSzama;
       }
       
       if (tizesekSzama > 0 )
       {
           eredmeny = eredmeny + "Tízesek száma: " + tizesekSzama;
        }
       System.out.println(eredmeny); 
       return eredmeny; 
    }
    
    public boolean oszthatoetizzelmaradekosan(int szam)
    {
        boolean b = (szam % 10 == 0);
        return b;
    }
    
    public void megtoltes(int osszeg)
    {
        if (oszthatoetizzelmaradekosan(osszeg)  )
        {
            benntlevoosszeg = benntlevoosszeg + osszeg;
        }
        else 
        {
            System.out.println("Hiba! Bejövő összeg nem osztható 10-el");
        }
    }
    
    public int felvetel (int osszeg)
    {
        if (osszeg > 0 && osszeg <=this.benntlevoosszeg)
        {
            benntlevoosszeg = benntlevoosszeg - osszeg;
            return osszeg;
        }
        else
        {
            return 0;
        }
    }
}
