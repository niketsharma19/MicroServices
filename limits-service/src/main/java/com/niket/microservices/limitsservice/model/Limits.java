package com.niket.microservices.limitsservice.model;

public class Limits {

	private int minimum;
	private int maximum;
	private String profile;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Limits() {
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public Limits(int minimum, int maximum, String profile) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.profile = profile;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
