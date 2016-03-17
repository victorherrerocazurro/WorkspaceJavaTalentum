package com.example.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LibroService}.
 *
 * @author Brian Wing Shun Chan
 * @see LibroService
 * @generated
 */
public class LibroServiceWrapper implements LibroService,
    ServiceWrapper<LibroService> {
    private LibroService _libroService;

    public LibroServiceWrapper(LibroService libroService) {
        _libroService = libroService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _libroService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _libroService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _libroService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LibroService getWrappedLibroService() {
        return _libroService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLibroService(LibroService libroService) {
        _libroService = libroService;
    }

    @Override
    public LibroService getWrappedService() {
        return _libroService;
    }

    @Override
    public void setWrappedService(LibroService libroService) {
        _libroService = libroService;
    }
}
