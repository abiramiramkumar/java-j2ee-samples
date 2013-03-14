package com.pattern.singleton.solution;

import java.math.BigDecimal;

import com.pattern.factory.entity.DisabilityPension;
import com.pattern.factory.entity.OldAgePension;
import com.pattern.factory.entity.Pension;

public class PensionThreadSafeSingletonFactory {

	private static PensionThreadSafeSingletonFactory FACTORY_INSTANCE;

	private PensionThreadSafeSingletonFactory() {

	}

	public static synchronized PensionThreadSafeSingletonFactory getInstance() {
		// lazy init
		if (FACTORY_INSTANCE == null) {
			FACTORY_INSTANCE = new PensionThreadSafeSingletonFactory();
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
