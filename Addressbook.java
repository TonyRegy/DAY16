import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Addressbook {
List<Person>mylist=new ArrayList<Person>();

public class sortByName implements Comparator<Person>{

	public int compare(Person a,Person b) {
		String a_firstname = a.getfirstName();
		String b_firstname=b.getfirstName();
		String a_lastname=a.getlastName();
		String b_lastname=b.getlastName();
		if(a_lastname.compareTo(b_lastname)==0) {
			return a_firstname.compareTo(b_firstname);
		}
		else {
			return a_lastname.compareTo(b_lastname);
		}
	}
}

public class sortByZip implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		int o1_zipCode=o1.getzipCode();
		int o2_zipCode=o2.getzipCode();
		return o1_zipCode-o2_zipCode;		
	}
}

public void addPerson(String firstName,String lastName,String city,int zipCode,String state) {
	Person obj=new Person(firstName,lastName,city,zipCode,state);
	mylist.add(obj);
}

public void deleteEntry(String firstName,String lastName) {
	int x=mylist.size();
	for(int i=0;i<=x;i++) {
	String m=mylist.get(i).getfirstName();
	String n=mylist.get(i).getlastName();
	if((m.equals(firstName)) &&(n.equals(lastName))) {
	mylist.remove(i);

	}
	}
	}
	public void editEntry(String firstName, String lastName, int choice, String change ,int editedZipCode){
		for (int i =0; i<mylist.size() ;i++){
		String m = mylist.get(i).getfirstName();
		String n  = mylist.get(i).getlastName();
		if(m.equals(firstName) && n.equals(lastName)){
			if(choice == 1){
				mylist.get(i).setfirstName(change);
			}
			else if(choice == 2){
				mylist.get(i).setlastName(change);
			}
			else if(choice == 3){
				mylist.get(i).setcity(change);
			}
			else if(choice == 4){
				mylist.get(i).setzipCode(editedZipCode);
			}
		}
		}
		}

	

public void sortByZip() {
	Collections.sort(mylist,new sortByZip());
}

public void sortByName() {
	Collections.sort(mylist,new sortByZip());
}
}


