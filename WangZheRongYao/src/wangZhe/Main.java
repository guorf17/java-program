package wangZhe;
import java.util.*;

import java.util.Scanner;
//import class zhanChang;


public class Main {
	
    //static List<caoZuo> Play[] = new ArrayList[1];
    /*
     *  student[] aa = new student[10];
        for (int i = 0; i < 10; i++)
            aa[i] = new student("name", 22, "boy");
     * 
     * 
     */
	
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 zhanChang diTu1 =new zhanChang();
		 diTu1.initDiTu(); 
		 diTu1.display();
		 
		caoZuo []Play = new caoZuo[10];
		 
		 int n = scan.nextInt();
		 
		 String jueSe;
		 int posX=0,posY=0;
		 
		 while((n--)!=0) {	
			 int num =10;

			 for(int i=0;i<num;i++) {
				     jueSe = scan.next();
				     posX = scan.nextInt();
				     posY = scan.nextInt();
				
			     Play[i]=new caoZuo(jueSe,posX,posY);    
		     }
			// for(int i=0;i<num;i++) {
			 diTu1.setAction(Play);  
	        // }

			 diTu1.display();
			 
			 diTu1.initDiTu();
	    }
	
}	
		
}

class caoZuo{
	String jueSe;
	int posX,posY;
	boolean ifattack;
	
	caoZuo(String js,int px,int py){
		jueSe=js;
		posX=px;
		posY=py;
	}
}




