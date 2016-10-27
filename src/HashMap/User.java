package HashMap;

public class User {
	
	private String firstname;
	private String lastname;
	private String gender;
	
	public User(String firstname, String lastname, String gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + "]";
	}

	
	public static void main(String [] args){
		for(int i=0;i< 5 ;i++){
			User u = new User("Himanshu", "Bisht","M");
			System.out.println(u.toString());
		}
		
	}
	
	
}
