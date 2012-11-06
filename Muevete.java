
package juego;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;

public class Muevete extends JFrame implements MisVariables,Runnable,KeyListener{

    Scanner teclado = new Scanner(System.in);
    public char seleccionada = letras.charAt((int)(Math.random()*26));
    public char seleccionada2 = letras.charAt((int)(Math.random()*26));
    public char seleccionada3 = letras.charAt((int)(Math.random()*26));
    public char seleccionada4 = letras.charAt((int)(Math.random()*26));
    public char seleccionada5 = letras.charAt((int)(Math.random()*26));
    public char seleccionada6 = letras.charAt((int)(Math.random()*26));
    public char seleccionada7 = letras.charAt((int)(Math.random()*26));
    public char seleccionada8 = letras.charAt((int)(Math.random()*26));
    public char seleccionada9 = letras.charAt((int)(Math.random()*26));
    public char seleccionada10 = letras.charAt((int)(Math.random()*26));
    int puntos = 0;
    int vidas = 3;
    int nivel = 1;
    String dime;
    int puntosAcumulados=0;
    int acelera = 500;
    public char recoje ;
    public String convierteString;
    public String ponMayuscula;
    public char letraDigitada;
    int paSubstringDeLa1=0;
    int paSubstringDeLa2=0;
    int paSubstringDeLa3=0;
    int paSubstringDeLa4=0;
    int paSubstringDeLa5=0;
    int paSubstringDeLa6=0;
    int paSubstringDeLa7=0;
    int paSubstringDeLa8=0;
    int paSubstringDeLa9=0;
    int paSubstringDeLa10=0;
    
    
    JLabel s1 = new JLabel("");
    JLabel s2 = new JLabel("");

    public Muevete() 
    {
    add (s1,BorderLayout.NORTH);
    add (s2,BorderLayout.SOUTH);
    addKeyListener(this);

    }
    
