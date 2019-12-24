import java.util.Scanner;
public class Taller2
{


    public static void main(String[] args)
    {
         System.out.println("******Taller 2 de Personal Soft******");
          System.out.println("");
        Taller2 operacion = new Taller2();
        operacion.punto1();
         System.out.println("");
      operacion.NominaSemanal();

    }

    public void punto1()
    {
        int   a =5, b=3, c=-12, d=24;

      boolean  m = ( ( a > b*d) || !( ( --d < b++ ) && true));
        
           System.out.println("El Resultado del literal m es: " + m);


     boolean  n = (b == d--) && !(!(c * c < d * a));
        
            System.out.println("El Resultado del literal n es: " + n);

     boolean x = !false && (b > c || a < d ) || false ;

            System.out.println("El Resultado del literal n es: " + x);
        

    }

    public void NominaSemanal()
    {
       
        
         Scanner teclado = new Scanner(System.in);   
        double SalarioNeto =0.0, nHoras=0.0,  impuestos =0.0;

      
        for(int i =0; i<10; i++)
        {
            System.out.println("Ingrese las horas trabajadas"); 
            nHoras = teclado.nextDouble();
            
             if(nHoras <= 35)
             {

               SalarioNeto= nHoras* 15;
               System.out.println("La Nomina Semanal del trabajador es de: " + SalarioNeto + " Dolares");

             } 
             else if(nHoras > 35) 
             {
             SalarioNeto= (nHoras * 15) + 20;
             System.out.println("La Nomina Semanal del trabajador es de: " + SalarioNeto + " Dolares");
             }

             if (SalarioNeto <= 530) {  System.out.println("**ESTAS LIBRE DE IMPUESTOS**");
             }
             else if(SalarioNeto > 530)
             {
                 impuestos = (SalarioNeto-530)*0.3 + (SalarioNeto-550)*0.4; 
                 System.out.println("El impuesto a cancelar es de: " +impuestos+ " Dolares" );
             }

             
        }


       

    }
}



      
      /*  if(Htrabajadas <= 35)
        {

        SalarioNeto= nHoras* 15;
            System.out.println("La Nomina Semanal del trabajador es de: " + SalarioNeto);

        }else if(Htrabajadas > 35) 
        {
             SalarioNeto= (nHoras * 15) + 20;
             System.out.println("La Nomina Semanal del trabajador es de: " + SalarioNeto);
        }

         //impuestos a deducir 
        
        if (SalarioNeto <= 530)
        {
            System.out.println("**Estas Librede Impuestos**");

        }
        else if (SalarioNeto >= 560)
        {
             impuestos = (SalarioNeto - 530)

        }
*/
    


