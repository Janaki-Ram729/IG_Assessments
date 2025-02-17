package Day5;
class IlleagalArgumentException extends Exception{
	IlleagalArgumentException(String msg){
		super(msg);
	}
	
}
public class Average {

	public static void main(String[] args) throws IlleagalArgumentException  {
		int n = 30;
		if (n<=0) {
			throw new IlleagalArgumentException("Not a Natural Number");
		}
		else {
			CalcAvg nn = new CalcAvg();
			System.out.println(nn.avgcalc(n));
			
		}
	}
}