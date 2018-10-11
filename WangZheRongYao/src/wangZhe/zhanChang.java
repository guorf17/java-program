package wangZhe;

class changLiang{
	public static final int hang=10;
	public static final int lie=10;
	public static final char jueSeFu[]=new char[] {'0','1','2','3','4','5','6','7','8','9'};
}

public class zhanChang{
	public char diTu[][]=new char [10][10];
	void initDiTu(){
		int i,j,n=10,m=10;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				diTu[i][j]='0';
			}
		}	
		for(i=0;i<changLiang.hang-1;i++) {
			diTu[changLiang.hang-1][i]=changLiang.jueSeFu[i];
		}
	}
	void setJueSe(int jueSe,int x, int y) {
		diTu[x-1][y-1]=changLiang.jueSeFu[jueSe];	
	}
	void display() {
		int i,j,n=10,m=10;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(diTu[i][j]);
			}
			System.out.println();
		}	
		
	}
}



