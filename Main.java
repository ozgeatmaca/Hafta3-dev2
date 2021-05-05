package ödev;

public class Main {

	public static void main(String[] args) {
		
	Instuctor instuctor1= new Instuctor("3","yazılım","engin demiroğ","345435454","erkek","2343","bilişim","engindemiroğ@");
	Instuctor instuctor2= new Instuctor("2", "bilişim","umut coşkun", "73483748", "erkek", "39449", "bilgisayar","umutcoşkun@");
	
	Instuctor instuctor[]= {instuctor1,instuctor2};
	
	Student student1 = new Student(2898282,"özge atmaca","2637827337","kadın","yazılım","özgeatmaca@","2");
	Student student2 = new Student(2,"umut coşkun","33773828338","erkek","yazılım","umutcoşkun@","3");
	
	Usermanager usermanager = new Usermanager();
	InstuctorManager instuctormanager = new InstuctorManager();
	instuctormanager.open(instuctor1);
	
	
	Studentmanager studentmanager = new Studentmanager ();
	studentmanager.open(student1);
	
	
	
	
	
	 

	}

}
