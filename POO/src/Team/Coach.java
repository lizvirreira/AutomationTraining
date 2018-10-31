package Team;
 /*
   * @author Lizbeth Virreira
   *  This is the class daughter extends the class father
*/
public class Coach extends TeamSoccer {

	private int Idfederation;

	public Coach() {
		super();
	}
	 /*
	  * @param  ID the Coach number identification.
	  * @param  Name the  name.
	  * @param  LastName the Coach last name.
	  * @param  Age the Coach age.
	  */

	public Coach(int Id, String Name, String LastName, int Age, int Idfederation) {
		super(Id, Name, LastName, Age);
		this.setIdfederation(Idfederation);
	}

	public int getIdfederation() {
		return Idfederation;
	}

	 /*
	  * contains the information to be called does not return anything.*/

	public void setIdfederation(int Idfederation) {
		this.Idfederation = Idfederation;
	}

	public void PlanTraining() {

		System.out.println("Plan a Training");
	}

}
