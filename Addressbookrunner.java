import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

		public class Addressbookrunner{
			List<Person>mylist=new ArrayList<Person>();
			public static void display(){
			System.out.println("select option");
			System.out.println("enter 1 for new addressbook");
			System.out.println("enter 2 for saving current addressbook");
			Scanner it=new Scanner(System.in);
			int a=it.nextInt();
			String str1="",str2="",str3="",str5="",str6="",str9="",str0="",stri7="",change="";
			int str4,choice,editedZipCode;
			switch(a){
			case 1:
			System.out.println("enter 1 for adding an entry");
			System.out.println("enter 2 for deleting entry");
			System.out.println("enter 3 for editing an entry");
			System.out.println("enter 4 for sorted by zipcode list ");
			System.out.println("enter 5 for sorted by name list");
			int b=it.nextInt();
			
		

			switch(b){
			case 1:
			System.out.println("enter first name");
			str1=it.next();
			System.out.println("enter last name");
			str2=it.next();
			System.out.println("enter city");
			str3=it.next();
			System.out.println("enter zipcode");
			str4=it.nextInt();
			System.out.println("enter state");
			stri7=it.next();
			Addressbook obj1=new Addressbook();
			obj1.addPerson(str1,str2,str3,str4,stri7);
			break;

			case 2:
			System.out.println("enter the firstName to be removed");
			str5=it.nextLine();
			System.out.println("enter last name to be removed");
			str6=it.nextLine();
			Addressbook obj=new Addressbook();
			obj.deleteEntry(str5,str6);
			break;
		
			case 3:
			System.out.println("enter firstname");
			str9=it.nextLine();
			System.out.println("enter the last name");
			str0=it.nextLine();
			System.out.println("enter 1 to edit firstname:2 to edit lastname:3 to edit city:5 to edit state");
			choice=it.nextInt();
			System.out.println("enter the edited parameter otherthan zipcode");
			change=it.nextLine();
			System.out.println("enter the edited zipCode");
			editedZipCode=it.nextInt();
			Addressbook obj2=new Addressbook();
			obj2.editEntry(str9,str0,choice,change,editedZipCode);
			break;

			case 4:
			System.out.println("sorted list by zipcode");
			
			break;
		
			}

			case 2:
			}
			}

public static void main(String[] args) {
	while(true) {
	display();}
}
}
