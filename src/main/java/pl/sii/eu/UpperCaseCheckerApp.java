package pl.sii.eu;

public class UpperCaseCheckerApp implements UpperCaseChecker {

	@Override
	public boolean hasUpperCaseLetters(String input) {
		if(!(input.equals(input.toLowerCase()))) return true;
		return false;
	}

}
