package juego;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Juego extends Thread{

    
    public static void main(String[] args) throws InterruptedException 
    {
         
        Muevete muevete = new Muevete();   
        Scanner teclado = new Scanner(System.in);
        Thread duerme = new Thread();
        int dime=0;
        int error=0;
        boolean opcion = true;
         
        muevete.setSize(0,0);
        muevete.setVisible(true);
        
        //Intro del juego
        for (int j = 0; j < 20; j++) 
            {
                System.out.println();
            }
            
            System.out.println("\t\t\t     SyC Game\n");
            System.out.println("\t\t\tBienvenido a MPJJ");
            //MI cls pa la consola
            for (int j = 0; j < 15; j++) 
                {
                    System.out.println();
                }
            
            try 
            {
                duerme.sleep(3000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Muevete.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Consulte con SERGIO ENCARNACION para soporte de MPJJ");
            }
            //MI cls pa la consola
            for (int j = 0; j < 50; j++) 
                {
                    System.out.println();
                }
            
            
            
            while(opcion == true)
            {
                for (int j = 0; j < 100; j++) 
                {
                    System.out.println();
                }
                
                System.out.println("Usted ha usado MPJJ antes?\n"
                    + "1-Si\n"
                    + "2-No\n\n");
                System.out.print("Digite su respuesta: ");
                
                try
                {
                    dime = Integer.parseInt(teclado.next());
                    if (dime == 1)
                    {
                        opcion = false;
                    }
                    else if (dime == 2)
                    {
                        opcion = false;
                    }
                    else
                    {
                        error+=1;
                        if(error < 3)
                        {
                            for (int x = 0; x < 100; x++) 
                            {
                                System.out.println();
                            }
                            System.out.println("Digitó un número fuera de orden..."
                                + "\nAsegurese de pulsar 1 o 2 de acuerdo a su respuesta.");
                            duerme.sleep(4000);
                        }
                        
                        if(error >= 3)
                        {
                            for (int x = 0; x < 100; x++) 
                            {
                                System.out.println();
                            }
                            System.out.println("\tUsted exedió el nivel de errores del juego");
                            System.out.println("\t\t       Hasta Luego...");
                            for (int x = 0; x < 15; x++) 
                            {
                                System.out.println();
                            }
                            opcion=false;
                            System.exit(0);
                        }
                    }
                }
                catch(NumberFormatException e)
                {
                    error+=1;
                    if(error < 3)
                    {
                        for (int j = 0; j < 50; j++) 
                        {
                            System.out.println();
                        }
                    
                        System.out.println("Digitó una opcion incorrecta...\n\n"
                            + "Asegurese de responder precionando 1 si ha utilizado MPJJ antes\n"
                            + "o precionando 2 si no ha utilizado MPJJ antes");
                        duerme.sleep(6000);
                    }
                }
                if(error >= 3)
                {
                   opcion = false;
                   break;
                }
               
            }
            
            switch(dime)
            {
                case 1:
                {
                    muevete.run();
                }
                    break;
                case 2:
                {
                    for (int j = 0; j < 50; j++) 
                    {
                        System.out.println();
                    }
                    
                    //Intrucciones y Funcionamiento del Juego
                    System.out.println("\t     Intrucciones y Funcionamiento del Juego"
                    + "\n\n\n"
                    + "\t\t\tFuncionamiento\n"
                    + "\n1- El programa muestra en pantalla letras del abecedario, las cuales\n"
                    + "   apareceran aleatoriamente."
                    + "\n2- Las letras se desplazan de derecha a izquierda, si alguna letra\n"
                    + "   toca el extremo izquierdo se restará una vida."
                    + "\n3- Mientras mas puntos alcanses el nivel, la velocidad y la cantidad \n"
                    + "   de letras de desplazamiento seran mayor."
                    + "\n4- El juego cuenta con un control, este control es una pequeña\n"
                    + "   pantallita fuera de lo que es la consola."
                    + "\n\n\n\t\t\tInstrucciones\n"
                    + "\n1- Espere que el programa inicie por completo."
                    + "\n2- Minimise el control, para que pueda responder una pregunta al inicio\n"
                    + "   del juego."
                    + "\n3- Una ves que aparezca la pantalla del juego, utilice el\n"
                    + "   control(La pantallita) para empesar a jugar."
                    + "\n4- Precione la tecla que corresponde a la letra que esta en pantalla,\n"
                    + "   recuerde que es un control no tiene que precionar ENTER."
                    + "\n5- !Demuestra tu agilidad con el teclado!");
                    for (int j = 0; j < 5; j++) 
                    {
                        System.out.println();
                    }
            
                    try 
                    {
                        duerme.sleep(25*1000);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(Muevete.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Consulte con SERGIO ENCARNACION para soporte de MPJJ");
                    }
                    
                    for (int j = 0; j < 30; j++) 
                    {
                        System.out.println();
                        try 
                        {
                            duerme.sleep(750);
                        } 
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(Muevete.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("Consulte con SERGIO ENCARNACION para soporte de MPJJ");
                        }
                    }
                    //MY CLS FOR CMD
                    for (int x = 0; x < 100; x++) 
                    {
                            System.out.println();
                    }
                    System.out.println("\n\n\t\t  Si llegaste hasta aquí... "
                            + "\n\n\t\tYOU ARE READY TO PLAY IN MPJJ");
                    for (int x = 0; x < 15; x++) 
                    {
                            System.out.println();
                    }
                    duerme.sleep(5000);
                    
                    int emergente = 5;
                    while(emergente >  0)
                    {
                        for (int x = 0; x < 50; x++) 
                        {
                            System.out.println();
                        }
                        System.out.println("\n\n\t\t\t"+emergente);
                        
                        for (int x = 0; x < 20; x++) 
                        {
                            System.out.println();
                        }
                        emergente-=1;
                        duerme.sleep(1000);
                    }
                    
                    
                    muevete.run();
                    
                }
                    break;
                default :
                {
                    for (int x = 0; x < 100; x++) 
                            {
                                System.out.println();
                            }
                            System.out.println("\tUsted exedió el nivel de errores del juego");
                            System.out.println("\t\t       Hasta Luego...");
                            for (int x = 0; x < 15; x++) 
                            {
                                System.out.println();
                            }
                    System.exit(0);
                }
                    break;
            }
    }
}