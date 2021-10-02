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
public class recordnivel1 extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public recordnivel1() {
        initComponents();
        this.setLocationRelativeTo(null);
                this.setExtendedState(MAXIMIZED_BOTH);

        String nombre;
        nombre=JOptionPane.showInputDialog(null,"Cual es tu nombre?:");
          Scanner entrada=new Scanner(System.in);
          
        int i, pts=0;
        int matriz[][] = new int[4][4];
        long TInicio, TFin, tiempo,tiempousuario; 
 TInicio = System.currentTimeMillis();
        Random rand=new Random();
for (int x=0; x < matriz.length; x++) {
  for (int y=rand.nextInt(4); y < matriz[x].length; y=4) {
        matriz[x][y] = (int) (Math.random()*9+1);
if(x==0&&y==0){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ---Newton Hacia Adelante---\nEncontrar g(x) para: x=2.1\nx-----------f(x)\n1.00--------1.99\n1.66--------1.76\n2.33--------1.69\n3.00--------1.63\n----------------\n1)2.0, 2)1.70, 3)no tiene solucion ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
	switch(i)
	{
		case 1:
		pts++;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}	
else if(x==0&&y==1){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ---Newton Hacia Adelante---\nEncontrar g(x) para: x=3\nx-----------f(x)\n1.70--------0.35\n2.40--------0.81\n3.10--------1.03\n----------------\n1)2.0, 2)1.70, 3)1.029 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts++;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}
else if(x==0&&y==2){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ---Newton Hacia Adelante---\nEncontrar g(x) para: x=3.15\nx-----------f(x)\n1.50--------2.99\n2.49--------2.64\n3.50--------2.54\n4.50--------2.45\n----------------\n1)1.87, 2)6.45, 3)2.56  ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		
	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts++;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}
else if(x==0&&y==3){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ---Newton Hacia Adelante---\nEncontrar g(x) para: x=4.72\nx-----------f(x)\n3.75--------7.46\n6.23--------6.60\n8.74--------6.34\n11.25-------6.11\n----------------\n1)7.01, 2)6.45, 3)8.56 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

	switch(i)
	{
		case 1:
		pts++;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}

else if(x==1&&y==0){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ----------Lagrange----------\nEncontrar g(x) para: x=2.3\nx-----------f(x)\n1.80--------2.35\n2.40--------2.76\n3.00--------3.09\n3.60--------3.33\n4.20--------3.75\n----------------\n1)3.01, 2)2.69, 3)2.50 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		
	

	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts++;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}
else if(x==1&&y==1){
	
		String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ----------Lagrange----------\nEncontrar g(x) para: x=3.5\nx-----------f(x)\n2.70--------3.52\n3.60--------4.14\n4.50--------4.63\n5.40--------4.99\n6.30--------5.62\n1)4.07, 2)3.69, 3)4.50 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		

	i=entrada.nextInt();
	switch(i)
	{
		case 1:
		pts++;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}
else if(x==1&&y==2){
	String[] options={"Cancelar","1","2","3"};
		
			i=JOptionPane.showOptionDialog(null," ----------Lagrange----------\nEncontrar g(x) para: x=5.3\nx-----------f(x)\n4.05--------5.28\n5.40--------6.21\n6.75--------6.95\n8.10--------7.49\n9.45--------8.43\n----------------\n1)5.61, 2)7.69, 3)6.14 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		
	
	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts++;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}
else if(x==1&&y==3){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ----------Lagrange----------\nEncontrar g(x) para: x=7.9\nx-----------f(x)\n6.07--------7.93\n8.10--------9.31\n10.12------10.42\n12.15------11.23\n14.17------12.65\n----------------\n1)7.65, 2)9.18, 3)8.34 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts++;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}

