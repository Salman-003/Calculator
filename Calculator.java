public class Calculator{
	
	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public static void main(String[] args){
		Calculator calc=new Calculator();
		calc.add(5, 6);
	}
}