import java.time.LocalDate;
class Date
{
	public static void main(String[] args)
	{
		LocalDate Id = LocalDate.now();
		System.out.println(Id.getDayOfMonth() + "/" + Id.getMonthValue() + "/" + Id.getYear());
		
		LocalDate dob = LocalDate.of(2000,10,2);
		System.out.println(dob.getDayOfMonth() + "/" + dob.getMonthValue() + "/" + dob.getYear());
	}
}