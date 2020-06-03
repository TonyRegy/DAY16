
public class Person {
	private String firstName;
	private String lastName;
	private int zipCode;
	private String city;
	private String state;

	Person(String firstName,String lastName,String city,int zipCode,String state){
	this.firstName=firstName;
	this.lastName=lastName;
	this.city=city;
	this.zipCode=zipCode;
	this.state=state;
	}


	public String getfirstName(){
	return firstName;
	}

	public void setfirstName(String firstname){
	this.firstName=firstname;
	}

	public String getlastName(){
	return lastName;
	}

	public void setlastName(String lastname){
	this.lastName=lastname;
	}
	public int getzipCode() {
		return zipCode;
	}
	
	public void setzipCode(int zipCode) {
		this.zipCode=zipCode;
	}
	
	public String getcity() {
		return city;
	}	
	public void setcity(String city) {
		this.city=city;
	}	
	public String getstate() {
		return state;
	}
	public void setstate(String state) {
		this.state=state;
	}
}


