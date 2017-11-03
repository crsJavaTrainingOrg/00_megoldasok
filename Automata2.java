public class Automata2
{
    private int benntlevoosszeg;
    
    public Automata2()
    {
        benntlevoosszeg = 0;
    }
    
    public Automata2(int kezdoosszeg)
    {
    
            benntlevoosszeg = kezdoosszeg;
            
    }        
   
    public int elerhetoosszeg()
    {   
        return benntlevoosszeg;
      
    }
   
    public void megtoltes(int osszeg)
    {
      benntlevoosszeg = benntlevoosszeg + osszeg;
    }
    
    public String felvetel (int osszeg)
    {
       int tmp =osszeg; 
       int szazasokSzama = tmp / 100;
       tmp = tmp - (100 * szazasokSzama);
       int otvenesekSzama = tmp / 50;
       tmp = tmp - (50 * otvenesekSzama);
       int tizesekSzama = tmp / 10;
       String eredmeny ="A felvett összeg cimletezve: ";
       if (szazasokSzama >0)
       {
           eredmeny = eredmeny + "Százasok száma: " + szazasokSzama;
       }
       
       if (otvenesekSzama > 0 )
       {
           eredmeny = eredmeny + " Ötvenesek száma: " + otvenesekSzama;
       }
       
       if (tizesekSzama > 0 )
       {
           eredmeny = eredmeny + " Tízesek száma: " + tizesekSzama;
        }
       
        if (osszeg > 0 && osszeg <=benntlevoosszeg && osszeg % 10 == 0)
        {
            benntlevoosszeg = benntlevoosszeg - osszeg;
            System.out.println(eredmeny);
            return eredmeny;
            
        }
        else
        {
            return "0";
        }
        
    }
}