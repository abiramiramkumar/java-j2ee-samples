package com.pattern.singleton.solution;

import java.math.BigDecimal;

import com.pattern.factory.entity.DisabilityPension;
import com.pattern.factory.entity.OldAgePension;
import com.pattern.factory.entity.Pension;

public class PensionSimpleSingletonFactory {

	private static PensionSimpleSingletonFactory FACTORY_INSTANCE;

	private PensionSimpleSingletonFactory() {

	}

	public static PensionSimpleSingletonFactory getInstance() {
		// lazy init
		if (FACTORY_INSTANCE == null) {
			FACTORY_INSTANCE = new PensionSimpleSingletonFactory();
		}
		return FACTORY_INSTANCE;
	}

	public Pension createPension(String newPensionType) {
		Pension pension = null;

		if ("OP".equals(newPensionType)) {
			pension = new OldAgePension("testOwner", BigDecimal.valueOf(10000));
		} else if ("DP".equals(newPensionType)) {
			pension = new DisabilityPension("testOwner",
					BigDecimal.valueOf(10000));
		}
		return pension;
	}
}