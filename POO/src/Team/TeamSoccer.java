package Team;
 /*
	 * @author Lizbeth Virreira
	 * this is a class abstract father the implements Iterface.
 */
public abstract class TeamSoccer implements IintegrandSelectionSoccer {

	protected int Id;
	protected String Name;
	protected String LastName;
	protected int Age;

	public TeamSoccer() {
	}
	 /*
	  * @param  ID the Coach number identification.
	  * @param  Name the  name.
	  * @param  LastName the Coach last name.
	  * @param  Age the Coach age.
	  */
	public TeamSoccer(int Id, String Name, String LastName, int Age) {
		this.Id = Id;
		this.Name = Name;
		this.LastName = LastName;
		this.Age = Age;
	}
 /**/
	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	 //Get is to get a result
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	/*
	* contains the information to be called does not return anything.*/
	public void concentrate() {
		System.out.println("Concentrate (Class Fathe)");
	}

	public void travel() {
		System.out.println("Travel (Class Father)");
	}

	public void practice() {
		System.out.println("Practice (Class Father)");
	}
}
