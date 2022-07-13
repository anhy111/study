package pocu.bakery;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Bakery {
	ArrayList<Bread> breads = new ArrayList<>();
    
    public void addBread(Bread bread) {
        this.breads.add(bread);
    }
    
    // 1
    void removeExpiredBread() {
        for (Bread bread : this.breads) {
            if (!bread.isFresh()) {
                this.breads.remove(bread);
                return;
            }
        }
    }
    
    // 2
    void recycleBreads() {
//      for (Bread bread : this.breads) {
//    	bread.expiryDate = OffsetDateTime.now().plusDays(3);
//      }
    }
}
