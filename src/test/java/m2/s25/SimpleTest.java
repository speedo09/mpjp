package m2.s25;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.Test;

class SimpleTest {

    @Test
    void negate() {
    	Simple simple = new Simple();   
    	int value = 42;    
    	int result = simple.negate(value);   
    	assertThat(result, equalTo(-42)); 
    }
}
