package pocu.bakery;

import java.time.OffsetDateTime;

public class Bread {
	private OffsetDateTime expiryDate = OffsetDateTime.now().plusDays(3);
	    
    boolean isFresh() {
        return OffsetDateTime.now().isBefore(expiryDate);
    }
}
