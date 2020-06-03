package m3.s19ex2;

public class BigCat extends BigPet {
	public static final int DAILY_HOUSING_PRICE = 10;
    public BigCat(int days) {
        super(days);
    }
	@Override
	public int housing() {

		return DAILY_HOUSING_PRICE * days;
	}

}
