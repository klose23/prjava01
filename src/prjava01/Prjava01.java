/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjava01;
/* 
*Tochangethistemplate,chooseTools|Templates 
*andopenthetemplateintheeditor. 
*/ 
/** 
* 
*@authordaw2_m08uf4pr2 
*/ 
import java.awt.Desktop; 
import java.io.*; 
public class Prjava01{ 
/** 
*@paramargsthecommandlinearguments 
*/ 
public static void main(String[]args)throws IOException{ 
	File f= new File("fitxer.html"); 
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){ 
		bw.write("<html>");bw.newLine(); 
		bw.write("<head>");bw.newLine(); 
		bw.write("<title>");bw.newLine(); 
		bw.write("Novap&agrave;ginaweb");bw.newLine(); 
		bw.write("</title>");bw.newLine(); 
		bw.write("</head>");bw.newLine(); 
		bw.write("<body>");bw.newLine(); 
		bw.write("Novap&agrave;ginaweb");bw.newLine(); 
		bw.write("</body>");bw.newLine(); 
		bw.write("</html>");bw.newLine(); 
		bw.close(); 
	} 
} 
} 