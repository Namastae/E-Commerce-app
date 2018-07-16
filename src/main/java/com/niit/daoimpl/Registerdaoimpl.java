package com.niit.daoimpl;

 import java.util.List;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.niit.dao.Registerdao;
	import com.niit.model.Register;
	


	@Repository
	public class Registerdaoimpl implements Registerdao 
	{
		
		@Autowired
		SessionFactory sessionFactory;
		
		public void addUser(Register r)
		{
		
			
			try
			{
			Session session= sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			
			session.save(r);
		
			tx.commit();
			session.flush();
			session.close();
			}
			catch(Exception e)
			{
				System.out.println("Error"+e);
			}
		}
		
		public Register getInfo(String username)
		{
			
			Session session = sessionFactory.openSession();
		      Transaction tx = session.getTransaction();
		      tx.begin();
		      Register uc=(Register) session.get(Register.class,username);
		      System.out.println(uc);
		      tx.commit();
		      return uc;
		}

		public void edituser() {
			// TODO Auto-generated method stub
			
		}

		public void deleteuser() {
			// TODO Auto-generated method stub
			
		}

		public void getuser() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}


