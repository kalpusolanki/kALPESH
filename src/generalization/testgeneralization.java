package generalization;



public class testgeneralization 
{
public static void main(String[] args) 
 {
	System.out.println("feature of VI");
	VI v =new VI();
	v.Ac();
	v.SMS();
	v.Ac();
	v.FeatureA();
	
	System.out.println("feature of airtel");
	airtel a =new airtel();
	a.Ac();
	a.SMS();
	a.Ac();
	a.FeatureB();
	
	System.out.println("features of  jio");

	jio j =new jio();
	j.Ac();
	j.SMS();
	j.Ac();
	j.Featurec();
	
	
 }
}
