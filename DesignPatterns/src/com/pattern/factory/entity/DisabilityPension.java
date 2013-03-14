package com.pattern.factory.entity;

import java.math.BigDecimal;

public class DisabilityPension extends Pension {

	public DisabilityPension(String newPensionOwner, BigDecimal newEarning) {
		super(newPensionOwner, newEarning);
	}

	@Override
	public BigDecimal calculatePension() {
		return getEarning().multiply(BigDecimal.valueOf(0.5));
	}

}
