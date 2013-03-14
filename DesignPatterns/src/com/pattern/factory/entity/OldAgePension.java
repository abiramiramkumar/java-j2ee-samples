package com.pattern.factory.entity;

import java.math.BigDecimal;

public class OldAgePension extends Pension {

	public OldAgePension(String newPensionOwner, BigDecimal newEarning) {
		super(newPensionOwner, newEarning);
	}

	@Override
	public BigDecimal calculatePension() {
		return getEarning().multiply(BigDecimal.valueOf(0.6));
	}

}
