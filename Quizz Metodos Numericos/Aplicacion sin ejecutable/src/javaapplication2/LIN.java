 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
   import javax.swing.JOptionPane;
      import java.util.Random;
	  import java.io.*;
/**
 *
 * @author asus-01
 */
public class LIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     

		int n,S,pts=0,resp=0,m,k=0;
		 long TInicio, TFin, tiempo; 
 TInicio = System.currentTimeMillis();
 double []a;
 a=new double[100];
	double b=0,c=0;

	String limite;
	String Met="";
	String Mon= "Por Montante",Jac= "Por Jacobi",Gauss= "Por Gauss-Jordan",Elim="Por Eliminacion Gaussiana", Seidel= "Por Gauss-Seidel";
	Random rnd = new Random();
	double Q;
	do{
		n= (int)(rnd.nextDouble() *5 +1); // Gauss-Jordan
		switch(n){
			case  1:
			Met= Mon;
			break;
			case  2:
			 Met= Elim;
			 
			break;
			case  3:
			Met= Gauss;
			break;
			case  4:
			 Met= Jac;
			break;
			case  5:
			Met= Seidel;
			break;
			
		}
		m= (int)(rnd.nextDouble() *7 +1);
		k=m;
		switch(m){
			case  1:
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n2a+5b-2c= 1\n-a + 2b - 3c= 2\n3a- 3b + 2c=  3\n\n1)62/87   2)50/87  3)30/34     4) No se puede resolver\n19/87   20/13   19/87\n66/87    62/87   33/54 ");
	S=Integer.parseInt(limite);
	if(S==3|| S==4){
		if(S==4&&n>3){
			pts++;
		}
		else{
			if(S==3&&n<4){
				pts++;
		}
	}
	}
		resp++;
		a[k]=1;
			}
	break;
	case 2:
	if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n2X+5Y-6Z= 18\n4X + 5Y - 6Z= 24\n3X- 1Y + 2Z=  4\n\n1)X=-1   2)X=-2  3)X=4    4) No se puede resolver\nY=2   Y=1/2   Y=-2\nZ=1/3    Z=3   Z=3 ");
	S=Integer.parseInt(limite);
	if(S==3|| S==4){
		if(S==4&&n>3){
			pts++;
		}
		else{
			if(S==3&&n<4){
				pts++;
		}
	}
	}
	resp++;
	a[k]=1;
	}
	break;
		case 3:
		if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n3a - 0.1b- 0.2c = 7.85\n0.1a + 7b - 0.3c=  -19.3\n0.3a - 0.2b + 10c= 71.4\n\n1)A=3.000000352   2)A=3.123240  3)A=1.9000001\nB=-2.500000036   B=2.30000032   B=.5096\nC=6.9999999989    C=7.0002012   C=-2.500000036 ");
	S=Integer.parseInt(limite);
	if(S==1){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
			case 4:
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n10X + 2Y + 1Z = 7\n1X + 5Y + Z=  -8\n2X + 3Y + 10Z= 6\n\n1)X=0.99999   2)X=1.10002  3)X=1.9000001\nY=-1.999998   Y=2   Y=1.5096\nZ=1    Z=2.0082   Z=-.89992 ");
	S=Integer.parseInt(limite);
	if(S==2){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
			case 5:
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n4X - 2Y + 1Z = 3\n1X - Y + 3Z=  3\n-1X + 3Y + 0Z= 2\n\n1)X=1.11002  2)X=0.99996 3)X=1.9000001\nY=1.123   Y=1   Y=1.5096\nZ=0.4998    Z=1   Z=-.89992 ");
	S=Integer.parseInt(limite);
	if(S==1){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
			
			case 6:
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\nA - 3B + 5C= 5\n 8A - B - C= 8\n-2A + 4B + C= 4\n1) A= 1.42009  2)A= 1.350950195  3)A= 3.4012000\nB= 1.297855469  B= 1.300  B=2\nC=1.70032  C=1.50875  C=1.62 ");
	S=Integer.parseInt(limite);
	if(S==2){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
			case 7: 
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\nA - 3B + 5C= 5\n 8A - B - C= 8\n-2A + 4B + C= 4\n1) A= 1.42009   2)A= 1.350950195  3) A= 3.4012000\nB= 1.297855469  B= 1.300  B=2\nC=1.70032  C=1.50875  C=1.62 ");
	S=Integer.parseInt(limite);
	if(S==3){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
		}
	}
	while( resp!=4);
	
	
	JOptionPane.showMessageDialog(null,"los puntos son " + pts);
	TFin = System.currentTimeMillis();
  tiempo = TFin - TInicio;
  if(tiempo<60000){
  tiempo=tiempo/1000;

  JOptionPane.showMessageDialog(null,"Tiempo:" + tiempo+"segundos");
  

  }
  else{
  tiempo=(tiempo/1000)/60;

  JOptionPane.showMessageDialog(null,"Tiempo:"+tiempo+"minutos");

  
  }
			} // fin del switch punto fijo
	}

        // TODO code application logic here
