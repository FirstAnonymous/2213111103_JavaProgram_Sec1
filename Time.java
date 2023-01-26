
public class Time {
	private int second;
	private int minute;
	private int hour;
	
	public Time() {
		this.second=0;
		this.minute = 0;
		this.hour = 0;
	}
	public Time (int second,int minute,int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second= second;
	}
	public String toString() {
		return String.format("%2d:%02d:%02d",hour,minute,second);
	}
	public void setTime(int second,int minute,int hour) {
		this.second = second;
		this.minute  = minute;
		this.hour = hour;
	}
	//Advances
	public Time nextSecond() {
		++second;
		if(second>=60) {
			second = 0;
			++minute;
			if(minute>=60) {
				minute = 0;
				++hour;
				if(hour>=24) {
					hour=0;
				} // end if hour
			} // end if minute
		} // end if second
		return this; // Return "this" instance, to support chaining operations // e.g.,t1
	}
}