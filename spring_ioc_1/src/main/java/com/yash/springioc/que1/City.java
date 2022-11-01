package com.yash.springioc.que1;

import java.util.Iterator;
import java.util.Set;

public class City 
{
	private int cityid;
	private String cityname;
	private Set<CinemaHall> cinemaHall;
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public Set<CinemaHall> getCinemaHall() {
		return cinemaHall;
	}
	public void setCinemaHall(Set<CinemaHall> cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", cinemaHall=" + cinemaHall + ","
				+ "toString()="+super.toString() + "]";
	}
	
	public void display() {

		System.out.println("Movies Shows in City");

		System.out.println("======================================");

		System.out.println("City: " + cityid + " Cityname: " + cityname);
		/*
		 * for(CinemaHall ch: cinemaHall) { System.out.println( ""+ch.getCid()+""
		 * +ch.getCinemahallname()+ " "+ch.getMoviel().toString()); }
		 */

		Iterator<CinemaHall> cineIterator = cinemaHall.iterator();
		while (cineIterator.hasNext()) {
			
			System.out.println(cineIterator.next());

		}

	}
	
	
}
