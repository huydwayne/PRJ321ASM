/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.products;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HiGien
 */
public class CartObject {
    private Map<String, ProductDTO> items;
    private double total;
    
    public Map<String, ProductDTO> getItems() {
        return items;
    }
    public void addToCart(String id, ProductDTO p){
        if (items == null){
            items = new HashMap<>();
        }
        if (items.containsKey(id)){
            p.setQuantity(this.items.get(id).getQuantity()+1);
            this.items.put(id, p);
        } else {
             p.setQuantity(1);
            this.items.put(id, p);
        }
    }
    public void removeFromCart(String id){
        this.items.remove(id);
        if (this.items.isEmpty()){
            this.items = null;
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void calculateTotal(){
        this.total = 0;
        for (Map.Entry<String, ProductDTO> entry : items.entrySet()) {
            ProductDTO value = entry.getValue();
            this.total+=value.getPrice() * value.getQuantity();
        }
    }
}
