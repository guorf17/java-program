package wangZhe;
import java.util.*;

import java.util.Scanner;
//import class zhanChang;

/** 
* @ClassName: Main. 
* @Description: TODO(这个是主函数 ) .
* @author Grf
* @date 2018年11月7日 下午3:24:06 
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
	* @Description: TODO(这个是主函数入口 ) .
	* @param @param args  参数说明 
	* @return void    返回类型 
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
* @Description: 操作类
* @author Grf
* @date 2018年10月21日 下午8:43:34 
*  
*/
class caoZuo{
	/** 
	* @Fields jueSe : 角色类 
	*/ 
	String jueSe;
	/** 
	* @Fields posX : 位置变量--X
	* @Fields posY : 位置变量--Y
	*/ 
	int posX,posY;
	/** 
	* @Fields ifattack : 非共和国 
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




