package com.CakeLover;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CakeOrderLogic {

	JFrame jp = new JFrame();
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction et = null;
	{	
	
	emf = Persistence.createEntityManagerFactory("CakeCustomerUnit");
	em = emf.createEntityManager();
	et = em.getTransaction();
	
	
	}
	CakeDetails cake = new CakeDetails(1,1.5f,1000f,"Strawberry");
	CakeDetails cake1 = new CakeDetails(2,1.5f,1000f,"Chocolate");
	CakeDetails cake2 = new CakeDetails(3,1.5f,1000f,"Pinapple");
	
	/*cake.setWeight("1f");
	cake.setCuId(1);
	cake.setCakeFlavour("Strawberry");
	cake.setPrice(1000); */
	
	
	public Boolean AddCake()
	{
		et.begin();
		
		String CuName = JOptionPane.showInputDialog(jp, "Enter your NAME:");

		String CuMobileNo = JOptionPane.showInputDialog(jp, "Enter your MobileNo:");
		Long s1=Long.parseLong(CuMobileNo);
		String CakeQuantity = JOptionPane.showInputDialog(jp, "Enter your cake quantity:");
		int s2=Integer.parseInt(CakeQuantity);
		String Pmethod = JOptionPane.showInputDialog(jp, "Enter your payment method:");
		//String cake = JOptionPane.showInputDialog(jp, "ENter cake name");
		
 
		Customer cc = new Customer();
		cc.setCuName(CuName);
		cc.setCakedetails(cake);
		cc.setCakeQuantity(s2);
		cc.setPaymentMethod(Pmethod);
		cc.setCuMobileNo(s1);
		em.persist(cc);// Insert Query
		et.commit();
		return true;
	
	}
	
	
	
}

