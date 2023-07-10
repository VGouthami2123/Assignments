import java.time.LocalDateTime;
class DateTime
{
	public static void main(String[] args)
	{
		LocalDateTime Idt = LocalDateTime.now();
		System.out.println(Idt.getHour() + ":" + Idt.getMinute() + ":" + Idt.getSecond());
		
		System.out.println(Idt.getDayOfMonth() + "/" + Idt.getMonthValue() + "/" + Idt.getYear());
	}
}
