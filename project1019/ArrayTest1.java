//�ڹٵ� �ٸ����� ���������� �迭�� �����Ѵ�
//�� �ڹٴ� ���������͹���� �ƴ� ������ ����� �������α׷����μ�
//�迭 ����� �ݵ�� �ڷ����� �����ؾ� �Ѵ�(js�� �ٸ�)
class ArrayTest1{
	public static void mian(String[] args){
		//int�� �迭 ����
		//�ڹ� ��ũ��Ʈ�ʹ� �޸�, �ڹٿ����� �迭�� ���������� 
		//���� ���� �� ���� �ݵ�� �� ������ ������ Ÿ�Ը� ���� �� �ִ�
		int[] arr = new int[3];//�ݵ�� �ڷ����� ũ�� ����ؾ� ��
		arr[0] = 7;
		arr[1] = 23;
		arr[2] = 9;

		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
		}

		String[] fruit = {"���","�ٳ���","����"};//����� ���ÿ� �ʱ�ȭ
		System.out.println("������ ��"+fruit.length);
		for(int i = 0; i<fruit.length;i++){
			System.out.println(fruit[i]);
		}

	}
}