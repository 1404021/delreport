package com.del;

public class EmplyeeVo {
	int empid;
	String empname = new String();
	double ann_income;
	int inc_tax;
	
	public EmplyeeVo(int empid, String empname, double ann_income, int inc_tax) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.ann_income = ann_income;
		this.inc_tax = inc_tax;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getAnn_income() {
		return ann_income;
	}
	public void setAnn_income(double ann_income) {
		this.ann_income = ann_income;
	}
	public int getInc_tax() {
		return inc_tax;
	}
	public void setInc_tax(double tax) {
		this.inc_tax = tax;
	}
	@Override
	public String toString() {
		return "EmplyeeVo [empid=" + empid + ", empname=" + empname + ", ann_income=" + ann_income + ", inc_tax="
				+ inc_tax + ", getEmpid()=" + getEmpid() + ", getEmpname()=" + getEmpname() + ", getAnn_income()="
				+ getAnn_income() + ", getInc_tax()=" + getInc_tax() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ann_income);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		result = prime * result + inc_tax;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmplyeeVo other = (EmplyeeVo) obj;
		if (Double.doubleToLongBits(ann_income) != Double.doubleToLongBits(other.ann_income))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (inc_tax != other.inc_tax)
			return false;
		return true;
	}
	
}
