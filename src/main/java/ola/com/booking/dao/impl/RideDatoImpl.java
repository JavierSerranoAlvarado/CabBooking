package ola.com.booking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import ola.com.booking.ConectionManager;
import ola.com.booking.dao.RideDao;
import ola.com.booking.helper.UserHelper;
import ola.com.booking.model.Ride;
import ola.com.booking.model.Route;

public class RideDatoImpl implements RideDao {
	
	Connection conn= ConectionManager.getConnection();

	@Override
	public void saveRide(Ride ride) {
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into ride (rideId, userId, routeId, dateTime) values (?,?,?,?)");
			stmt.setInt(1, ride.getRideId());
			stmt.setInt(2, ride.getUserId());
			stmt.setInt(3, ride.getRouteId());
			stmt.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
			
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	// TODO Auto-generated method stub
		
	}

	@Override
	public List<Route> getRides() {
		List<Route> rideList = new ArrayList<Route>();
		try {
			
			PreparedStatement stmt;
			stmt = conn.prepareStatement("select source, destination, dateTime from ride JOIN route ON ride.routeId = route.routeId ");
		    // stmt.setInt(1, UserHelper.getCurrentUserId());
		 
		    ResultSet result = stmt.executeQuery();
		    
		    while(result.next()) {
				Route Route = new Route();
				Route.setSource(result.getString("source"));
				Route.setDestination(result.getString("destination"));
				rideList.add(Route);
			}
			return rideList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
