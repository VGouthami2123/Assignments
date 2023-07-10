class E
{
	public int sum(int x,int y)
	{
		return x+y;
	}
}
class D extends E
{
	public int sum(int x,int y)
	{
		return x-(-y);
		
	}
}
class Overriding
{
	public static void main(String[] args)
	{
		D d1 = new D();
		System.out.println(d1.sum(10,20));
	}
}
