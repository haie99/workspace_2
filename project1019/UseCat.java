class UseCat{
	public static void main(String[] args){
		Cat c1=new Cat();//고양이 인스턴스 한개 생성
		System.out.println("고양이 이름: "+c1.name);
		System.out.println("고양이 나이: "+c1.age);
		System.out.println("고양이 결혼여부: "+c1.isMarried);
	
		c1.walk();
		c1.cry();
		

	}
}
