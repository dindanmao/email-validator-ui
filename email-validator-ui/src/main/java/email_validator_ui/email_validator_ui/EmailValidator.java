package email_validator_ui.email_validator_ui;

public class EmailValidator {
	
	public boolean isValidEmail(String str){
		//check @
		int counter = 0;
		char[] arr = str.toCharArray();
		for (char ch : arr){
			if(ch == '@'){
				counter += 1;
			}
			if(counter > 1){
				break;
			}
		}
		
		//two additional rules:
		//1. check there is no comma used in the domain name part
		//2. check there is no back slash used in the domain name part
		
		if(counter != 1){
			return false;
		}
		else{
			String[] strArr = str.split("@");
			if (strArr[1].contains(",") || strArr[1].contains("/")){
				return false;
			}
		}
		return(counter == 1 && str.contains("."));
	}
}
