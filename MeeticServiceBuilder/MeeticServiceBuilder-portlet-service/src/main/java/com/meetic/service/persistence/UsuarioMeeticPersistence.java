package com.meetic.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.meetic.model.UsuarioMeetic;

/**
 * The persistence interface for the usuario meetic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeeticPersistenceImpl
 * @see UsuarioMeeticUtil
 * @generated
 */
public interface UsuarioMeeticPersistence extends BasePersistence<UsuarioMeetic> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UsuarioMeeticUtil} to access the usuario meetic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the usuario meetic in the entity cache if it is enabled.
    *
    * @param usuarioMeetic the usuario meetic
    */
    public void cacheResult(com.meetic.model.UsuarioMeetic usuarioMeetic);

    /**
    * Caches the usuario meetics in the entity cache if it is enabled.
    *
    * @param usuarioMeetics the usuario meetics
    */
    public void cacheResult(
        java.util.List<com.meetic.model.UsuarioMeetic> usuarioMeetics);

    /**
    * Creates a new usuario meetic with the primary key. Does not add the usuario meetic to the database.
    *
    * @param userId the primary key for the new usuario meetic
    * @return the new usuario meetic
    */
    public com.meetic.model.UsuarioMeetic create(long userId);

    /**
    * Removes the usuario meetic with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic that was removed
    * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meetic.model.UsuarioMeetic remove(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meetic.NoSuchUsuarioMeeticException;

    public com.meetic.model.UsuarioMeetic updateImpl(
        com.meetic.model.UsuarioMeetic usuarioMeetic)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuario meetic with the primary key or throws a {@link com.meetic.NoSuchUsuarioMeeticException} if it could not be found.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic
    * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meetic.model.UsuarioMeetic findByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meetic.NoSuchUsuarioMeeticException;

    /**
    * Returns the usuario meetic with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic, or <code>null</code> if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meetic.model.UsuarioMeetic fetchByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the usuario meetics.
    *
    * @return the usuario meetics
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meetic.model.UsuarioMeetic> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meetic.model.UsuarioMeetic> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the usuario meetics.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meetic.model.impl.UsuarioMeeticModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuario meetics
    * @param end the upper bound of the range of usuario meetics (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of usuario meetics
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meetic.model.UsuarioMeetic> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the usuario meetics from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of usuario meetics.
    *
    * @return the number of usuario meetics
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
