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
public class EEEE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


		int n,S,pts=0;
		 long TInicio, TFin, tiempo; 
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
			JOptionPane.showMessageDialog(null,"toco el problema numero " + n);// aleatorios de punto fijo
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
	limite=JOptionPane.showInputDialog("---Punto Fijo---\n \t y= 2x - e^x +2\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Punto Fijo---\n \t y=e^a - 10-x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Punto Fijo---\n \t y=(2-3a)/(4a^2 +5+a)\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
			JOptionPane.showMessageDialog(null,"toco el problema numero " + n);// aleatorios de Newton-Raphson
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
	limite=JOptionPane.showInputDialog("---Newton-Raphson---\n \t y=0.8x^2 +x -3\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Newton-Raphson---\n \t f(x)= x^3 + 2x^2 + 10x - 20\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Newton-Raphson---\n \t f(x)=3x^2 -5\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
			JOptionPane.showMessageDialog(null,"toco el problema numero " + n);// aleatorios de Falsa Posicion
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
	limite=JOptionPane.showInputDialog("---Falsa Posicion---\n \tf(x)=e^-x -x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Falsa Posicion---\n \t f(x)= (x+2)^.5 - x + 3\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Falsa Posicion---\n \t f(x)=x^2- 10\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
			JOptionPane.showMessageDialog(null,"toco el problema numero " + n);// aleatorios de Secante
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
	limite=JOptionPane.showInputDialog("---Secante---\n\tf(x)=3x - 14  1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Secante---\n \t f(x)= 5x^2 - 9+ x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Secante---\n\t f(x)=e^x- 3*x\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
			JOptionPane.showMessageDialog(null,"toco el problema numero " + n);// aleatorios de Bisectriz
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
	limite=JOptionPane.showInputDialog("---Bisectriz---\n \tf(x)=x^3 - 6.5*x +2\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---Bisectriz---\n \t f(x)= 2*x -43 \n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
	limite=JOptionPane.showInputDialog("---BIsectriz---\n \t f(x)=6x^3 - 32*x- 54\n\n 1)  "+ a + "  2)  "+b+"  3)  "+c);
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
}
} 
    

// TODO code application logic here
  