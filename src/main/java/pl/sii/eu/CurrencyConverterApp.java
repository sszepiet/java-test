package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

public class CurrencyConverterApp implements CurrencyConverter {

	@Override
	public Amount convertToPln(Amount euroAmount) {
		double pln = (double) Math.round(euroAmount.getValue() * EURO_TO_PLN_RATIO*100) / 100;
		Amount plnAmount = new Amount((long) (pln*100), Currency.PLN);
		
		return plnAmount;
	}

	@Override
	public Amount convertToEur(Amount plnAmount) {
		double eur = (double) Math.round(plnAmount.getValue() / EURO_TO_PLN_RATIO*100) / 100;
		String s = ("" + eur); 
		Amount eurAmount = new Amount((long) (eur*100), Currency.PLN);
		
		return eurAmount;
	}

}
