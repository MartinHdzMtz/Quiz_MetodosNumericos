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
public class recordnivel4 extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public recordnivel4() {
        initComponents();
        this.setLocationRelativeTo(null);
                this.setExtendedState(MAXIMIZED_BOTH);
String nombre;
        nombre=JOptionPane.showInputDialog(null,"Cual es tu nombre?:");
        int n,S,pts=0,resp=0,m,k=0;
		 long TInicio, TFin, tiempo,tiempousuario; 
 TInicio = System.currentTimeMillis();
 double []a;
 a=new double[100];
	double b=0,c=0;

	String limite;
	String Met="";
	String Tra= "Por Regla Trapezoidal",Cerr= "Por Newton- Cotes Cerradas",Abier= "Por Newton-Cotes Abiertas",Simpson3="Por Regla de 1/3 de Simpson", Simpson8= "Por Regla de 3/8 de Simpson";
	Random rnd = new Random();
	double Q;
	do{
		n= (int)(rnd.nextDouble() *5 +1); // Random
		switch(n){
			case  1:
			Met= Tra;
			break;
			case  2:
			 Met= Cerr;
			 
			break;
			case  3:
			Met= Abier;
			break;
			case  4:
			 Met= Simpson3;
			break;
			case  5:
			Met= Simpson8;
			break;
			
		}
		m= (int)(rnd.nextDouble() *12 +1);
		k=m;
		switch(m){
			case  1:
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  -1\n S(3x-4) dx\n   2\n1)  15/2   2) 10/3   3) 5.899921   4) 5.121");
	S=Integer.parseInt(limite);
	if(S==1){
			pts++;
		}
		
	
		resp++;
		a[k]=1;
			}
	break;
	case 2:
	if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  1\nS(1 - x^2) dx\n  0\n1)  8/5   2) 1/3  3) .666666666   4) 1.985432");
	S=Integer.parseInt(limite);
	if(S==3){
		
				pts++;
		}
	resp++;
	a[k]=1;
	}
	break;
		case 3:
		if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  1\nS(3^3 - x^2 + x - 1) dx\n  -1\n1)  .56770000   2) -8/3  3) 2.666666666   4) 3.932332222 ");
	S=Integer.parseInt(limite);
	if(S==2){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
			case 4:
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  e\nS(1 / x) dx\n  1\n1)  -1.67777   2) 1  3) 1.677777   4) 1/12 ");
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
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  4\nS(x* (x^2 + 9)^.5) dx\n  0\n1)  -32.6666667   2) 98/3  3) 20   4) 3/21 ");
	S=Integer.parseInt(limite);
	if(S==2){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
			
			case 6:
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  2\nS(2x - 4) dx\n  1\n1)  -1/3   2) 4.25  3) 2.000001   4) -1.00000");
	S=Integer.parseInt(limite);
	if(S==4){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
			case 7: 
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  1\nS(3x^2 - 14) dx\n  -1\n1)  98/5   2) 25  3) -26   4) -3/2 ");
	S=Integer.parseInt(limite);
	if(S==3){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
				case 8: 
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  3\nS(1 / 1 + x^2) dx\n  2\n1)  -0.2132   2) 0.142416  3) 1/3   4) -3/82 ");
	S=Integer.parseInt(limite);
	if(S==2){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
				case 9: 
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  2\nS(3x^3 - 10) dx\n  -2\n1)  -80/2   2) 40  3) -26   4) -5.3333333333334 ");
	S=Integer.parseInt(limite);
	if(S==1){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
				case 10: 
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  0\nS(x^2 - 4) dx\n  2\n1)  9/5   2) 12/35  3) -5   4) 5.333333333 ");
	S=Integer.parseInt(limite);
	if(S==4){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
				case 11: 
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  6\nS((3 - x) / 2 ) dx\n  5\n1)  2.66666666   2) 5  3) -5/4   4) -2/3 ");
	S=Integer.parseInt(limite);
	if(S==3){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
				case 12: 
			if(a[k]!=1){
limite=JOptionPane.showInputDialog("---"+ Met+"---\n  2\nS(x-9)^.5 dx\n  1\n1)  2/8   2) -5.99691  3) -2   4) 5 ");
	S=Integer.parseInt(limite);
	if(S==2){
			pts++;
	}
		resp++;
		a[k]=1;
			}
			break;
		}
	}
	while( resp!=4);
	


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
            java.util.logging.Logger.getLogger(recordnivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordnivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordnivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordnivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new recordnivel4().setVisible(true);
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
