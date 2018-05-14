package pl.sii.eu;

public class DuplicateCheckerApp implements DuplicateChecker {

	@Override
	public boolean hasDuplicateCharacters(String input) {
		for(int i = 0; i<input.length(); i++) {
			for(int j = i; j<input.length()-1; j++) {
				if(input.toLowerCase().charAt(i)==input.toLowerCase().charAt(j+1)) {
					return true;
				}
			}
		}
		return false;	
	}
}
