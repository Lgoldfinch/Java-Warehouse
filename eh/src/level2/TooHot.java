package level2;

public class TooHot {

	public boolean TooHawt(int temp, boolean isSummer) {
		if (temp >= 60 && temp <= 90 && isSummer == false) {
			if (temp >= 60 && temp <= 100 && isSummer == true)
				return true;
		}
		else if (temp < 60 || temp > 90 && isSummer == false) { 
			if (temp <60 || temp >100 && isSummer == true)
				return false;
		}
		else {
			return false; 

	}
}
}
