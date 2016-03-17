package com.example.plugins.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Libro. This utility wraps
 * {@link com.example.plugins.service.impl.LibroLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LibroLocalService
 * @see com.example.plugins.service.base.LibroLocalServiceBaseImpl
 * @see com.example.plugins.service.impl.LibroLocalServiceImpl
 * @generated
 */
public class LibroLocalServiceUtil {
    private static LibroLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.example.plugins.service.impl.LibroLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the libro to the database. Also notifies the appropriate model listeners.
    *
    * @param libro the libro
    * @return the libro that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro addLibro(
        com.example.plugins.model.Libro libro)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLibro(libro);
    }

    /**
    * Creates a new libro with the primary key. Does not add the libro to the database.
    *
    * @param isbn the primary key for the new libro
    * @return the new libro
    */
    public static com.example.plugins.model.Libro createLibro(long isbn) {
        return getService().createLibro(isbn);
    }

    /**
    * Deletes the libro with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param isbn the primary key of the libro
    * @return the libro that was removed
    * @throws PortalException if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro deleteLibro(long isbn)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLibro(isbn);
    }

    /**
    * Deletes the libro from the database. Also notifies the appropriate model listeners.
    *
    * @param libro the libro
    * @return the libro that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro deleteLibro(
        com.example.plugins.model.Libro libro)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLibro(libro);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.example.plugins.model.Libro fetchLibro(long isbn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLibro(isbn);
    }

    /**
    * Returns the libro with the primary key.
    *
    * @param isbn the primary key of the libro
    * @return the libro
    * @throws PortalException if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro getLibro(long isbn)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLibro(isbn);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the libros.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of libros
    * @param end the upper bound of the range of libros (not inclusive)
    * @return the range of libros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Libro> getLibros(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLibros(start, end);
    }

    /**
    * Returns the number of libros.
    *
    * @return the number of libros
    * @throws SystemException if a system exception occurred
    */
    public static int getLibrosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLibrosCount();
    }

    /**
    * Updates the libro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param libro the libro
    * @return the libro that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro updateLibro(
        com.example.plugins.model.Libro libro)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLibro(libro);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.Collection<com.example.plugins.model.Libro> buscaPorTitulo(
        java.lang.String titulo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().buscaPorTitulo(titulo);
    }

    public static void clearService() {
        _service = null;
    }

    public static LibroLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LibroLocalService.class.getName());

            if (invokableLocalService instanceof LibroLocalService) {
                _service = (LibroLocalService) invokableLocalService;
            } else {
                _service = new LibroLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LibroLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LibroLocalService service) {
    }
}
