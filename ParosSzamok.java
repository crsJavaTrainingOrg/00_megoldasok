public class ParosSzamok
{
    
    public static long parosSzamokOsszeadasa (int elso, int utolso)
    {

    int y = utolso;
    int i = elso;
    int osszeg = 0;
    
    while ( i<y )
    {
    
    i++;
    
    if (i < y && i % 2 == 0)
    {
        osszeg = osszeg +i;
    }
    
    
    }
    return osszeg;
    }
}
   
    
    
