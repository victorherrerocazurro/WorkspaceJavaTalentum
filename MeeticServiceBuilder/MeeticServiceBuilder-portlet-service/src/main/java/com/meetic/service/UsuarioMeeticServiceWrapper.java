package com.meetic.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsuarioMeeticService}.
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeeticService
 * @generated
 */
public class UsuarioMeeticServiceWrapper implements UsuarioMeeticService,
    ServiceWrapper<UsuarioMeeticService> {
    private UsuarioMeeticService _usuarioMeeticService;

    public UsuarioMeeticServiceWrapper(
        UsuarioMeeticService usuarioMeeticService) {
        _usuarioMeeticService = usuarioMeeticService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usuarioMeeticService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usuarioMeeticService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usuarioMeeticService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsuarioMeeticService getWrappedUsuarioMeeticService() {
        return _usuarioMeeticService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsuarioMeeticService(
        UsuarioMeeticService usuarioMeeticService) {
        _usuarioMeeticService = usuarioMeeticService;
    }

    @Override
    public UsuarioMeeticService getWrappedService() {
        return _usuarioMeeticService;
    }

    @Override
    public void setWrappedService(UsuarioMeeticService usuarioMeeticService) {
        _usuarioMeeticService = usuarioMeeticService;
    }
}
