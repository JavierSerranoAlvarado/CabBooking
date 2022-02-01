package ola.com.booking.dao;

import java.util.List;

import ola.com.booking.model.Ride;
import ola.com.booking.model.Route;

public interface RideDao {

	void saveRide(Ride ride);
	public List<Route> getRides();
}
