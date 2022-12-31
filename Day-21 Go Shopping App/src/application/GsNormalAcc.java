package application;

import framework.NormalAcc;

public class GsNormalAcc extends NormalAcc{

	public GsNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	public void GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}

	
	
}
