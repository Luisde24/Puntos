public class ejercicio
{

    public static void main(String[] args)
    {
         //otra manera de hacerlo
    // int[] luis = {21,23,24,28,20,31,30,35,21,24,24,32,29};
    int [] edad = new int [13];
      
      edad[0]=21;
      edad[1]=23;
      edad[2]=24;
      edad[3]=28;
      edad[4]=20;
      edad[5]=31;
      edad[6]=30;
      edad[7]=35;
      edad[8]=21;
      edad[9]=24;
      edad[10]=24;
      edad[11]=32;
      edad[12]=29;
     
     int  SumaEdad =0;
     for(int e:edad)
     {
          if(e == 20)
          {
               break;

          }
         SumaEdad = SumaEdad + e;


     }

    /* for (int i=0; i<edad.length; i++)
     {
          System.out.println(edad[i]);

     }
*/



     System.out.println(SumaEdad/edad.length);

    }



}
