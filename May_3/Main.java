package May_3;

public class Main
{

	public static void main(String[] args)
	{
		UserWriteRepository tester = new DBUserWriteRepository();
		User userr = new User(1L, "Irakli", "ab@mail.gg");
		//tester.save(userr);
		
		//userr.set_email("irakli@mail.gg");
		//tester.update(userr);
		
		//tester.delete(1L);
	}

}