    @Override
    public void run()
    {
        Thread duerme = new Thread();
        
        while(vidas > 0)
        {
            
            
            //Scanner teclado = new Scanner(System.in);
            //Thread duerme = new Thread();
            while(true) 
            {
                
                if(puntos >= 1000)
                {
                    nivel = nivel + 1;
                    puntosAcumulados = puntosAcumulados + 1000;
                    acelera = acelera - 50;
                    puntos = puntos - 1000;
                }
                //Mi cls pal CMD
                for (int j = 0; j < 30; j++) 
                {
                    System.out.println();
                }
                System.out.println("Puntos del Nivel Actual: "+puntos);
                System.out.println("Puntos Acumulados: "+puntosAcumulados);
                System.out.println("Vidas: "+vidas+"\t\t\t\t\tNivel: "+nivel);
                //System.out.println("paSub2: "+paSubstringDeLa2);
                //System.out.println("paSub3: "+paSubstringDeLa3);
                //System.out.println("Puntos Acumulados: "+puntosAcumulados+"\t\t\t\tAcelera: "+acelera);
                //System.out.printf("Vidas: %\t\t\t\t\tNivel: %",vidas,nivel);
                System.out.println("*************************************************************");
                
                if(nivel == 1 )
                {
                    paSubstringDeLa1+=1;
                    System.out.println(linea.substring(paSubstringDeLa1-1) +seleccionada);
                }
                else if(nivel == 2 || nivel ==3)
                {
                    paSubstringDeLa1+=1;
                    paSubstringDeLa2+=1;
                    System.out.println(linea.substring(paSubstringDeLa1-1) +seleccionada);
                    System.out.println(linea.substring(paSubstringDeLa2-1) +seleccionada2);
                }
                else if(nivel == 4 || nivel ==5)
                {
                    paSubstringDeLa1+=1;
                    paSubstringDeLa2+=1;
                    paSubstringDeLa3+=1;
                    paSubstringDeLa4+=1;
                    System.out.println(linea.substring(paSubstringDeLa1-1) +seleccionada);
                    System.out.println(linea.substring(paSubstringDeLa2-1) +seleccionada2);
                    System.out.println(linea.substring(paSubstringDeLa3-1) +seleccionada3);
                    System.out.println(linea.substring(paSubstringDeLa4-1) +seleccionada4);
                }
                else if(nivel == 6 || nivel == 7 || nivel ==8)
                {
                    paSubstringDeLa1+=1;
                    paSubstringDeLa2+=1;
                    paSubstringDeLa3+=1;
                    paSubstringDeLa4+=1;
                    paSubstringDeLa5+=1;
                    paSubstringDeLa6+=1;
                    System.out.println(linea.substring(paSubstringDeLa1-1) +seleccionada);
                    System.out.println(linea.substring(paSubstringDeLa2-1) +seleccionada2);
                    System.out.println(linea.substring(paSubstringDeLa3-1) +seleccionada3);
                    System.out.println(linea.substring(paSubstringDeLa4-1) +seleccionada4);
                    System.out.println(linea.substring(paSubstringDeLa5-1) +seleccionada5);
                    System.out.println(linea.substring(paSubstringDeLa6-1) +seleccionada6);
                }
                else if(nivel == 9 || nivel <=12)
                {
                    paSubstringDeLa1+=1;
                    paSubstringDeLa2+=1;
                    paSubstringDeLa3+=1;
                    paSubstringDeLa4+=1;
                    paSubstringDeLa5+=1;
                    paSubstringDeLa6+=1;
                    paSubstringDeLa7+=1;
                    paSubstringDeLa8+=1;
                    paSubstringDeLa9+=1;
                    System.out.println(linea.substring(paSubstringDeLa1-1) +seleccionada);
                    System.out.println(linea.substring(paSubstringDeLa2-1) +seleccionada2);
                    System.out.println(linea.substring(paSubstringDeLa3-1) +seleccionada3);
                    System.out.println(linea.substring(paSubstringDeLa4-1) +seleccionada4);
                    System.out.println(linea.substring(paSubstringDeLa5-1) +seleccionada5);
                    System.out.println(linea.substring(paSubstringDeLa6-1) +seleccionada6);
                    System.out.println(linea.substring(paSubstringDeLa7-1) +seleccionada7);
                    System.out.println(linea.substring(paSubstringDeLa8-1) +seleccionada8);
                    System.out.println(linea.substring(paSubstringDeLa9-1) +seleccionada9);
                }
                else if(nivel >=13)
                {
                    paSubstringDeLa1+=1;
                    paSubstringDeLa2+=1;
                    paSubstringDeLa3+=1;
                    paSubstringDeLa4+=1;
                    paSubstringDeLa5+=1;
                    paSubstringDeLa6+=1;
                    paSubstringDeLa7+=1;
                    paSubstringDeLa8+=1;
                    paSubstringDeLa9+=1;
                    paSubstringDeLa10+=1;
                    System.out.println(linea.substring(paSubstringDeLa1-1) +seleccionada);
                    System.out.println(linea.substring(paSubstringDeLa2-1) +seleccionada2);
                    System.out.println(linea.substring(paSubstringDeLa3-1) +seleccionada3);
                    System.out.println(linea.substring(paSubstringDeLa4-1) +seleccionada4);
                    System.out.println(linea.substring(paSubstringDeLa5-1) +seleccionada5);
                    System.out.println(linea.substring(paSubstringDeLa6-1) +seleccionada6);
                    System.out.println(linea.substring(paSubstringDeLa7-1) +seleccionada7);
                    System.out.println(linea.substring(paSubstringDeLa8-1) +seleccionada8);
                    System.out.println(linea.substring(paSubstringDeLa9-1) +seleccionada9);
                    System.out.println(linea.substring(paSubstringDeLa10-1) +seleccionada10);
                }
                
                
            
            
                //System.out.println(linea+seleccionada);
                System.out.println("\n\n\n*************************************************************");
                try 
                {
                    duerme.sleep(acelera);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Muevete.class.getName()).log(Level.SEVERE, null, ex);
                }
                //System.out.print("Aqui: ");
                if(paSubstringDeLa1 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa1=0;
                }
                if(paSubstringDeLa2 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa2=0;
                }
                if(paSubstringDeLa3 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa3=0;
                }
                if(paSubstringDeLa4 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa4=0;
                }
                if(paSubstringDeLa5 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa5=0;
                }
                if(paSubstringDeLa6 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa6=0;
                }
                if(paSubstringDeLa7 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa7=0;
                }
                if(paSubstringDeLa8 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa8=0;
                }
                if(paSubstringDeLa9 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa9=0;
                }
                if(paSubstringDeLa10 >= cont)
                {
                    vidas = vidas - 1;
                    paSubstringDeLa10=0;
                }
                
                if(letraDigitada == seleccionada)
                {
                    puntos +=100;
                    paSubstringDeLa1=0;
                    seleccionada = letras.charAt((int)(Math.random()*26));
                }
                
                if(letraDigitada == seleccionada2)
                {
                    puntos +=100;
                    paSubstringDeLa2=0;
                    seleccionada2 = letras.charAt((int)(Math.random()*26));
                }
                
                if(letraDigitada == seleccionada3)
                {
                    puntos +=100;
                    paSubstringDeLa3=0;
                    seleccionada3 = letras.charAt((int)(Math.random()*26));
                }
                if(letraDigitada == seleccionada4)
                {
                    puntos +=100;
                    paSubstringDeLa4=0;
                    seleccionada4 = letras.charAt((int)(Math.random()*26));
                }
                
                if(letraDigitada == seleccionada5)
                {
                    puntos +=100;
                    paSubstringDeLa5=0;
                    seleccionada5 = letras.charAt((int)(Math.random()*26));
                }
                
                if(letraDigitada == seleccionada6)
                {
                    puntos +=100;
                    paSubstringDeLa6=0;
                    seleccionada6 = letras.charAt((int)(Math.random()*26));
                }
                if(letraDigitada == seleccionada7)
                {
                    puntos +=100;
                    paSubstringDeLa7=0;
                    seleccionada7 = letras.charAt((int)(Math.random()*26));
                }
                
                if(letraDigitada == seleccionada8)
                {
                    puntos +=100;
                    paSubstringDeLa8=0;
                    seleccionada8 = letras.charAt((int)(Math.random()*26));
                }
                
                if(letraDigitada == seleccionada9)
                {
                    puntos +=100;
                    paSubstringDeLa9=0;
                    seleccionada9 = letras.charAt((int)(Math.random()*26));
                }
                if(letraDigitada == seleccionada10)
                {
                    puntos +=100;
                    paSubstringDeLa10=0;
                    seleccionada10 = letras.charAt((int)(Math.random()*26));
                }
                
                if(vidas <= 0)
                {
                    break;
                }
            }
        }
        if(vidas <= 0)
        {
            for (int j = 0; j < 20; j++) 
                {
                    System.out.println();
                }
            
            System.out.println("\t\t\t\t\t SyC Game\n");
            System.out.println("\t\t\t\t\tGAME OVER");
            
            
            System.out.println("\n\n\t\t\t\t\tResultados\n\n\n");
            System.out.println("\t  Puntos Acumulados: "+(puntosAcumulados+puntos) +"\t\t\t Vidas: "+0+"\t\t\tNivel: "+nivel);
            for (int j = 0; j < 5; j++) 
                {
                    System.out.println();
                }
            
            
            int again = 0;
            boolean pcion = true;
            int erro = 0;
            
            while(pcion == true)
            {
                for (int j = 0; j < 5; j++) 
                {
                    System.out.println();
                }
                
                System.out.println("Desea jugar otra partida?"
                    + "\n1- Si"
                    + "\n2- No");
                System.out.print("Digite su respuesta: ");
                
                try
                {
                    again = Integer.parseInt(teclado.next());
                    if (again == 1)
                    {
                        pcion = false;
                    }
                    else if (again == 2)
                    {
                        pcion = false;
                    }
                    else
                    {
                        erro+=1;
                        if(erro < 3)
                        {
                            for (int x = 0; x < 100; x++) 
                            {
                                System.out.println();
                            }
                            System.out.println("Digitó un número fuera de orden..."
                                + "\nAsegurese de pulsar 1 o 2 de acuerdo a su respuesta.");
                            try {
                                duerme.sleep(4000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Muevete.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        if(erro >= 3)
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
                            pcion=false;
                            System.exit(0);
                        }
                    }
                }
                catch(NumberFormatException e)
                {
                    erro+=1;
                    if(erro < 3)
                    {
                        for (int j = 0; j < 50; j++) 
                        {
                            System.out.println();
                        }
                    
                        System.out.println("Digitó una opcion incorrecta...\n\n"
                            + "Asegurese de responder precionando 1 o 2 de acuerdo a su respuesta.");
                        try {
                            duerme.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Muevete.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(erro >= 3)
                {
                   pcion = false;
                   break;
                }
               
            }
            switch(again)
            {
                case 1:
                {
                    for (int x = 0; x < 20; x++) 
                            {
                                System.out.println();
                            } 
                    System.out.println("<--- Precione ese boton...");
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\t\t\t           ^");
                    System.out.println("\t\t\t           |");
                    System.out.println("\t\t\t           |");
                    System.out.println("\t\t\tLea arriba |");
                    for (int x = 0; x < 20; x++) 
                            {
                                System.out.println();
                            }
                    System.exit(0);
                }
                    break;
                case 2:
                {
                    System.exit(0);
                }
                    break;
            }
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent s) {
        s2.setText("Introdució: " + s.getKeyChar());
        s1.setText("                                                                  Control");
        
        
        recoje = s.getKeyChar();
        convierteString = (new StringBuffer().append(recoje)).toString();
        ponMayuscula = convierteString.toUpperCase();
        letraDigitada = ponMayuscula.charAt(0);
       
    }
}
