package wangZhe;
/** 
* @ClassName: renWuJueSe 
* @Description: TODO(人物角色类：是人物角色的基类，包含相关属性和方法，用于继承扩展) 
* @author Grf 
*/
public class renWuJueSe {
	/** 
	* @Fields shengMingZhi : 生命值
	*/ 
	int shengMingZhi;
    /** 
    * @Fields moFaZhi : 魔法值
    */ 
    int moFaZhi;
    /** 
    * @Fields jingYanZhi : TODO(经验值) 
    */ 
    int jingYanZhi;
    /** 
    * @Fields posX : TODO(人物位置X坐标) 
    */ 
    int posX;
    /** 
    * @Fields posY : TODO(人物位置Y坐标) 
    */ 
    int posY;
    /** 
    * @Fields jueSe : TODO(人物表现形式字符) 
    */ 
    String jueSe;
    
    /** 
    * <p>Title:无参构造函数 </p> 
    * <p>Description:进行人物角色基类的初始化 </p>  
    */
    renWuJueSe(){
    	shengMingZhi=0;
    	moFaZhi=0;
    	jingYanZhi=0;
    	posX=1;
    	posY=1;
    }
    /** 
    * <p>Title:带参构造函数 </p> 
    * <p>Description:进行人物角色基类的初始化，包含以下参数 </p> 
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
    * @Description: TODO(移动方法，进行人物角色移动控制) 
    * @param @param _posX  位置坐标X
    * @param @param _posY  位置坐标Y
    * @return void    返回类型 
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
* @Description: TODO(人物角色：法师类) 
* @author Grf
* @date 2018年10月21日 下午8:39:27 
*  
*/
class faShi extends renWuJueSe{
	/** 
	* <p>Title:无参构造函数 </p> 
	* <p>Description: 对法师类进行初始化</p>  
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
	* <p>Title:带参构造函数 </p> 
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
* @Description: TODO(人物角色：战士类) 
* @author Grf
* @date 2018年10月21日 下午8:39:32 
*  
*/
class zhanShi extends renWuJueSe{
	/** 
	* <p>Title:无参构造函数 </p> 
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
* @Description: TODO(人物角色：刺客类) 
* @author Grf
* @date 2018年10月21日 下午8:39:37 
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











