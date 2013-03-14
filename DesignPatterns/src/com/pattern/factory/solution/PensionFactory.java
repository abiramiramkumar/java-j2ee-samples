package com.pattern.factory.solution;

import java.math.BigDecimal;

import com.pattern.factory.entity.DisabilityPension;
import com.pattern.factory.entity.OldAgePension;
import com.pattern.factory.entity.Pension;

public class PensionFactory {

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
