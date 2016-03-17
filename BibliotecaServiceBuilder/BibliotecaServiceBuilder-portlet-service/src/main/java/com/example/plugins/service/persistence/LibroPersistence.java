package com.example.plugins.service.persistence;

import com.example.plugins.model.Libro;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the libro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LibroPersistenceImpl
 * @see LibroUtil
 * @generated
 */
public interface LibroPersistence extends BasePersistence<Libro> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LibroUtil} to access the libro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the libros where titulo = &#63;.
    *
    * @param titulo the titulo
    * @return the matching libros
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Libro> findBytitulo(
        java.lang.String titulo)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Libro> findBytitulo(
        java.lang.String titulo, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Libro> findBytitulo(
        java.lang.String titulo, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching libro
    * @throws com.example.plugins.NoSuchLibroException if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Libro findBytitulo_First(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching libro, or <code>null</code> if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Libro fetchBytitulo_First(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching libro
    * @throws com.example.plugins.NoSuchLibroException if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Libro findBytitulo_Last(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last libro in the ordered set where titulo = &#63;.
    *
    * @param titulo the titulo
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching libro, or <code>null</code> if a matching libro could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Libro fetchBytitulo_Last(
        java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Libro[] findBytitulo_PrevAndNext(
        long isbn, java.lang.String titulo,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the libros where titulo = &#63; from the database.
    *
    * @param titulo the titulo
    * @throws SystemException if a system exception occurred
    */
    public void removeBytitulo(java.lang.String titulo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of libros where titulo = &#63;.
    *
    * @param titulo the titulo
    * @return the number of matching libros
    * @throws SystemException if a system exception occurred
    */
    public int countBytitulo(java.lang.String titulo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the libro in the entity cache if it is enabled.
    *
    * @param libro the libro
    */
    public void cacheResult(com.example.plugins.model.Libro libro);

    /**
    * Caches the libros in the entity cache if it is enabled.
    *
    * @param libros the libros
    */
    public void cacheResult(
        java.util.List<com.example.plugins.model.Libro> libros);

    /**
    * Creates a new libro with the primary key. Does not add the libro to the database.
    *
    * @param isbn the primary key for the new libro
    * @return the new libro
    */
    public com.example.plugins.model.Libro create(long isbn);

    /**
    * Removes the libro with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param isbn the primary key of the libro
    * @return the libro that was removed
    * @throws com.example.plugins.NoSuchLibroException if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Libro remove(long isbn)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.example.plugins.model.Libro updateImpl(
        com.example.plugins.model.Libro libro)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the libro with the primary key or throws a {@link com.example.plugins.NoSuchLibroException} if it could not be found.
    *
    * @param isbn the primary key of the libro
    * @return the libro
    * @throws com.example.plugins.NoSuchLibroException if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Libro findByPrimaryKey(long isbn)
        throws com.example.plugins.NoSuchLibroException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the libro with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param isbn the primary key of the libro
    * @return the libro, or <code>null</code> if a libro with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Libro fetchByPrimaryKey(long isbn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the libros.
    *
    * @return the libros
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Libro> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Libro> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Libro> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the libros from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of libros.
    *
    * @return the number of libros
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
