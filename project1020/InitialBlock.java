
/*
초기화 블럭
Why? 
클래스에는 벼수, 메서드만 정의할 수 있기 때문에
만약 반복문등을 넣기 위해서 사용된다
*/
class InitialBlock{
	//멤버 영역안에 {지역화}시켰을때 갖는 의미는?
	{
		//이 클래스의 인스턴스가 생성될때 마다 이 영역을 호출하게 됨
		//인스턴스 초기화 블럭
		System.out.println("인스턴스 초기화 블럭 호출");
	}
	//static초기화 블럭
	//main()메서드에 듸한 실행 직전에, 실행되는 초기화 블럭 
	static{
		System.out.println("실행하기전 초기화 하겠습니다");
		System.out.println("A");
	}

	public static void main(String[] args){
		System.out.println("B");
		new InitialBlock();
		new InitialBlock();
		new InitialBlock();

		int a=3;
		//그냥 블럭화 시켜 놓은 것임. 혹여나 이 안에 변수를 선언하면
		//해당 블럭 내에서만 유효하다
		/*{
			int b = 5;
		}
		System.out.println(b);*/
		
	}
}
