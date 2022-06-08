package chapter02;

public class VerificationProblem {
	public static void main(String[] args) {
		//8번 문제
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int)(var1 + var2);
		
		System.out.println(result);
		
		//9번 문제
		long lVar1 = 2L;
		float fVar2 = 1.8f;
		double dVar3 = 2.5;
		String sVar4 = "3.9";
		int result2 = (int)(lVar1 + (int)fVar2 + dVar3 + Double.parseDouble(sVar4));
		System.out.println(result2);
		
		//10번문제	
		String str1 = 2 + 3 + "";	//"5"	"틀림"
		String str2 = 2 + "" + 3;	//"23"
		String str3 = "" + 2 + 3;	//"23"
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//11번문제
		byte bValue = Byte.parseByte("10");
		int iValue = Integer.parseInt("1000");
		float fValue = Float.parseFloat("20.5");
		double dValue = Double.parseDouble("3.14159");
		
		System.out.println(bValue);
		System.out.println(iValue);
		System.out.println(fValue);
		System.out.println(dValue);
		
		
		
	}
}
