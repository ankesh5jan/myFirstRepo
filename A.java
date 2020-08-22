class A
{
	int y=20;     //instance data member
	void disp()
	{
		int x=30;      //local data member
		System.out.println(x);
		System.out.println(y);
	}
	void show()
	{
		//System.out.println(x);
		System.out.println(y);

	}
	void test()
	{
		int y=75;
		System.out.println(y);
		System.out.println(this.y);        //this keyword used to display instance data member
	}
	public static void main(String[] args)
	{
		A a=new A();
		a.disp();
		a.show();
		a.test();
	}
}
