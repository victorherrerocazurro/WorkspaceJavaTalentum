package com.meetic.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.meetic.model.UsuarioMeetic;

import com.meetic.service.UsuarioMeeticService;
import com.meetic.service.persistence.UsuarioMeeticPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the usuario meetic remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.meetic.service.impl.UsuarioMeeticServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.meetic.service.impl.UsuarioMeeticServiceImpl
 * @see com.meetic.service.UsuarioMeeticServiceUtil
 * @generated
 */
public abstract class UsuarioMeeticServiceBaseImpl extends BaseServiceImpl
    implements UsuarioMeeticService, IdentifiableBean {
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
    private UsuarioMeeticServiceClpInvoker _clpInvoker = new UsuarioMeeticServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.meetic.service.UsuarioMeeticServiceUtil} to access the usuario meetic remote service.
     */

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
    }

    public void destroy() {
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