package Day39_JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {
	
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("0.000");
		
		double b = 21.123456646454;
		
		// format (double): formats the decimals and returns string value
			String num1 = format.format(b);
			
			System.out.println(num1);
			
			double c = 45.56789;
			System.out.println(format.format(c) +1  );
			
			c = Double.parseDouble(format.format(c));
			
			System.out.println(c+1);
	}

}
