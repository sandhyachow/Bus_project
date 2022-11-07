package com.infinite.Busbooking;


import java.util.List;

import javax.transaction.Status;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 //Driver Details
			public class DriverDetailsDAO {
			SessionFactory sessionFactory;
			public String generateDriverId() {
			sessionFactory=SessionHelper.getConnection();
			Session session=sessionFactory.openSession();
			Criteria cr=session.createCriteria(DriverDetails.class);
			List<DriverDetails> driverdetails =cr.list();
			session.close();

		if(driverdetails.size()==0) {
		return "D001";
	}
		else {
		String id = driverdetails.get(driverdetails.size()-1).getDriver_id();
		int id1 = Integer.parseInt(id.substring(1));
		id1++;
		String id2 = String.format("D%03d", id1);
		return id2;
	}
  }
  
    	public String addDriver(DriverDetails driver) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		String DriverId=generateDriverId();
		driver.setDriver_id(DriverId);
	    Criteria cr = session.createCriteria(DriverDetails.class);
		Transaction tran = session.beginTransaction();
		session.save(driver);
		tran.commit();
		return "Details Added   ";
		
		
	}
			
  
  
  //User Wallet
 
    		public String Userwallets() {
    		sessionFactory = SessionHelper.getConnection();
    		Session session = sessionFactory.openSession();
    		Criteria cr = session.createCriteria(UserWallet.class);
    		List<UserWallet> userWallets =cr.list();
    		session.close();
    		if(userWallets.size()==0) {
    		return "W001";
	}
    		else {
    		String id = userWallets.get(userWallets.size()-1).getWallet_id();
    		int id1 = Integer.parseInt(id.substring(1));
    		id1++;
    		String id2 = String.format("W%03d", id1);
    		return id2;
	}
    		}
  
    		public String addUserWallet(UserWallet user) {
    		sessionFactory = SessionHelper.getConnection();  
    		Session session = sessionFactory.openSession();
    		String Wallet_id=Userwallets();
    		user.setWallet_id(Wallet_id);
    		System.out.println("1");
    		Criteria cr = session.createCriteria(UserWallet.class);    		
    		Transaction tran = session.beginTransaction();
    		session.save(user);
    		tran.commit();
    		return "Details Added ";
		
  }
    		}
