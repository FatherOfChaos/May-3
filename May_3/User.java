package May_3;

public class User
{
	private Long id;
	private String name;
	private String email;
	User (Long id, String name, String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public void set_id(Long id)
	{
		this.id=id;
	}
	public void set_name(String name)
	{
		this.name=name;
	}
	public void set_email(String email)
	{
		this.email=email;
	}
	public Long get_id()
	{
		return this.id;
	}
	public String get_name()
	{
		return this.name;
	}
	public String get_email()
	{
		return this.email;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
