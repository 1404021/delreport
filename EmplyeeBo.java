package com.del;

public class EmplyeeBo {
	void CalincomeTax(EmplyeeVo emplyeeVo) {
		double ann_income = emplyeeVo.getAnn_income();
		double tax=0;
		if(ann_income>1000000) {
			tax = 0.4*ann_income;
		}
		else if(ann_income>500000) {
			tax=0.3*ann_income;
		}
		else {
			tax= 0.2*ann_income;
		}
		emplyeeVo.setInc_tax(tax);
	}

	private void setIncometax(double tax) {
		// TODO Auto-generated method stub
		
	}

	private double getAnnualincome() {
		// TODO Auto-generated method stub
		return 0;
	}

}
