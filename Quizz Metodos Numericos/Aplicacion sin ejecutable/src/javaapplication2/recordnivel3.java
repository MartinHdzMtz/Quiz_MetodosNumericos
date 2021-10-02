/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asus-01
 */
public class recordnivel3 extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public recordnivel3() {
        initComponents();
        this.setLocationRelativeTo(null);
                this.setExtendedState(MAXIMIZED_BOTH);

        String nombre;
        nombre=JOptionPane.showInputDialog(null,"Cual es tu nombre?:");
          Scanner entrada=new Scanner(System.in);
        int i;
        int matriz[][] = new int[4][4];
        long TInicio, TFin, tiempo,tiempousuario; 
	int n,S,pts=0;
 TInicio = System.currentTimeMillis();
	double resp= -.768036346,a=0,b=0,c=0,resp2=-9.9995459008,resp3=0.258649806047;
	double Newton1= 1.409852575,Newton2=1.368808108, Newton3=1.2909944487358174;
	double Sec1=4.666666666666667,Sec2=1.2453623915798546, Sec3=0.6204898940571983;
	double Fal1= 0.567143306, Fal2= 5.791287925524515,Fal3=3.162277658817041;
	double Bis1=.3087,Bis2=21.5,Bis3=2.90389012795893;
	String limite;
		Random rnd = new Random();
		double Q;
		n= (int)(rnd.nextDouble() *3 +1); // Punto Fijo
			// aleatorios de punto fijo
			switch(n){
		// problema 1
		case 1:
		  n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=resp;
			   b=resp- Q+n;
			   c=Q*resp+2-n;
			   break;
			   case 2:
			   b=resp;
			   a=resp-Q*n;
			   c=Math.pow(Q,Q) +n;
			   break;
			   case 3: 
			   c=resp;
			   a=resp+Q+n;
			   b= (resp*Q)/n;
			   break;
			    default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t y= 2x - e^x +2\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==resp){
			pts++;
		}
	}
	if(S==2){
		if(b==resp){
		pts++;
		}
	}
	if(S==3){
		if(c==resp){
		pts++;
		}
	}
	break;
	
	//problema 2
	case 2:
	 n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=resp2;
			   b=resp2- Q+n;
			   c=Q*resp2+n-Q+1;
			   break;
			   case 2:
			   b=resp2;
			   a=resp2-Q*n;
			   c=Math.pow(Q,n) +n;
			   break;
			   case 3: 
			   c=resp2;
			   a=resp2+Q+n;
			   b= (resp2*Q)/n;
			   break;
			    default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t y=e^a - 10-x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==resp2){
			pts++;
		}
	}
	if(S==2){
		if(b==resp2){
		pts++;
		}
	}
	if(S==3){
		if(c==resp2){
		pts++;
		}
	}
	break;
	//problema 3
	case 3:
	 n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=resp3;
			   b=resp3- Q+n;
			   c=Q*resp3+n-Q+1;
			   break;
			   case 2:
			   b=resp3;
			   a=resp3-Q*n;
			   c=Math.pow(Q,n) +n;
			   break;
			   case 3: 
			   c=resp3;
			   a=resp2+Q+n;
			   b= (resp3*Q)/n;
			   break;
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t y=(2-3a)/(4a^2 +5+a)\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==resp3){
			pts++;
		}
	}
	if(S==2){
		if(b==resp3){
		pts++;
		}
	}
	if(S==3){
		if(c==resp3){
		pts++;
		}
	}	break;
			} // fin del switch punto fijo
			
			
			//---------------------------
			
			
			
			
			
			// Newton_Raphson
			n= (int)(rnd.nextDouble() *3 +1);
			// aleatorios de Newton-Raphson
			switch(n){
				case 1: // PROBLEMA 1
	 n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Newton1;
			   b=Newton1- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Newton1;
			   a=Newton1-Q*n;
			   c=Math.pow(Q,n) +n+Newton1;
			   break;
			   case 3: 
			   c=Newton1;
			   a=resp2+Q+n;
			   b= (Newton1*Q)/n;
			   break;
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t y=0.8x^2 +x -3\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Newton1){
			pts++;
		}
	}
	if(S==2){
		if(b==Newton1){
		pts++;
		}
	}
	if(S==3){
		if(c==Newton1){
		pts++;
		}
	}	
	break; 
	// PROBLEMA 2
	case 2:
				n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Newton2;
			   b=Newton2- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Newton2;
			   a=Newton1-Q*n;
			   c=Math.pow(Q,n) +n+Newton2;
			   break;
			   case 3: 
			   c=Newton2;
			   a=resp2+Q+n;
			   b= (Newton3*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t f(x)= x^3 + 2x^2 + 10x - 20\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Newton2){
			pts++;
		}
	}
	if(S==2){
		if(b==Newton2){
		pts++;
		}
	}
	if(S==3){
		if(c==Newton2){
		pts++;
		}
	}	
	break;
	// Problema 3
	case 3: 
	n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Newton3;
			   b=Newton3- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Newton3;
			   a=Newton3-Q*n;
			   c=Math.pow(Q,n) +n+Newton2;
			   break;
			   case 3: 
			   c=Newton3;
			   a=resp2+Q+n;
			   b= (Newton2*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t f(x)=3x^2 -5\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Newton3){
			pts++;
		}
	}
	if(S==2){
		if(b==Newton3){
		pts++;
		}
	}
	if(S==3){
		if(c==Newton3){
		pts++;
		}
	}	
	break;
				
			} // fin de Newton-Raphson
			
			
			// Falsa Posicion
			
			n= (int)(rnd.nextDouble() *3 +1);
			// aleatorios de Falsa Posicion
			switch(n){
				case 1: // PROBLEMA 1
	 n= (int)(rnd.nextDouble() *2 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Fal1;
			   b=Fal1- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Fal1;
			   a=Sec2-Q*n;
			   c=Math.pow(Q,n) +n+Newton1;
			   break;
			   case 3: 
			   c=Fal1;
			   a=Fal1+Q+n;
			   b= (Sec3*Q)/n;
			   break;
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \tf(x)=e^-x -x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Fal1){
			pts++;
		}
	}
	if(S==2){
		if(b==Fal1){
		pts++;
		}
	}
	if(S==3){
		if(c==Fal1){
		pts++;
		}
	}	
	break; 
	// PROBLEMA 2
	case 2:
				n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Fal2;
			   b=Fal2- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Fal2;
			   a=Newton1-Q*n;
			   c=Math.pow(Q,n) +n+Sec2;
			   break;
			   case 3: 
			   c=Fal2;
			   a=resp2+Q+n;
			   b= (Fal2*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t f(x)= (x+2)^.5 - x + 3\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Fal2){
			pts++;
		}
	}
	if(S==2){
		if(b==Fal2){
		pts++;
		}
	}
	if(S==3){
		if(c==Fal2){
		pts++;
		}
	}	
	break;
	// Problema 3
	case 3: 
	n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Fal3;
			   b=Newton3- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Fal3;
			   a=Fal3-Q*n;
			   c=Math.pow(Q,n) +n+Newton2;
			   break;
			   case 3: 
			   c=Fal3;
			   a=resp2+Q+n;
			   b= (Fal3*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t f(x)=x^2- 10\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Fal3){
			pts++;
		}
	}
	if(S==2){
		if(b==Fal3){
		pts++;
		}
	}
	if(S==3){
		if(c==Fal3){
		pts++;
		}
	}	
	break;
				
			}  // fin de Falsa Posicion
			
			
		 // Secante
		 n= (int)(rnd.nextDouble() *3 +1);
			// aleatorios de Secante
			switch(n){
				case 1: // PROBLEMA 1
	 n= (int)(rnd.nextDouble() *2 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Sec1;
			   b=Sec1- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Sec1;
			   a=Sec1-Q*n;
			   c=Math.pow(Q,n) +n+Newton1;
			   break;
			   case 3: 
			   c=Sec1;
			   a=Sec3+Q+n;
			   b= (Sec3*Q)/n;
			   break;
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n\tf(x)=3x - 14  1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Sec1){
			pts++;
		}
	}
	if(S==2){
		if(b==Sec1){
		pts++;
		}
	}
	if(S==3){
		if(c==Sec1){
		pts++;
		}
	}	
	break; 
	// PROBLEMA 2
	case 2:
				n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Sec2;
			   b=Newton2- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Sec2;
			   a=Newton1-Q*n;
			   c=Math.pow(Q,n) +n+Sec2;
			   break;
			   case 3: 
			   c=Sec2;
			   a=resp2+Q+n;
			   b= (Sec2*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t f(x)= 5x^2 - 9+ x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Sec2){
			pts++;
		}
	}
	if(S==2){
		if(b==Sec2){
		pts++;
		}
	}
	if(S==3){
		if(c==Sec2){
		pts++;
		}
	}	
	break;
	// Problema 3
	case 3: 
	n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Sec3;
			   b=Newton3- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Sec3;
			   a=Sec3-Q*n;
			   c=Math.pow(Q,n) +n+Newton2;
			   break;
			   case 3: 
			   c=Sec3;
			   a=resp2+Q+n;
			   b= (Sec3*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n\t f(x)=e^x- 3*x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Sec3){
			pts++;
		}
	}
	if(S==2){
		if(b==Sec3){
		pts++;
		}
	}
	if(S==3){
		if(c==Sec3){
		pts++;
		}
	}	
	break;
				
			}  // fin de Secante
			
			// Bisectriz
			n= (int)(rnd.nextDouble() *3 +1);
			// aleatorios de Bisectriz
			switch(n){
				case 1: // PROBLEMA 1
	 n= (int)(rnd.nextDouble() *2 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Bis1;
			   b=Bis1- Q+n;
			   c=Q*Bis1+n-Q+1;
			   break;
			   case 2:
			   b=Bis1;
			   a=Bis1-Q*n;
			   c=Math.pow(Q,n) +n+Newton1;
			   break;
			   case 3: 
			   c=Bis1;
			   a=Bis1+Q+n;
			   b= (Sec3*Q)/n;
			   break;
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \tf(x)=x^3 - 6.5*x +2\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Bis1){
			pts++;
		}
	}
	if(S==2){
		if(b==Bis1){
		pts++;
		}
	}
	if(S==3){
		if(c==Bis1){
		pts++;
		}
	}	
	break; 
	// PROBLEMA 2
	case 2:
				n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Bis2;
			   b=Bis2- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Bis2;
			   a=Newton1-Q*n;
			   c=Math.pow(Q,n) +n+Sec2;
			   break;
			   case 3: 
			   c=Bis2;
			   a=Bis2+Q+n;
			   b= (Bis2*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t f(x)= 2*x -43 \n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Bis2){
			pts++;
		}
	}
	if(S==2){
		if(b==Bis2){
		pts++;
		}
	}
	if(S==3){
		if(c==Bis2){
		pts++;
		}
	}	
	break;
	// Problema 3
	case 3: 
	n= (int)(rnd.nextDouble() *3 +1);
		Q=rnd.nextDouble();
		 n= (int)(rnd.nextDouble() *2 +1);
		   switch(n){
			   case 1: 
			   a=Bis3;
			   b=Newton3- Q+n;
			   c=Q*Newton1+n-Q+1;
			   break;
			   case 2:
			   b=Bis3;
			   a=Bis3-Q*n;
			   c=Math.pow(Q,n) +n+Newton2;
			   break;
			   case 3: 
			   c=Bis3;
			   a=resp2+Q+n;
			   b= (Fal3*Q)/n;
			   break;
			   
			   default:
			   break;
		   }
	limite=JOptionPane.showInputDialog("------\n \t f(x)=6x^3 - 32*x- 54\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
	S=Integer.parseInt(limite);
	if(S==1){
		if(a==Bis3){
			pts++;
		}
	}
	if(S==2){
		if(b==Bis3){
		pts++;
		}
	}
	if(S==3){
		if(c==Bis3){
		pts++;
		}
	}	
	break;
				
			}
		 
		 
		 
	
	// puntos obtenidos
	TFin = System.currentTimeMillis();
  tiempo = TFin - TInicio;
    if(tiempo<60000){
  tiempousuario=tiempo/1000;}
    else{
  tiempousuario=(tiempo/1000)/60;}
    String primero="Aviles", segundo="Sosa", tercero="Mancilla",cuarto="Ferreti", quinto="Efrain";
    int pts1=3,pts2=3,pts3=2,pts4=2,pts5=1,tiempo1=2800000,tiempo2=3000000,tiempo3=3800000,tiempo4=1200000,tiempo5=1380000;
    if(tiempo1>60000)
    {
        tiempo1=(tiempo1/60000);
    }
    if(tiempo2>60000)
    {
        tiempo2=(tiempo2/60000);
    }
    if(tiempo3>60000)
    {
        tiempo3=(tiempo3/60000);
    }
    if(tiempo3>60000)
    {
        tiempo3=(tiempo3/60000);
    }
    if(tiempo4>60000)
    {
        tiempo4=(tiempo4/60000);
    }
    if(tiempo5>60000)
    {
        tiempo5=(tiempo5/60000);
    }
    if(tiempo>60000)
    {
        tiempo=(tiempo/60000);
    }
    if(pts>=pts1)
    {
        if(tiempo1>tiempo)
        {
        lugar1.setText(nombre);
                String pt1;
                pt1=Integer.toString(pts);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo);
            tiempolugar1.setText(t1);
            
            lugar2.setText(primero);
                String pt2;
                pt2=Integer.toString(pts1);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo1);
            tiempolugar2.setText(t2);
            
            lugar3.setText(segundo);
                String pt3;
                pt3=Integer.toString(pts2);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo2);
            tiempolugar3.setText(t3);
            
            lugar4.setText(tercero);
                String pt4;
                pt4=Integer.toString(pts3);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo3);
            tiempolugar4.setText(t4);
            
            lugar5.setText(cuarto);
                String pt5;
                pt5=Integer.toString(pts4);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo4);
            tiempolugar5.setText(t5);
            
            }
        else
        {
            lugar2.setText(nombre);
                String pt2;
                pt2=Integer.toString(pts);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo);
            tiempolugar2.setText(t2);
            
            lugar3.setText(segundo);
                String pt3;
                pt3=Integer.toString(pts2);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo2);
            tiempolugar3.setText(t3);
            
            lugar4.setText(tercero);
                String pt4;
                pt4=Integer.toString(pts3);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo3);
            tiempolugar4.setText(t4);
            
            lugar5.setText(cuarto);
                String pt5;
                pt5=Integer.toString(pts4);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo4);
            tiempolugar1.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
        }
    }
    else if(pts>=pts2)
        {
            if(tiempo2>tiempo)
            {
              lugar2.setText(nombre);
                String pt2;
                pt2=Integer.toString(pts);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo);
            tiempolugar2.setText(t2);
            
            lugar3.setText(segundo);
                String pt3;
                pt3=Integer.toString(pts2);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo2);
            tiempolugar3.setText(t3);
            
            lugar4.setText(tercero);
                String pt4;
                pt4=Integer.toString(pts3);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo3);
            tiempolugar4.setText(t4);
            
            lugar5.setText(cuarto);
                String pt5;
                pt5=Integer.toString(pts4);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo4);
            tiempolugar1.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
                }
            else
            {
            lugar3.setText(nombre);
                String pt3;
                pt3=Integer.toString(pts);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo);
            tiempolugar3.setText(t3);
            
            lugar4.setText(tercero);
                String pt4;
                pt4=Integer.toString(pts3);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo3);
            tiempolugar4.setText(t4);
            
            lugar5.setText(cuarto);
                String pt5;
                pt5=Integer.toString(pts4);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo4);
            tiempolugar5.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
            lugar2.setText(segundo);
                String pt2;
                pt2=Integer.toString(pts2);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo2);
            tiempolugar2.setText(t2);
            
            
            }
        }
   else if(pts>=pts3)
        {
            if(tiempo3>tiempo)
            {
             lugar3.setText(nombre);
                String pt3;
                pt3=Integer.toString(pts);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo);
            tiempolugar3.setText(t3);
            
            lugar4.setText(tercero);
                String pt4;
                pt4=Integer.toString(pts3);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo3);
            tiempolugar4.setText(t4);
            
            lugar5.setText(cuarto);
                String pt5;
                pt5=Integer.toString(pts4);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo4);
            tiempolugar5.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
            lugar2.setText(segundo);
                String pt2;
                pt2=Integer.toString(pts2);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo2);
            tiempolugar2.setText(t2);
            
            }
            else
            {
              lugar4.setText(nombre);
                String pt4;
                pt4=Integer.toString(pts);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo);
            tiempolugar4.setText(t4);
            
            lugar5.setText(cuarto);
                String pt5;
                pt5=Integer.toString(pts4);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo4);
            tiempolugar5.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
            lugar2.setText(segundo);
                String pt2;
                pt2=Integer.toString(pts2);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo2);
            tiempolugar2.setText(t2);
            
            lugar3.setText(tercero);
                String pt3;
                pt3=Integer.toString(pts3);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo3);
            tiempolugar3.setText(t3);
            
                }
        }
    else if(pts>=pts4)
        {
            if(tiempo4>tiempo)
            {
               lugar4.setText(nombre);
                String pt4;
                pt4=Integer.toString(pts);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo);
            tiempolugar4.setText(t4);
            
            lugar5.setText(cuarto);
                String pt5;
                pt5=Integer.toString(pts4);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo4);
            tiempolugar5.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
            lugar2.setText(segundo);
                String pt2;
                pt2=Integer.toString(pts2);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo2);
            tiempolugar2.setText(t2);
            
            lugar3.setText(tercero);
                String pt3;
                pt3=Integer.toString(pts3);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo3);
            tiempolugar3.setText(t3);
                
                }
            else
            {
                lugar5.setText(nombre);
                String pt5;
                pt5=Integer.toString(pts);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo);
            tiempolugar5.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
            lugar2.setText(segundo);
                String pt2;
                pt2=Integer.toString(pts2);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo2);
            tiempolugar2.setText(t2);
            
            lugar3.setText(tercero);
                String pt3;
                pt3=Integer.toString(pts3);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo3);
            tiempolugar3.setText(t3);
            
            lugar4.setText(cuarto);
                String pt4;
                pt4=Integer.toString(pts4);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo4);
            tiempolugar4.setText(t4);
            }
        }
     
    else if(pts>=pts5)
        {
            if(tiempo5>tiempo)
            {
                lugar5.setText(nombre);
                String pt5;
                pt5=Integer.toString(pts);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo);
            tiempolugar5.setText(t5);
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
            lugar2.setText(segundo);
                String pt2;
                pt2=Integer.toString(pts2);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo2);
            tiempolugar2.setText(t2);
            
            lugar3.setText(tercero);
                String pt3;
                pt3=Integer.toString(pts3);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo3);
            tiempolugar3.setText(t3);
            
            lugar4.setText(cuarto);
                String pt4;
                pt4=Integer.toString(pts4);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo4);
            tiempolugar4.setText(t4);
            
            }
        }
    else
    {
   
            
            lugar1.setText(primero);
                String pt1;
                pt1=Integer.toString(pts1);
            puntuacion1.setText(pt1);
             String t1=String.valueOf(tiempo1);
            tiempolugar1.setText(t1);
            
            lugar2.setText(segundo);
                String pt2;
                pt2=Integer.toString(pts2);
            puntuacion2.setText(pt2);
             String t2=String.valueOf(tiempo2);
            tiempolugar2.setText(t2);
            
            lugar3.setText(tercero);
                String pt3;
                pt3=Integer.toString(pts3);
            puntuacion3.setText(pt3);
             String t3=String.valueOf(tiempo3);
            tiempolugar3.setText(t3);
            
            lugar4.setText(cuarto);
                String pt4;
                pt4=Integer.toString(pts4);
            puntuacion4.setText(pt4);
             String t4=String.valueOf(tiempo4);
            tiempolugar4.setText(t4);
            
            lugar5.setText(quinto);
                String pt5;
                pt5=Integer.toString(pts5);
            puntuacion5.setText(pt5);
             String t5=String.valueOf(tiempo5);
            tiempolugar5.setText(t5);
                
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        puntuacion5 = new javax.swing.JLabel();
        puntuacion4 = new javax.swing.JLabel();
        puntuacion3 = new javax.swing.JLabel();
        puntuacion2 = new javax.swing.JLabel();
        puntuacion1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lugar5 = new javax.swing.JLabel();
        lugar4 = new javax.swing.JLabel();
        lugar3 = new javax.swing.JLabel();
        lugar2 = new javax.swing.JLabel();
        lugar1 = new javax.swing.JLabel();
        tiempolugar5 = new javax.swing.JLabel();
        tiempolugar4 = new javax.swing.JLabel();
        tiempolugar3 = new javax.swing.JLabel();
        tiempolugar2 = new javax.swing.JLabel();
        tiempolugar1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(153, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 51));
        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 560, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 560, -1));

        puntuacion5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        puntuacion5.setForeground(new java.awt.Color(255, 255, 0));
        puntuacion5.setText("Desconocido5");
        getContentPane().add(puntuacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, -1, -1));

        puntuacion4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        puntuacion4.setForeground(new java.awt.Color(255, 255, 0));
        puntuacion4.setText("Desconocido4");
        getContentPane().add(puntuacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, -1, -1));

        puntuacion3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        puntuacion3.setForeground(new java.awt.Color(255, 255, 0));
        puntuacion3.setText("Desconocido3");
        getContentPane().add(puntuacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, -1, -1));

        puntuacion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        puntuacion2.setForeground(new java.awt.Color(255, 255, 0));
        puntuacion2.setText("Desconocido2");
        getContentPane().add(puntuacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, -1, -1));

        puntuacion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        puntuacion1.setForeground(new java.awt.Color(255, 255, 0));
        puntuacion1.setText("Desconocido1");
        getContentPane().add(puntuacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Puntuación");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Minutos");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        lugar5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lugar5.setForeground(new java.awt.Color(255, 255, 0));
        lugar5.setText("Desconocido5");
        getContentPane().add(lugar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        lugar4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lugar4.setForeground(new java.awt.Color(255, 255, 0));
        lugar4.setText("Desconocido4");
        getContentPane().add(lugar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        lugar3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lugar3.setForeground(new java.awt.Color(255, 255, 0));
        lugar3.setText("Desconocido3");
        getContentPane().add(lugar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        lugar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lugar2.setForeground(new java.awt.Color(255, 255, 0));
        lugar2.setText("Desconocido2");
        getContentPane().add(lugar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        lugar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lugar1.setForeground(new java.awt.Color(255, 255, 0));
        lugar1.setText("Desconocido1");
        getContentPane().add(lugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        tiempolugar5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempolugar5.setForeground(new java.awt.Color(255, 255, 0));
        tiempolugar5.setText("Desconocido5");
        getContentPane().add(tiempolugar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        tiempolugar4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempolugar4.setForeground(new java.awt.Color(255, 255, 0));
        tiempolugar4.setText("Desconocido4");
        getContentPane().add(tiempolugar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        tiempolugar3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempolugar3.setForeground(new java.awt.Color(255, 255, 0));
        tiempolugar3.setText("Desconocido3");
        getContentPane().add(tiempolugar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        tiempolugar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempolugar2.setForeground(new java.awt.Color(255, 255, 0));
        tiempolugar2.setText("Desconocido2");
        getContentPane().add(tiempolugar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        tiempolugar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempolugar1.setForeground(new java.awt.Color(255, 255, 0));
        tiempolugar1.setText("Desconocido1");
        getContentPane().add(tiempolugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tiempo");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("5.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("2.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("4.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("1.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("3.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Record Nivel 3");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondonuevo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
hide();
 
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(recordnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recordnivel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lugar1;
    private javax.swing.JLabel lugar2;
    private javax.swing.JLabel lugar3;
    private javax.swing.JLabel lugar4;
    private javax.swing.JLabel lugar5;
    private javax.swing.JLabel puntuacion1;
    private javax.swing.JLabel puntuacion2;
    private javax.swing.JLabel puntuacion3;
    private javax.swing.JLabel puntuacion4;
    private javax.swing.JLabel puntuacion5;
    private javax.swing.JLabel tiempolugar1;
    private javax.swing.JLabel tiempolugar2;
    private javax.swing.JLabel tiempolugar3;
    private javax.swing.JLabel tiempolugar4;
    private javax.swing.JLabel tiempolugar5;
    // End of variables declaration//GEN-END:variables
}
