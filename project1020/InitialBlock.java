
/*
�ʱ�ȭ ��
Why? 
Ŭ�������� ����, �޼��常 ������ �� �ֱ� ������
���� �ݺ������� �ֱ� ���ؼ� ���ȴ�
*/
class InitialBlock{
	//��� �����ȿ� {����ȭ}�������� ���� �ǹ̴�?
	{
		//�� Ŭ������ �ν��Ͻ��� �����ɶ� ���� �� ������ ȣ���ϰ� ��
		//�ν��Ͻ� �ʱ�ȭ ��
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ��");
	}
	//static�ʱ�ȭ ��
	//main()�޼��忡 ���� ���� ������, ����Ǵ� �ʱ�ȭ �� 
	static{
		System.out.println("�����ϱ��� �ʱ�ȭ �ϰڽ��ϴ�");
		System.out.println("A");
	}

	public static void main(String[] args){
		System.out.println("B");
		new InitialBlock();
		new InitialBlock();
		new InitialBlock();

		int a=3;
		//�׳� ��ȭ ���� ���� ����. Ȥ���� �� �ȿ� ������ �����ϸ�
		//�ش� �� �������� ��ȿ�ϴ�
		/*{
			int b = 5;
		}
		System.out.println(b);*/
		
	}
}
