import java.time.LocalTime;
class Time
{
	public static void main(String[] args)
	{
		LocalTime Id = LocalTime.now();
		System.out.println(Id.getHour() + ":" + Id.getMinute() + ":" + Id.getSecond());
		
		LocalTime tob = LocalTime.of(18,30,45);
		System.out.println(tob.getHour() + ":" + tob.getMinute() + ":" + tob.getSecond());
	}
}