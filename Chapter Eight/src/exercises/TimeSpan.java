package exercises;

public class TimeSpan {
	private int hours;
	private int minutes;

	public TimeSpan(int hours, int minutes) {
		this.hours = 0;
		this.minutes = 0;
		add(hours, minutes);
	}

	public void add(int hours, int minutes) {
		if (hours < 0 || minutes < 0) {
			throw new IllegalArgumentException();
		}
		this.hours += hours;
		this.minutes += minutes;
		this.hours += this.minutes / 60;
		this.minutes = this.minutes % 60;
	}

	public void add(TimeSpan span) {
		this.hours += span.hours;
		this.minutes += span.minutes;
		this.hours += this.minutes / 60;
		this.minutes = this.minutes % 60;
	}

	public void subtract(TimeSpan span) {
		if (span.minutes > minutes) {
			this.hours -= span.hours;
			this.hours -= 1;
			this.minutes += 60;
			this.minutes -= span.minutes;
		} else {
			this.hours -= span.hours;
			this.minutes -= span.minutes;
		}
		this.hours += this.minutes / 60;
		this.minutes = this.minutes % 60;
	}

	public void scale(int factor) {
		this.hours *= factor;
		this.minutes *= factor;
		this.hours += this.minutes / 60;
		this.minutes = this.minutes % 60;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public String toString() {
		return "TimeSpan [hours=" + hours + ", minutes=" + minutes + "]";
	}

}
