package com.meetic.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meetic.model.UsuarioMeetic;

import com.meetic.service.UsuarioMeeticLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UsuarioMeeticActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UsuarioMeeticActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UsuarioMeeticLocalServiceUtil.getService());
        setClass(UsuarioMeetic.class);

        setClassLoader(com.meetic.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("userId");
    }
}
