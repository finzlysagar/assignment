package com.assignments;

import java.util.Comparator;

public class CurrencyPairComparator implements Comparator<currencyPair>
{
	@Override
	public int compare(currencyPair c1,currencyPair c2)
	{
		return c1.getCurrencyPairs().compareToIgnoreCase(c2.getCurrencyPairs());
	}
}
