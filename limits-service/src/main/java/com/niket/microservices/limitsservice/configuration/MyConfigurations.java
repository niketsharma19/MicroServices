package com.niket.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class MyConfigurations {

	public int minimum;
	public int maximum;
	public String profile;
	
	public MyConfigurations() {
	}

	public MyConfigurations(int minimum, int maximum, String profile) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.profile = profile;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

}
