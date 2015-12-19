package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import util.HibernateUtil;

public class RateDAL {


	public static double getRate(int GivenCreditScore) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = null;
		try{
			trans = session.beginTransaction();
			trans.commit();
		}
		catch(HibernateException e){
			if(trans != null)
				trans.rollback();
			e.printStackTrace();
		
		}
		finally{
			session.close();
		}
		return 0;
	}

}