else if(x==2&&y==0){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ----Newton Hacia Atras----\nEncontrar g(x) para: x=2\nx-----------f(x)\n3.10--------2.31\n2.80--------2.54\n2.50- ------2.82\n2.20--------3.21\n1.90--------3.99\n1.60--------4.75\n----------------\n1)2.65, 2)3.68, 3)4.34 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

	
	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts++;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}else if(x==2&&y==1){
	
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ----Newton Hacia Atras----\nEncontrar g(x) para: x=2.9\nx-----------f(x)\n4.65--------3.46\n4.20--------3.81\n3.75- ------4.23\n3.30--------4.81\n2.85--------5.98\n2.40--------7.12\n----------------\n1)5.82, 2)6.68, 3)7.94 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		
	switch(i)
	{
		case 1:
		pts++;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}else if(x==2&&y==2){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ----Newton Hacia Atras----\nEncontrar g(x) para: x=4.35\nx-----------f(x)\n6.97--------5.19\n6.30--------5.71\n5.62- ------6.34\n4.95--------7.22\n4.27--------8.97\n3.60-------10.68\n----------------\n1)7.84, 2)9.48, 3)8.74 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
	
	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts++;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}else if(x==2&&y==3){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," ----Newton Hacia Atras----\nEncontrar g(x) para: x=6.5\nx-----------f(x)\n10.46-------7.79\n9.45--------8.57\n8.43--------9.51\n7.42-------10.83\n6.41-------13.46\n5.40-------16.03\n----------------\n1)12.65, 2)13.19, 3)14.34 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
	
	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts++;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}
else if(x==3&&y==0){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," -Newton Diferencias Divididas-\nEncontrar g(x) para: x=3.6\nx-----------f(x)\n2.50--------9.70\n3.33--------9.40\n4.50--------8.50\n----------------\n1)9.22, 2)10.19, 3)7.94 ","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
	
	
	switch(i)
	{
		case 1:
		pts++;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}else if(x==3&&y==1){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," -Newton Diferencias Divididas-\nEncontrar g(x) para: x=5.2\nx-----------f(x)\n3.75-------14.55\n4.95-------14.10\n6.75-------12.75\n----------------\n1)11.22, 2)13.96, 3)17.94","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
	
	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts++;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}else if(x==3&&y==2){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," -Newton Diferencias Divididas-\nEncontrar g(x) para: x=7.6\nx-----------f(x)\n5.62-------21.82\n7.42-------21.15\n10.12------19.12\n----------------\n1)19.22, 2)18.19, 3)21.055","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
	
	switch(i)
	{
		case 1:
		pts=pts;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts++;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}else if(x==3&&y==3){
	String[] options={"Cancelar","1","2","3"};
		
		i=JOptionPane.showOptionDialog(null," -Newton Diferencias Divididas-\nEncontrar g(x) para: x=11.5\nx-----------f(x)\n8.43-------32.73\n11.13------31.72\n15.18------21.68\n----------------\n1)31.52, 2)30.19, 3)27.94","Nive 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
	
	switch(i)
	{
		case 1:
		pts++;
		break;
		case 2:
		pts=pts;
		break;
		case 3:
		pts=pts;
		break;
		default:
		pts=pts;
		
	}
	for ( int j = 0 ; j < 25 ; j++ ) 
{ 
System.out.println(); 
} 
}
  }
}
TFin = System.currentTimeMillis();
  tiempo = TFin - TInicio;
    if(tiempo<60000){
  tiempousuario=tiempo/1000;}
    else{
  tiempousuario=(tiempo/1000)/60;}
    String primero="Cardona", segundo="Picolin", tercero="Gignac",cuarto="Mohamed", quinto="Aquino";
    int pts1=4,pts2=4,pts3=3,pts4=1,pts5=1,tiempo1=2400000,tiempo2=2700000,tiempo3=3300000,tiempo4=1200000,tiempo5=1380000;
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
        jLabel18 = new javax.swing.JLabel();
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
        jLabel7.setText("Record Nivel 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, -1, -1));

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
            java.util.logging.Logger.getLogger(recordnivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordnivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordnivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordnivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recordnivel1().setVisible(true);
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
    private javax.swing.JLabel jLabel18;
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
