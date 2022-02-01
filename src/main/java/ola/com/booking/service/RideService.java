package ola.com.booking.service;

import java.util.List;

import ola.com.booking.model.Ride;
import ola.com.booking.model.Route;

public interface RideService {

	public void saveRide(Ride ride);
	
	public List<Route> getRides();
}
