package com.example.plugins.service.persistence;

import com.example.plugins.model.Libro;
import com.example.plugins.service.LibroLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LibroActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LibroActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LibroLocalServiceUtil.getService());
        setClass(Libro.class);

        setClassLoader(com.example.plugins.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("isbn");
    }
}
