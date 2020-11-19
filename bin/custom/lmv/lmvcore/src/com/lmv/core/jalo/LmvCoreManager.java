/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.lmv.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.lmv.core.constants.LmvCoreConstants;
import com.lmv.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class LmvCoreManager extends GeneratedLmvCoreManager
{
	public static final LmvCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (LmvCoreManager) em.getExtension(LmvCoreConstants.EXTENSIONNAME);
	}
}
