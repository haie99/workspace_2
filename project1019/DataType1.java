class DataType1{
/*
	���α׷��� ���� ���Ǵ� �������� ���� 3����
	1. ����
		���� : byte <short < int < long
		���� :  1		  2		 4	    8
		�Ǽ� : �Ҽ����� ������ �� 
				float <double
		����:		   4      8
	2. ����	: char(���ڿ��� �ٸ�, ���ڿ��� 1�� �̻��� ���ڵ��� ����)
	3. ������ : true / false
*/

	public static void main(String[] args){
		// byte x = 128;//1byte -128~127����
		// 1byte�� ǥ���� �� �մ� �������� ���� �� : 2�� 8��
		// ������ ���� �����͸� ǥ���� �� �ִ�
		// System.out.print("x��:"+x);		

		short s = 47;//2byte
		//2byte�� ǥ���� �� �ִ� �������� ���� �� : 2�� 16��
		// System.out.print("s��:"+s);

		int k = 500;//4byte 2��32��
		long a = 2;//8byte

		//�������� ū ������ ���ٸ� int������ �����ϳ�
		//��? ��������� �ý����� int���� ����ȭ�Ǿ� �����Ƿ�

		//�Ǽ�
		//�츮�� �ٷ�� �ִ� �ڹ��� �⺻ �ڷ���������, ����Ʈ �ڷ����� �����Ѵ�
		//������ ����Ʈ �ڷ��� int, �Ǽ��� ����Ʈ �ڷ����� double�̴�

		//���� �Ʒ��� ���� 3.689��� �����ϸ�, ����Ʈ �ڷ�����
		//doble�� �����Ͱ� �����ȴ�
		float b =3.689f;

		//����
		char j ='A';//2byte������, ��1byte�� �ƴ϶� 2byte?
		//1byte: 2�� 8�� = 256������ ������ ǥ�� ����
		//				  �ƽ�Ű�ڵ� 256�ڷδ� ���̱� �̿��� ����ǥ�� �Ұ���
		
		//2byte : 2�� 16�� = ������ ��� ���ڸ� �� ǥ���� �� �ִ�
		//					�ƽ�Ű���� Ȯ��� �����ڵ� ����� �����Ѵ�

	
		//������ boolean
		boolean e = true/ //1byte����
		//1�� ��ü�� �� ������, �ڹٿ����� 1�� true�� ����� �� ����
		/*
		C, Java, c#��� �ڷ����� �����Ǵ� ����?
		����� �������� ���L ����������, ��ǻ�ʹ� ��� ��� ���ڷ� ����
		���� ���������� ���� �ǹ̴� ��ǻ�Ϳ��� �뷮�� Ȯ���̴�
		*/

	}
}