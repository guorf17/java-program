package wangZhe;
/** 
* @ClassName: renWuJueSe 
* @Description: TODO(�����ɫ�ࣺ�������ɫ�Ļ��࣬����������Ժͷ��������ڼ̳���չ) 
* @author Grf 
*/
public class renWuJueSe {
	/** 
	* @Fields shengMingZhi : ����ֵ
	*/ 
	int shengMingZhi;
    /** 
    * @Fields moFaZhi : ħ��ֵ
    */ 
    int moFaZhi;
    /** 
    * @Fields jingYanZhi : TODO(����ֵ) 
    */ 
    int jingYanZhi;
    /** 
    * @Fields posX : TODO(����λ��X����) 
    */ 
    int posX;
    /** 
    * @Fields posY : TODO(����λ��Y����) 
    */ 
    int posY;
    /** 
    * @Fields jueSe : TODO(���������ʽ�ַ�) 
    */ 
    String jueSe;
    
    /** 
    * <p>Title:�޲ι��캯�� </p> 
    * <p>Description:���������ɫ����ĳ�ʼ�� </p>  
    */
    renWuJueSe(){
    	shengMingZhi=0;
    	moFaZhi=0;
    	jingYanZhi=0;
    	posX=1;
    	posY=1;
    }
    /** 
    * <p>Title:���ι��캯�� </p> 
    * <p>Description:���������ɫ����ĳ�ʼ�����������²��� </p> 
    * @param _shengMingZhi
    * @param _moFaZhi
    * @param _jingYanZhi 
    */
    renWuJueSe(int _shengMingZhi, int _moFaZhi, int _jingYanZhi){
    	shengMingZhi=_shengMingZhi;
    	moFaZhi=_moFaZhi;
    	jingYanZhi=_jingYanZhi;
    }
    /** 
    * @Title: yiDong 
    * @Description: TODO(�ƶ����������������ɫ�ƶ�����) 
    * @param @param _posX  λ������X
    * @param @param _posY  λ������Y
    * @return void    �������� 
    * @throws 
    */
    public void yiDong(int _posX,int _posY) {
    	posX=_posX;
    	posY=_posY;
    }
    
    public void jiNeng() {
    	
    }
}

/** 
* @ClassName: faShi 
* @Description: TODO(�����ɫ����ʦ��) 
* @author Grf
* @date 2018��10��21�� ����8:39:27 
*  
*/
class faShi extends renWuJueSe{
	/** 
	* <p>Title:�޲ι��캯�� </p> 
	* <p>Description: �Է�ʦ����г�ʼ��</p>  
	*/
	faShi(){
		shengMingZhi=10;
    	moFaZhi=10;
    	jingYanZhi=10;
	}
	faShi(String _jueSe){
		jueSe=_jueSe;
	}
	/** 
	* <p>Title:���ι��캯�� </p> 
	* <p>Description: </p> 
	* @param _shengMingZhi
	* @param _moFaZhi
	* @param _jingYanZhi
	* @param _jueSe 
	*/
	faShi(int _shengMingZhi, int _moFaZhi, int _jingYanZhi,String _jueSe){
		super(_shengMingZhi, _moFaZhi,  _jingYanZhi);
		jueSe=_jueSe;
	}
}

/** 
* @ClassName: zhanShi 
* @Description: TODO(�����ɫ��սʿ��) 
* @author Grf
* @date 2018��10��21�� ����8:39:32 
*  
*/
class zhanShi extends renWuJueSe{
	/** 
	* <p>Title:�޲ι��캯�� </p> 
	* <p>Description: </p>  
	*/
	zhanShi(){
		shengMingZhi=20;
    	moFaZhi=20;
    	jingYanZhi=20;
	}
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param _jueSe 
	*/
	zhanShi(String _jueSe){
		jueSe=_jueSe;
	}
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param _shengMingZhi
	* @param _moFaZhi
	* @param _jingYanZhi
	* @param _jueSe 
	*/
	zhanShi(int _shengMingZhi, int _moFaZhi, int _jingYanZhi,String _jueSe){
		super(_shengMingZhi, _moFaZhi,  _jingYanZhi);
		jueSe=_jueSe;
	}
}

/** 
* @ClassName: ciKe 
* @Description: TODO(�����ɫ���̿���) 
* @author Grf
* @date 2018��10��21�� ����8:39:37 
*  
*/
class ciKe extends renWuJueSe{

	ciKe(){
		shengMingZhi=30;
    	moFaZhi=30;
    	jingYanZhi=30;
	}
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param _jueSe 
	*/
	ciKe(String _jueSe){
		jueSe=_jueSe;
	}
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param _shengMingZhi
	* @param _moFaZhi
	* @param _jingYanZhi
	* @param _jueSe 
	*/
	ciKe(int _shengMingZhi, int _moFaZhi, int _jingYanZhi,String _jueSe){
		super(_shengMingZhi, _moFaZhi,  _jingYanZhi);
		jueSe=_jueSe;
	}
}











