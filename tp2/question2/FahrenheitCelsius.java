package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
   
              int fahrenheit = 0;
              float celsius = 0;
  
          if(args != null && args.length > 0) // vérifier la valeur respect le condition (pas null et il a des valeurs)
        {
            for(int i=0; i < args.length; i++) // parcours args
            {
            try{
                fahrenheit = Integer.parseInt(args[i]); // convert valeur to integer
                celsius = fahrenheitEnCelsius(fahrenheit); // appel de la fonction fahrenheitEnCelsius(int f)
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // affiche le résultat obtenue                                                           // format
            
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
               
                                                                                
    }
     }
    }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       float fahrenheitToCelcius= (float)(5f/9f)*(f-32); 
        float result = (float) ((int)(fahrenheitToCelcius*10)) / 10f;

        return result;
     }

}
