/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation.result;

import java.util.Date;

import org.openmrs.Obs;
import org.openmrs.calculation.Calculation;
import org.openmrs.calculation.api.CalculationContext;

/**
 * Represents a {@link Result} for an Observation
 */
public class ObsResult extends DateBasedResult {
	
	/**
	 * Convenience constructor that takes in an {@link Obs} and {@link Calculation}
	 * 
	 * @param obs the obs to set
	 * @param calculation the calculation to set
	 */
	public ObsResult(Obs obs, Calculation calculation) {
		this(obs, calculation, null);
	}
	
	/**
	 * Convenience constructor that takes in an {@link Obs}, {@link Calculation} and
	 * {@link CalculationContext}
	 * 
	 * @param obs the obs to set
	 * @param calculation the calculation to set
	 * @param calculationContext the calculationContext to set
	 */
	public ObsResult(Obs obs, Calculation calculation, CalculationContext calculationContext) {
		super(obs, calculation, calculationContext);
	}
	
	/**
	 * @see org.openmrs.calculation.result.DateBasedResult#getDateOfResult()
	 */
	@Override
	public Date getDateOfResult() {
		if (getValue() != null)
			return ((Obs) getValue()).getObsDatetime();
		return null;
	}
}