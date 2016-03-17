package com.example.plugins.service.persistence;

import com.example.plugins.model.Libro;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the libro service. This utility wraps {@link LibroPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LibroPersistence
 * @see LibroPersistenceImpl
 * @generated
 */
public class LibroUtil {
    private static LibroPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Libro libro) {
        getPersistence().clearCache(libro);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Libro> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Libro> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Libro> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Libro update(Libro libro) throws SystemException {
        return getPersistence().update(libro);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Libro update(Libro libro, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(libro, serviceContext);
    }

    /**
    * Returns all the libros where titulo = &#63;.
    *
    * @param titulo the titulo
    * @return the matching libros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Libro> findBytitulo(
        java.lang.String titulo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytitulo(titulo);
    }

    /**
    * Returns a range of all the libros where titulo = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param titulo the titulo
    * @param start the lower bound of the range of libros
    * @param end the upper bound of the range of libros (not inclusive)
    * @return the range of matching libros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Libro> findBytitulo(
        java.lang.String titulo, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytitulo(titulo, start, end);
    }

    /**
    * Returns an ordered range of all the libros where titulo = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param titulo the titulo
    * @param start the lower bound of the range of libros
    * @param end the upper bound of the range of libros (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching libros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Libro> findBytitulo(
        java.lang.String titulo, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBytitulo(titulo, start, end, orderByComparator);
    }

    /**
    * Returns the first libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching libro
    * @throws com.example.plugins.NoSuchLibroException if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro findBytitulo_First(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytitulo_First(titulo, orderByComparator);
    }

    /**
    * Returns the first libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching libro, or <code>null</code> if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro fetchBytitulo_First(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBytitulo_First(titulo, orderByComparator);
    }

    /**
    * Returns the last libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching libro
    * @throws com.example.plugins.NoSuchLibroException if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro findBytitulo_Last(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytitulo_Last(titulo, orderByComparator);
    }

    /**
    * Returns the last libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching libro, or <code>null</code> if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro fetchBytitulo_Last(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBytitulo_Last(titulo, orderByComparator);
    }

    /**
    * Returns the libros before and after the current libro in the ordered set where titulo = &#63;.
    *
    * @param isbn the primary key of the current libro
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next libro
    * @throws com.example.plugins.NoSuchLibroException if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro[] findBytitulo_PrevAndNext(
        long isbn, java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBytitulo_PrevAndNext(isbn, titulo, orderByComparator);
    }

    /**
    * Removes all the libros where titulo = &#63; from the database.
    *
    * @param titulo the titulo
    * @throws SystemException if a system exception occurred
    */
    public static void removeBytitulo(java.lang.String titulo)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBytitulo(titulo);
    }

    /**
    * Returns the number of libros where titulo = &#63;.
    *
    * @param titulo the titulo
    * @return the number of matching libros
    * @throws SystemException if a system exception occurred
    */
    public static int countBytitulo(java.lang.String titulo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBytitulo(titulo);
    }

    /**
    * Caches the libro in the entity cache if it is enabled.
    *
    * @param libro the libro
    */
    public static void cacheResult(com.example.plugins.model.Libro libro) {
        getPersistence().cacheResult(libro);
    }

    /**
    * Caches the libros in the entity cache if it is enabled.
    *
    * @param libros the libros
    */
    public static void cacheResult(
        java.util.List<com.example.plugins.model.Libro> libros) {
        getPersistence().cacheResult(libros);
    }

    /**
    * Creates a new libro with the primary key. Does not add the libro to the database.
    *
    * @param isbn the primary key for the new libro
    * @return the new libro
    */
    public static com.example.plugins.model.Libro create(long isbn) {
        return getPersistence().create(isbn);
    }

    /**
    * Removes the libro with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param isbn the primary key of the libro
    * @return the libro that was removed
    * @throws com.example.plugins.NoSuchLibroException if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro remove(long isbn)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(isbn);
    }

    public static com.example.plugins.model.Libro updateImpl(
        com.example.plugins.model.Libro libro)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(libro);
    }

    /**
    * Returns the libro with the primary key or throws a {@link com.example.plugins.NoSuchLibroException} if it could not be found.
    *
    * @param isbn the primary key of the libro
    * @return the libro
    * @throws com.example.plugins.NoSuchLibroException if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro findByPrimaryKey(long isbn)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(isbn);
    }

    /**
    * Returns the libro with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param isbn the primary key of the libro
    * @return the libro, or <code>null</code> if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Libro fetchByPrimaryKey(long isbn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(isbn);
    }

    /**
    * Returns all the libros.
    *
    * @return the libros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Libro> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.example.plugins.model.Libro> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the libros.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of libros
    * @param end the upper bound of the range of libros (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of libros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Libro> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the libros from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of libros.
    *
    * @return the number of libros
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LibroPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LibroPersistence) PortletBeanLocatorUtil.locate(com.example.plugins.service.ClpSerializer.getServletContextName(),
                    LibroPersistence.class.getName());

            ReferenceRegistry.registerReference(LibroUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LibroPersistence persistence) {
    }
}
