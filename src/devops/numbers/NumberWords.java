package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result = "" ;
		
		if(number < 0){
			result= "Number out of range";
		}
		else{
			/*if(number== 1){
				result= "One";
			}else if(number==2){
				result= "Two";
			}else if(number==3){
				result= "Three";
			}else{*/
				result= String.valueOf(number);
			}
			
		return result.trim() ;
	}

}
