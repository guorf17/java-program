package myTest;

interface InterfaceA{

	String s="good ";
	void f();
}
abstract class ClassA{
	abstract void g();
}
class ClassB extends ClassA implements InterfaceA{
	 void g(){
System.out.print(s);
}
	 public void f(){
System.out.print(" "+s);
}
}
public class classTest {
	public static void main(String[] args) {
		ClassA a=new ClassB();
		InterfaceA b=new ClassB();
		a.g();
		b.f();
	}
}