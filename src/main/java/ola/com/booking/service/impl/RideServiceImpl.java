package ola.com.booking.service.impl;

import java.util.List;

import ola.com.booking.dao.RideDao;
import ola.com.booking.dao.impl.RideDatoImpl;
import ola.com.booking.helper.RideHelper;
import ola.com.booking.model.Ride;
import ola.com.booking.model.Route;
import ola.com.booking.service.RideService;

public class RideServiceImpl implements RideService {
	
	RideDao rideDao = new RideDatoImpl();;

	@Override
	public void saveRide(Ride ride) {
		// TODO Auto-generated method stub
		
		
		ride.setRideId(RideHelper.getIncrement());
		
		rideDao.saveRide(ride);
	}

	@Override
	public List<Route> getRides(){
		return rideDao.getRides();
	}

}
