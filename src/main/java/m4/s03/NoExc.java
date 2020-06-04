package m4.s03;

public class NoExc {
	public static void main(String[] args) throws Exception {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(increment(Integer.MAX_VALUE));
        int y = increment(Integer.MAX_VALUE);
        if (y==Integer.MIN_VALUE) {
        	System.out.println("error");
        }
        System.out.println(Integer.MAX_VALUE);
        try {
            System.out.println(increment(Integer.MAX_VALUE));
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        // ...
        
        try {
            y = increment(Integer.MAX_VALUE);
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        // ...
        
        System.out.println(y);
	}

static int increment (int x) throws Exception {
	if(x==Integer.MAX_VALUE) {
		throw new Exception();
	}
	return x+1;
}
}
