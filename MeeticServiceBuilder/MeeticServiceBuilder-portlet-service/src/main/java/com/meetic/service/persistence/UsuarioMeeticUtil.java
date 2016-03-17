package com.meetic.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meetic.model.UsuarioMeetic;

import java.util.List;

/**
 * The persistence utility for the usuario meetic service. This utility wraps {@link UsuarioMeeticPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeeticPersistence
 * @see UsuarioMeeticPersistenceImpl
 * @generated
 */
public class UsuarioMeeticUtil {
    private static UsuarioMeeticPersistence _persistence;

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
    public static void clearCache(UsuarioMeetic usuarioMeetic) {
        getPersistence().clearCache(usuarioMeetic);
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
    public static List<UsuarioMeetic> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UsuarioMeetic> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UsuarioMeetic> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UsuarioMeetic update(UsuarioMeetic usuarioMeetic)
        throws SystemException {
        return getPersistence().update(usuarioMeetic);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UsuarioMeetic update(UsuarioMeetic usuarioMeetic,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(usuarioMeetic, serviceContext);
    }

    /**
    * Caches the usuario meetic in the entity cache if it is enabled.
    *
    * @param usuarioMeetic the usuario meetic
    */
    public static void cacheResult(com.meetic.model.UsuarioMeetic usuarioMeetic) {
        getPersistence().cacheResult(usuarioMeetic);
    }

    /**
    * Caches the usuario meetics in the entity cache if it is enabled.
    *
    * @param usuarioMeetics the usuario meetics
    */
    public static void cacheResult(
        java.util.List<com.meetic.model.UsuarioMeetic> usuarioMeetics) {
        getPersistence().cacheResult(usuarioMeetics);
    }

    /**
    * Creates a new usuario meetic with the primary key. Does not add the usuario meetic to the database.
    *
    * @param userId the primary key for the new usuario meetic
    * @return the new usuario meetic
    */
    public static com.meetic.model.UsuarioMeetic create(long userId) {
        return getPersistence().create(userId);
    }

    /**
    * Removes the usuario meetic with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic that was removed
    * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meetic.model.UsuarioMeetic remove(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meetic.NoSuchUsuarioMeeticException {
        return getPersistence().remove(userId);
    }

    public static com.meetic.model.UsuarioMeetic updateImpl(
        com.meetic.model.UsuarioMeetic usuarioMeetic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(usuarioMeetic);
    }

    /**
    * Returns the usuario meetic with the primary key or throws a {@link com.meetic.NoSuchUsuarioMeeticException} if it could not be found.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic
    * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meetic.model.UsuarioMeetic findByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meetic.NoSuchUsuarioMeeticException {
        return getPersistence().findByPrimaryKey(userId);
    }

    /**
    * Returns the usuario meetic with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the usuario meetic
    * @return the usuario meetic, or <code>null</code> if a usuario meetic with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meetic.model.UsuarioMeetic fetchByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userId);
    }

    /**
    * Returns all the usuario meetics.
    *
    * @return the usuario meetics
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meetic.model.UsuarioMeetic> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.meetic.model.UsuarioMeetic> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.meetic.model.UsuarioMeetic> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the usuario meetics from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of usuario meetics.
    *
    * @return the number of usuario meetics
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UsuarioMeeticPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UsuarioMeeticPersistence) PortletBeanLocatorUtil.locate(com.meetic.service.ClpSerializer.getServletContextName(),
                    UsuarioMeeticPersistence.class.getName());

            ReferenceRegistry.registerReference(UsuarioMeeticUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UsuarioMeeticPersistence persistence) {
    }
}
