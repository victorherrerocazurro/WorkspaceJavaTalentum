package com.meetic.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.meetic.model.UsuarioMeetic;

import com.meetic.service.UsuarioMeeticLocalService;
import com.meetic.service.persistence.UsuarioMeeticPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the usuario meetic local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.meetic.service.impl.UsuarioMeeticLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.meetic.service.impl.UsuarioMeeticLocalServiceImpl
 * @see com.meetic.service.UsuarioMeeticLocalServiceUtil
 * @generated
 */
public abstract class UsuarioMeeticLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements UsuarioMeeticLocalService,
        IdentifiableBean {
    @BeanReference(type = com.meetic.service.UsuarioMeeticLocalService.class)
    protected com.meetic.service.UsuarioMeeticLocalService usuarioMeeticLocalService;
    @BeanReference(type = com.meetic.service.UsuarioMeeticService.class)
    protected com.meetic.service.UsuarioMeeticService usuarioMeeticService;
    @BeanReference(type = UsuarioMeeticPersistence.class)
    protected UsuarioMeeticPersistence usuarioMeeticPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private UsuarioMeeticLocalServiceClpInvoker _clpInvoker = new UsuarioMeeticLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.meetic.service.UsuarioMeeticLocalServiceUtil} to access the usuario meetic local service.
     */

    /**
     * Adds the usuario meetic to the database. Also notifies the appropriate model listeners.
     *
     * @param usuarioMeetic the usuario meetic
     * @return the usuario meetic that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public UsuarioMeetic addUsuarioMeetic(UsuarioMeetic usuarioMeetic)
        throws SystemException {
        usuarioMeetic.setNew(true);

        return usuarioMeeticPersistence.update(usuarioMeetic);
    }

    /**
     * Creates a new usuario meetic with the primary key. Does not add the usuario meetic to the database.
     *
     * @param userId the primary key for the new usuario meetic
     * @return the new usuario meetic
     */
    @Override
    public UsuarioMeetic createUsuarioMeetic(long userId) {
        return usuarioMeeticPersistence.create(userId);
    }

    /**
     * Deletes the usuario meetic with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the usuario meetic
     * @return the usuario meetic that was removed
     * @throws PortalException if a usuario meetic with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public UsuarioMeetic deleteUsuarioMeetic(long userId)
        throws PortalException, SystemException {
        return usuarioMeeticPersistence.remove(userId);
    }

    /**
     * Deletes the usuario meetic from the database. Also notifies the appropriate model listeners.
     *
     * @param usuarioMeetic the usuario meetic
     * @return the usuario meetic that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public UsuarioMeetic deleteUsuarioMeetic(UsuarioMeetic usuarioMeetic)
        throws SystemException {
        return usuarioMeeticPersistence.remove(usuarioMeetic);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(UsuarioMeetic.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return usuarioMeeticPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return usuarioMeeticPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return usuarioMeeticPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return usuarioMeeticPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return usuarioMeeticPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public UsuarioMeetic fetchUsuarioMeetic(long userId)
        throws SystemException {
        return usuarioMeeticPersistence.fetchByPrimaryKey(userId);
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
    public UsuarioMeetic getUsuarioMeetic(long userId)
        throws PortalException, SystemException {
        return usuarioMeeticPersistence.findByPrimaryKey(userId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return usuarioMeeticPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<UsuarioMeetic> getUsuarioMeetics(int start, int end)
        throws SystemException {
        return usuarioMeeticPersistence.findAll(start, end);
    }

    /**
     * Returns the number of usuario meetics.
     *
     * @return the number of usuario meetics
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getUsuarioMeeticsCount() throws SystemException {
        return usuarioMeeticPersistence.countAll();
    }

    /**
     * Updates the usuario meetic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param usuarioMeetic the usuario meetic
     * @return the usuario meetic that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public UsuarioMeetic updateUsuarioMeetic(UsuarioMeetic usuarioMeetic)
        throws SystemException {
        return usuarioMeeticPersistence.update(usuarioMeetic);
    }

    /**
     * Returns the usuario meetic local service.
     *
     * @return the usuario meetic local service
     */
    public com.meetic.service.UsuarioMeeticLocalService getUsuarioMeeticLocalService() {
        return usuarioMeeticLocalService;
    }

    /**
     * Sets the usuario meetic local service.
     *
     * @param usuarioMeeticLocalService the usuario meetic local service
     */
    public void setUsuarioMeeticLocalService(
        com.meetic.service.UsuarioMeeticLocalService usuarioMeeticLocalService) {
        this.usuarioMeeticLocalService = usuarioMeeticLocalService;
    }

    /**
     * Returns the usuario meetic remote service.
     *
     * @return the usuario meetic remote service
     */
    public com.meetic.service.UsuarioMeeticService getUsuarioMeeticService() {
        return usuarioMeeticService;
    }

    /**
     * Sets the usuario meetic remote service.
     *
     * @param usuarioMeeticService the usuario meetic remote service
     */
    public void setUsuarioMeeticService(
        com.meetic.service.UsuarioMeeticService usuarioMeeticService) {
        this.usuarioMeeticService = usuarioMeeticService;
    }

    /**
     * Returns the usuario meetic persistence.
     *
     * @return the usuario meetic persistence
     */
    public UsuarioMeeticPersistence getUsuarioMeeticPersistence() {
        return usuarioMeeticPersistence;
    }

    /**
     * Sets the usuario meetic persistence.
     *
     * @param usuarioMeeticPersistence the usuario meetic persistence
     */
    public void setUsuarioMeeticPersistence(
        UsuarioMeeticPersistence usuarioMeeticPersistence) {
        this.usuarioMeeticPersistence = usuarioMeeticPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.meetic.model.UsuarioMeetic",
            usuarioMeeticLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.meetic.model.UsuarioMeetic");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return UsuarioMeetic.class;
    }

    protected String getModelClassName() {
        return UsuarioMeetic.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = usuarioMeeticPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
