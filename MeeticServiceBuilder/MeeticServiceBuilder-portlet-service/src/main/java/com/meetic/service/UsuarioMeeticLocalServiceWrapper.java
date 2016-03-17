package com.meetic.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsuarioMeeticLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeeticLocalService
 * @generated
 */
public class UsuarioMeeticLocalServiceWrapper
    implements UsuarioMeeticLocalService,
        ServiceWrapper<UsuarioMeeticLocalService> {
    private UsuarioMeeticLocalService _usuarioMeeticLocalService;

    public UsuarioMeeticLocalServiceWrapper(
        UsuarioMeeticLocalService usuarioMeeticLocalService) {
        _usuarioMeeticLocalService = usuarioMeeticLocalService;
    }

    /**
    * Adds the usuario meetic to the database. Also notifies the appropriate model listeners.
    *
    * @param usuarioMeetic the usuario meetic
    * @return the usuario meetic that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meetic.model.UsuarioMeetic addUsuarioMeetic(
        com.meetic.model.UsuarioMeetic usuarioMeetic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.addUsuarioMeetic(usuarioMeetic);
    }

    /**
    * Creates a new usuario meetic with the primary key. Does not add the usuario meetic to the database.
    *
    * @param userId the primary key for the new usuario meetic
    * @return the new usuario meetic
    */
    @Override
    public com.meetic.model.UsuarioMeetic createUsuarioMeetic(long userId) {
        return _usuarioMeeticLocalService.createUsuarioMeetic(userId);
    }

    /**
    * Deletes the usuario meetic with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic that was removed
    * @throws PortalException if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meetic.model.UsuarioMeetic deleteUsuarioMeetic(long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.deleteUsuarioMeetic(userId);
    }

    /**
    * Deletes the usuario meetic from the database. Also notifies the appropriate model listeners.
    *
    * @param usuarioMeetic the usuario meetic
    * @return the usuario meetic that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meetic.model.UsuarioMeetic deleteUsuarioMeetic(
        com.meetic.model.UsuarioMeetic usuarioMeetic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.deleteUsuarioMeetic(usuarioMeetic);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _usuarioMeeticLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meetic.model.impl.UsuarioMeeticModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meetic.model.impl.UsuarioMeeticModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.meetic.model.UsuarioMeetic fetchUsuarioMeetic(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.fetchUsuarioMeetic(userId);
    }

    /**
    * Returns the usuario meetic with the primary key.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic
    * @throws PortalException if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meetic.model.UsuarioMeetic getUsuarioMeetic(long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.getUsuarioMeetic(userId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the usuario meetics.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meetic.model.impl.UsuarioMeeticModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuario meetics
    * @param end the upper bound of the range of usuario meetics (not inclusive)
    * @return the range of usuario meetics
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.meetic.model.UsuarioMeetic> getUsuarioMeetics(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.getUsuarioMeetics(start, end);
    }

    /**
    * Returns the number of usuario meetics.
    *
    * @return the number of usuario meetics
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUsuarioMeeticsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.getUsuarioMeeticsCount();
    }

    /**
    * Updates the usuario meetic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param usuarioMeetic the usuario meetic
    * @return the usuario meetic that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meetic.model.UsuarioMeetic updateUsuarioMeetic(
        com.meetic.model.UsuarioMeetic usuarioMeetic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.updateUsuarioMeetic(usuarioMeetic);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usuarioMeeticLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usuarioMeeticLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usuarioMeeticLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.Collection<com.meetic.model.UsuarioMeetic> buscarAfines(
        long idUser)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.buscarAfines(idUser);
    }

    @Override
    public com.meetic.model.UsuarioMeetic buscarIdeal(long idUser)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeeticLocalService.buscarIdeal(idUser);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsuarioMeeticLocalService getWrappedUsuarioMeeticLocalService() {
        return _usuarioMeeticLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsuarioMeeticLocalService(
        UsuarioMeeticLocalService usuarioMeeticLocalService) {
        _usuarioMeeticLocalService = usuarioMeeticLocalService;
    }

    @Override
    public UsuarioMeeticLocalService getWrappedService() {
        return _usuarioMeeticLocalService;
    }

    @Override
    public void setWrappedService(
        UsuarioMeeticLocalService usuarioMeeticLocalService) {
        _usuarioMeeticLocalService = usuarioMeeticLocalService;
    }
}
