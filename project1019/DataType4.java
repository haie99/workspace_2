class DataType4{
	public static void main(String[] args)
	{
		short s = 7;
		byte b=5;
		s=b; //가능
		b=s; //불가능
		b = (byte)s;//가능
	}
}

