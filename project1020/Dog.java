/**/
class Dog{
	String name="도그";
	int age=5;
	static String color = "white"//이 변수는 클래스로부터
	//생성된 인스턴스에 달려올라가지 말고
	//클래스 원본에 붙어 있어랴, 즉 인스턴스 소속이 아니라 클래스 원본소속으로 선언!

	public void bark(){
		 System.out.println("웍웍");
	}
	public static void main(String[] args){
		//Dog.color = "black";//color는 Dog소속, FM방식
		//같은 클래스에 존재하면
		color = "yellow";//이렇게 가능하다
		int a = 8;
		Dog d1 = new Dog();
		Dog d2 = new Dog();

		d2.age = 9;
		boolean k = true;

	}
} 


