/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.lmv.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.lmv.fulfilmentprocess.constants.LmvFulfilmentProcessConstants;

public class LmvFulfilmentProcessManager extends GeneratedLmvFulfilmentProcessManager
{
	public static final LmvFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (LmvFulfilmentProcessManager) em.getExtension(LmvFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
