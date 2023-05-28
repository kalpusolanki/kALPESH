package compilepolymorphism;

public class testsample1 
{
public static void main(String[] args)
{
	sample1 S1 = new sample1();
	S1.addition(11,22);
	S1.addition(11,22,12156);              // 3 rd integer parameter not present in defination of method
}
}
