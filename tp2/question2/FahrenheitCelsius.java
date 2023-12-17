package question2;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       int fahrenheit = 0;
       float celsius = 0F;
       for (int i=0;i<args.length;i++){
           try{
           // pour tous les param�tres de la ligne de commande
               fahrenheit  =Integer.parseInt(args[i]);
               celsius = fahrenheitEnCelsius(fahrenheit);
               System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
               
           } catch(NumberFormatException nfe){
                 System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
           }
        }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       //return 0.F;  // � compl�ter  en rempla�ant la valeur retourn�e par la fonction de conversion
       float c = (5F/9F)*(f-32);
       float r = ((int)(c*10))/10F;
       return r ;
       // ...
     }

}
