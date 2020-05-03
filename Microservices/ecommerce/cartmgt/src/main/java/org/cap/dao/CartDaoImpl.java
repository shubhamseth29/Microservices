package org.cap.dao;

import org.cap.entities.Cart;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CartDaoImpl implements ICartDao {
    private Map<Integer, Cart> store = new HashMap<>();

	@Override
	public List<Cart> fetchCartDetails(int userId) {
		Collection<Cart> cart = store.values();
		List<Cart> cartList = new ArrayList<Cart>();
		for(Cart cart1:cart) {
			if(cart1.getUserId()==userId) {
				cartList.add(cart1);
			}
		}
		return cartList;
	}

	@Override
	public Cart add(Cart item) {
		store.put(item.getId(),item);
		return item;
	}

    
}
