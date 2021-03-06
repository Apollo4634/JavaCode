package reflection;

import java.lang.reflect.Method;

public class TestMethod {
	public static void main(String[] args) {
		//打印所有方法
		System.out.println("===== 1 =====");
		Class<Stu> stuClass = Stu.class;
		Method[] stuMethods = stuClass.getMethods();//获取所有public方法，包括继承的方法
		for(Method m: stuMethods) { 
			System.out.println(m);
		}
		System.out.println();
		
		Method[] stuDeclaredMethods = stuClass.getDeclaredMethods();//本类定义的方法
		for(Method m: stuDeclaredMethods) {
			System.out.println(m);
		}
		System.out.println();
		
		System.out.println("===== 2 =====");
		//获取定义该方法的类的Class
		for(Method m: stuMethods) {
			System.out.println(m.getDeclaringClass());
		}
		System.out.println();
		
		//获取该方法的返回值的Class类
		for(Method m: stuMethods) {
			System.out.print(m.getReturnType()+"\t --\t");
			System.out.println(m.getGenericReturnType());
		}
		

		
		
		
	}
}
