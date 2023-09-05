package com.java.sp.utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateUtility {

	
	
	
	private HibernateUtility() {
		//private constructor
	}
	
	public static void resourceCleanUp(Session session,Transaction tr) {
		if(session!=null) {
			if(tr!=null) {
				session.flush();
				tr.commit();
			}
			session.close();
		}
	}
}
