package ola.com.booking;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ola.com.booking.helper.UserHelper;
import ola.com.booking.model.Ride;
import ola.com.booking.model.User;
import ola.com.booking.service.RideService;
import ola.com.booking.service.impl.RideServiceImpl;

@WebServlet("/rides")
public class RideServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RideService rideService = new RideServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//u have userId
		
		
        
        if(req.getParameter("action").equals("BookRide")) {
        	
        	Ride ride = new Ride();
        	
    		ride.setRouteId(Integer.parseInt(req.getParameter("routeId")));
    		
    		ride.setUserId(1);
    		
    		rideService.saveRide(ride);
  
    		RequestDispatcher rd = req.getRequestDispatcher("routes");
            rd.forward(req, resp);
	        
		}
		
		if(req.getParameter("action").equals("seeRidesBooked")) {
			
			req.setAttribute("rList", rideService.getRides()); 
			
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/ridesbooked.jsp");
			//send userId also
	        rd.forward(req, resp);
		}
	}
}
