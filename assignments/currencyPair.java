package com.assignments;

public class currencyPair
{

	private String Ccy1;
	private String Ccy2;
	private String spotdays;
	private String WeekendDays;
	private String Percision;
	private String LastUpdatedTime;
	private String CurrencyPairs;
	public String getCcy1() {
		return Ccy1;
	}
	public void setCcy1(String ccy1) {
		Ccy1 = ccy1;
	}
	public String getCcy2() {
		return Ccy2;
	}
	public void setCcy2(String ccy2) {
		Ccy2 = ccy2;
	}
	public String getSpotdays() {
		return spotdays;
	}
	public void setSpotdays(String spotdays) {
		this.spotdays = spotdays;
	}
	public String getWeekendDays() {
		return WeekendDays;
	}
	public void setWeekendDays(String weekendDays) {
		WeekendDays = weekendDays;
	}
	public String getPercision() {
		return Percision;
	}
	public void setPercision(String percision) {
		Percision = percision;
	}
	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		LastUpdatedTime = lastUpdatedTime;
	}
	public String getCurrencyPairs() {
		return CurrencyPairs;
	}
	public void setCurrencyPairs(String currencyPairs) {
		CurrencyPairs = currencyPairs;
	}
	
	@Override
	public String toString() {
		return "currencyPair [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", spotdays=" + spotdays + ", WeekendDays="
				+ WeekendDays + ", Percision=" + Percision + ", LastUpdatedTime=" + LastUpdatedTime + ", CurrencyPairs="
				+ CurrencyPairs + "]";
	}
	
	
	
	
	
	
}
