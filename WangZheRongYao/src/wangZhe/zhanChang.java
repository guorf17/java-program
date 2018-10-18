package wangZhe;
import java.util.*;
//import wangZhe.Main;

class changLiang{
	public static final int hang=10;
	public static final int lie=10;
	public static final char jueSeFu[]=new char[] {'1','2','3','4','5','6','7','8','9','X'};
}

class zhanChang{
	public char diTu[][]=new char [25][50];
	void initDiTu(){
		int i,j,n=25,m=50;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(i==0)
					diTu[i][j]='*';
				if(i==24)
					diTu[i][j]='_';
				if(j==0||j==49)
					diTu[i][j]='|';
				if(((i>=5&&i<=9)&&(j>=9&&j<=19))||((i>=15&&i<=19)&&(j>=9&&j<=19)))
			        diTu[i][j]='*';
				if(((i>=5&&i<=9)&&(j>=29&&j<=39))||((i>=15&&i<=19)&&(j>=29&&j<=39)))
			        diTu[i][j]='*';
			}
		}	
	}

	
	void setAction(caoZuo _player[]) {
		for(int i=0;i<10;i++) {
			if(diTu[_player[i].posX][_player[i].posY]!='*')
				diTu[_player[i].posX][_player[i].posY] =_player[i].jueSe.charAt(0);
		}
	}
	
	void display() {
		int i,j,n=25,m=50;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(diTu[i][j]);
				//System.out.print(" ");
			}
			System.out.println();
		}	
		
	}
}



