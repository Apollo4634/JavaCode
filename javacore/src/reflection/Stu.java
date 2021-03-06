package reflection;

/**
 * 用于测试的学生类
 */
class Stu {
	int id;
	private String name;
	private int age;
	final public String school = "ABC High School";
	
	public Stu() {
		this.id = -1;
		this.name = "";
		this.age = -1;
	}
	
	Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.age = -1;
	}
	
	public Stu(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	protected boolean isAdult() {
		return id>=18;
	}
	
	void readBooks(String bookName) throws MyExceptionInStu {
		if(bookName.equals("")) {
			throw new MyExceptionInStu("Invalid book name");
		}
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	//Getters and Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Stu的内部类
	class BagOfStu {
		double price;
		
		BagOfStu() {
		}
	}
}

//Stu对应的异常类
class MyExceptionInStu extends Exception {
	private static final long serialVersionUID = -940860812703681941L;
	private String ErrorMsg;
	
	MyExceptionInStu() {
	}
	
	MyExceptionInStu(String msg) {
		ErrorMsg = msg;
	}
	
	void printErrMsg() {
		System.out.println(ErrorMsg);
	}
}
