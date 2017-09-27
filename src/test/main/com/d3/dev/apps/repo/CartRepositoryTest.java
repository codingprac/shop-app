package com.d3.dev.apps.repo;

import com.d3.dev.apps.model.Cart;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartRepositoryTest {
	
	@Autowired
	private CartRepository cartRepository;


	@Before
	public void setUp() throws Exception {
		Cart car= new Cart("Pen","10","5","50");
		Cart car1= new Cart("Pencil","50","3","150");
		Cart car2= new Cart("Rubber","200","7","1400");
		Cart car3= new Cart("Sharpener","15000","20","300000");
		assertNull(car.getId());
		assertNull(car1.getId());
		assertNull(car2.getId());
		assertNull(car3.getId());//null before save
		this.cartRepository.save(car);
		this.cartRepository.save(car1);
		this.cartRepository.save(car2);
		this.cartRepository.save(car3);
		assertNotNull(car.getId());
		assertNotNull(car1.getId());
		assertNotNull(car2.getId());
		assertNotNull(car3.getId());
	}

	@Test
	public void testFetchData(){
	/*Test data retrieval*/
		/*List<Cart> cartList = cartRepository.findAll();
		assertNotNull(ucartListserA);
		assertEquals(38, cart.getAge());*/
	/*Get all products, list should only have two*/
		Iterable<Cart> cartList = cartRepository.findAll();
		int count = 0;
		for(Cart p : cartList){
			count++;
		}
		assertEquals(count, 4);
	}

	/*@Test
	public void testDataUpdate(){
	*//*Test update*//*
		User userB = cartRepository.findByName("Bob");
		userB.setAge(40);
		cartRepository.save(userB);
		User userC= cartRepository.findByName("Bob");
		assertNotNull(userC);
		assertEquals(40, userC.getAge());
	}

	@After
	public void tearDown() throws Exception {
		this.cartRepository.deleteAll();
	}*/

}
	    

