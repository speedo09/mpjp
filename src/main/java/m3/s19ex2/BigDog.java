package m3.s19ex2;

public class BigDog extends BigPet {
	//static final int FACTOR=2;
	
	public static final int DAILY_HOUSING_PRICE = 18;
    public BigDog(int days) {
        super(days);
    }

	@Override
	public int housing() {
		//return super.housing() *FACTOR

		return DAILY_HOUSING_PRICE * days;
	}

}
