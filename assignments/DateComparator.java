package com.assignments;

import java.util.Comparator;

public class DateComparator  implements Comparator<currencyPair>
{
	@Override
	public int compare(currencyPair c1,currencyPair c2)
	{
		return c1.getLastUpdatedTime().compareTo(c2.getLastUpdatedTime());
		
	}

}
