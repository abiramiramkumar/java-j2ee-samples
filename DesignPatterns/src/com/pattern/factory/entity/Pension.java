package com.pattern.factory.entity;

import java.math.BigDecimal;

public abstract class Pension {

	private String pensionOwner;
	private BigDecimal earning;

	public abstract BigDecimal calculatePension();

	public Pension(String newPensionOwner, BigDecimal newEarning) {
		pensionOwner = newPensionOwner;
		earning = newEarning;
	}

	public String getPensionOwner() {
		return pensionOwner;
	}

	public void setPensionOwner(String pensionOwner) {
		this.pensionOwner = pensionOwner;
	}

	public BigDecimal getEarning() {
		return earning;
	}

	public void setEarning(BigDecimal earning) {
		this.earning = earning;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[ Owner:" + getPensionOwner()
				+ ", Earning:" + getEarning() + "]";
	}
}
