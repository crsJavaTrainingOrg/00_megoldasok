public class ParosSzamok
{
    
    public static long parosSzamokOsszeadasa (int elso, int utolso)
    {

        int i = elso;
        int osszeg = 0;
        
        while ( i<= utolso )
        {
            
            if ( i % 2 == 0 )
            {
                osszeg = osszeg +i;
            }
            i++;
        }
        return osszeg;
    }
}
   
    
    
