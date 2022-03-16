class StaticDemo{
	static int count=0;
	StaticDemo()
	{
		count++;
		System.out.println(count);
	}
}

class main{
	public static void main(String[] args){
		StaticDemo s=new StaticDemo();
		StaticDemo s1=new StaticDemo();
		StaticDemo s2=new StaticDemo();
	}
}