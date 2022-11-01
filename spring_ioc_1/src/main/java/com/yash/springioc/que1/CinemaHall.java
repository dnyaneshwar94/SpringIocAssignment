package com.yash.springioc.que1;

import java.util.Set;

public class CinemaHall 
{
	private int cid;
	private String cinemahallname;
	private Set<Movie> movies;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCinemahallname() {
		return cinemahallname;
	}
	public void setCinemahallname(String cinemahallname) {
		this.cinemahallname = cinemahallname;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "CinemaHall Name: "+cinemahallname+ "\n"
				+movies.toString();
	}
	
	
	
	
	
	

	
	
}
