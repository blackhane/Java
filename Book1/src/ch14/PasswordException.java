package ch14;

public class PasswordException {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length() <= 5 || userID.matches("[a-zA-Z]+")) {
			throw new IDFormatException("아이디는 5자 이상, 문자열만 사용할 수 없습니다.");
		}
		this.userID = userID;
	}
	
	public void show() {
		System.out.println("당신의 아이디는 " + userID + "입니다.");
	}
	public static void main(String[] args) {
		PasswordException test = new PasswordException();
		
		String pass = new String("abc");
		try {
			test.setUserID(pass);
			test.show();
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		String pass2 = new String("abcde1");
		try {
			test.setUserID(pass2);
			test.show();
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
