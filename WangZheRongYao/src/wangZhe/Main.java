package wangZhe;
import java.util.*;

import java.util.Scanner;
//import class zhanChang;

/** 
* @ClassName: Main. 
* @Description: TODO(����������� ) .
* @author Grf
* @date 2018��11��7�� ����3:24:06 
*  
*/
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
	
	/** 
	* @Title: main 
	* @Description: TODO(�������������� ) .
	* @param @param args  ����˵�� 
	* @return void    �������� 
	* @throws 
	*/
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

/** 
* @ClassName: caoZuo 
* @Description: ������
* @author Grf
* @date 2018��10��21�� ����8:43:34 
*  
*/
class caoZuo{
	/** 
	* @Fields jueSe : ��ɫ�� 
	*/ 
	String jueSe;
	/** 
	* @Fields posX : λ�ñ���--X
	* @Fields posY : λ�ñ���--Y
	*/ 
	int posX,posY;
	/** 
	* @Fields ifattack : �ǹ��͹� 
	*/ 
	boolean ifattack;
	
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param js
	* @param px
	* @param py 
	*/
	caoZuo(String js,int px,int py){
		jueSe=js;
		posX=px;
		posY=py;
	}
}




