public class Calculator{
	
	public void add(int num1, int num2) {
		int addResult = num1 + num2;
		System.out.println(addResult);
	}
	
	public void sub(int a, int b)
	{
		int subResult = b-a;
		System.out.println(subResult);
	}
	
	public static void main(String[] args){
		Calculator calc=new Calculator();
		calc.add(5, 6);
		calc.sub(20, 10);
	}
}