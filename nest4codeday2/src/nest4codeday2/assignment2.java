package nest4codeday2;

public class assignment2 {
	public static void main(String args[]) {
		System.out.println("FIRST TEST CASE..............");
		float height=heightConvertor(5,10);
		float weight=weightConvertor(60);
		System.out.println("Height In Centi Meters:"+height);
		System.out.println("Weight In Pounds"+weight);
		System.out.println("SECOND TEST CASE..............");
		float height1=heightConvertor(5,0);
		float weight1=weightConvertor(101);
		System.out.println("Height In Centi Meters:"+height1);
		System.out.println("Weight In Pounds"+weight1);
		
	}
	public static float heightConvertor(int heightFeetPart , int heightInchPart)
	{
		float height_cm=(float)((heightFeetPart*12+heightInchPart)*2.54);
		return height_cm;
	}
	public static float weightConvertor(int weightKg)
	{
		float weight_pound=(float)(weightKg*2.2);
		return weight_pound;
	}

}
