package com.example.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.example.demo.*;
@Service
public class crud {
	
	
	public void insert(entity en) {
		Session se = NewHibernateUtil.getSessionFactory().openSession();
		Transaction tr = null;
		
		try {
			
			tr =se.beginTransaction();
			se.save(en);
			tr.commit();
			
		   } catch (Exception e) {
			    if(tr!= null){
			    tr.rollback();
			    }
			         e.printStackTrace();
			            System.out.println(e.getMessage() + "herererer");
			        } finally {
			            
			            se.close();
			        }

		
	}
	
	public void delete(int id) {
		Session se = NewHibernateUtil.getSessionFactory().openSession();
		Transaction tr = null;
		
		try {
			
			tr =se.beginTransaction();
			entity en = new entity();
			en.setId(id);
			se.delete(en);
			tr.commit();
			
		   } catch (Exception e) {
			    if(tr!= null){
			    tr.rollback();
			    }
			         e.printStackTrace();
			            System.out.println(e.getMessage() + "herererer");
			        } finally {
			           
			            se.close();
			        }

		
	}
	
	public void update(int id, entity en) {
		Session se = NewHibernateUtil.getSessionFactory().openSession();
		Transaction tr = null;
		
		try {
			
			tr =se.beginTransaction();
			en.setId(id);
			se.update(en);
			tr.commit();
			
		   } catch (Exception e) {
			    if(tr!= null){
			    tr.rollback();
			    }
			         e.printStackTrace();
			            System.out.println(e.getMessage() + "herererer");
			        } finally {
			           
			            se.close();
			        }

		
	}

	
	
	public static void main (String [] args) {
		
		entity en = new entity("bahy", 22);
		
		crud cr = new crud();
//		cr.delete(1);
		cr.insert(en);
		
	}


}
