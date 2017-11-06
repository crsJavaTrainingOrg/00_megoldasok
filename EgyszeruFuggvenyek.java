public class EgyszeruFuggvenyek
{
    public static long faktorialis(int n){
        
        int i = 1;
        
        int faktorialis = 1;
        
        while (i < n)
        {
            i++;
            faktorialis = faktorialis * i;
        }
        return faktorialis;
    }
    
    public static double e (int x)
    {
        /*double osszeg = 1;
        
        for(int i = 1; i <= 9; i++){
            osszeg = osszeg + Math.pow(x,i)/faktorialis(i);
        }
        return osszeg;*/
        return Math.exp(x);
    }
}
    
   
        
  
        
        
    
    


 

    
    
    
    
    
    
    
    
    
 



        
    
