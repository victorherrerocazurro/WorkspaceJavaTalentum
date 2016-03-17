package com.meetic.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.meetic.NoSuchUsuarioMeeticException;

import com.meetic.model.UsuarioMeetic;
import com.meetic.model.impl.UsuarioMeeticImpl;
import com.meetic.model.impl.UsuarioMeeticModelImpl;

import com.meetic.service.persistence.UsuarioMeeticPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the usuario meetic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeeticPersistence
 * @see UsuarioMeeticUtil
 * @generated
 */
public class UsuarioMeeticPersistenceImpl extends BasePersistenceImpl<UsuarioMeetic>
    implements UsuarioMeeticPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UsuarioMeeticUtil} to access the usuario meetic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UsuarioMeeticImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioMeeticModelImpl.FINDER_CACHE_ENABLED,
            UsuarioMeeticImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioMeeticModelImpl.FINDER_CACHE_ENABLED,
            UsuarioMeeticImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioMeeticModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_USUARIOMEETIC = "SELECT usuarioMeetic FROM UsuarioMeetic usuarioMeetic";
    private static final String _SQL_COUNT_USUARIOMEETIC = "SELECT COUNT(usuarioMeetic) FROM UsuarioMeetic usuarioMeetic";
    private static final String _ORDER_BY_ENTITY_ALIAS = "usuarioMeetic.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsuarioMeetic exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UsuarioMeeticPersistenceImpl.class);
    private static UsuarioMeetic _nullUsuarioMeetic = new UsuarioMeeticImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UsuarioMeetic> toCacheModel() {
                return _nullUsuarioMeeticCacheModel;
            }
        };

    private static CacheModel<UsuarioMeetic> _nullUsuarioMeeticCacheModel = new CacheModel<UsuarioMeetic>() {
            @Override
            public UsuarioMeetic toEntityModel() {
                return _nullUsuarioMeetic;
            }
        };

    public UsuarioMeeticPersistenceImpl() {
        setModelClass(UsuarioMeetic.class);
    }

    /**
     * Caches the usuario meetic in the entity cache if it is enabled.
     *
     * @param usuarioMeetic the usuario meetic
     */
    @Override
    public void cacheResult(UsuarioMeetic usuarioMeetic) {
        EntityCacheUtil.putResult(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioMeeticImpl.class, usuarioMeetic.getPrimaryKey(),
            usuarioMeetic);

        usuarioMeetic.resetOriginalValues();
    }

    /**
     * Caches the usuario meetics in the entity cache if it is enabled.
     *
     * @param usuarioMeetics the usuario meetics
     */
    @Override
    public void cacheResult(List<UsuarioMeetic> usuarioMeetics) {
        for (UsuarioMeetic usuarioMeetic : usuarioMeetics) {
            if (EntityCacheUtil.getResult(
                        UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioMeeticImpl.class, usuarioMeetic.getPrimaryKey()) == null) {
                cacheResult(usuarioMeetic);
            } else {
                usuarioMeetic.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all usuario meetics.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UsuarioMeeticImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UsuarioMeeticImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the usuario meetic.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UsuarioMeetic usuarioMeetic) {
        EntityCacheUtil.removeResult(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioMeeticImpl.class, usuarioMeetic.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UsuarioMeetic> usuarioMeetics) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UsuarioMeetic usuarioMeetic : usuarioMeetics) {
            EntityCacheUtil.removeResult(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioMeeticImpl.class, usuarioMeetic.getPrimaryKey());
        }
    }

    /**
     * Creates a new usuario meetic with the primary key. Does not add the usuario meetic to the database.
     *
     * @param userId the primary key for the new usuario meetic
     * @return the new usuario meetic
     */
    @Override
    public UsuarioMeetic create(long userId) {
        UsuarioMeetic usuarioMeetic = new UsuarioMeeticImpl();

        usuarioMeetic.setNew(true);
        usuarioMeetic.setPrimaryKey(userId);

        return usuarioMeetic;
    }

    /**
     * Removes the usuario meetic with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the usuario meetic
     * @return the usuario meetic that was removed
     * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioMeetic remove(long userId)
        throws NoSuchUsuarioMeeticException, SystemException {
        return remove((Serializable) userId);
    }

    /**
     * Removes the usuario meetic with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the usuario meetic
     * @return the usuario meetic that was removed
     * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioMeetic remove(Serializable primaryKey)
        throws NoSuchUsuarioMeeticException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UsuarioMeetic usuarioMeetic = (UsuarioMeetic) session.get(UsuarioMeeticImpl.class,
                    primaryKey);

            if (usuarioMeetic == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUsuarioMeeticException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(usuarioMeetic);
        } catch (NoSuchUsuarioMeeticException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UsuarioMeetic removeImpl(UsuarioMeetic usuarioMeetic)
        throws SystemException {
        usuarioMeetic = toUnwrappedModel(usuarioMeetic);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(usuarioMeetic)) {
                usuarioMeetic = (UsuarioMeetic) session.get(UsuarioMeeticImpl.class,
                        usuarioMeetic.getPrimaryKeyObj());
            }

            if (usuarioMeetic != null) {
                session.delete(usuarioMeetic);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (usuarioMeetic != null) {
            clearCache(usuarioMeetic);
        }

        return usuarioMeetic;
    }

    @Override
    public UsuarioMeetic updateImpl(
        com.meetic.model.UsuarioMeetic usuarioMeetic) throws SystemException {
        usuarioMeetic = toUnwrappedModel(usuarioMeetic);

        boolean isNew = usuarioMeetic.isNew();

        Session session = null;

        try {
            session = openSession();

            if (usuarioMeetic.isNew()) {
                session.save(usuarioMeetic);

                usuarioMeetic.setNew(false);
            } else {
                session.merge(usuarioMeetic);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioMeeticImpl.class, usuarioMeetic.getPrimaryKey(),
            usuarioMeetic);

        return usuarioMeetic;
    }

    protected UsuarioMeetic toUnwrappedModel(UsuarioMeetic usuarioMeetic) {
        if (usuarioMeetic instanceof UsuarioMeeticImpl) {
            return usuarioMeetic;
        }

        UsuarioMeeticImpl usuarioMeeticImpl = new UsuarioMeeticImpl();

        usuarioMeeticImpl.setNew(usuarioMeetic.isNew());
        usuarioMeeticImpl.setPrimaryKey(usuarioMeetic.getPrimaryKey());

        usuarioMeeticImpl.setUserId(usuarioMeetic.getUserId());
        usuarioMeeticImpl.setGroupId(usuarioMeetic.getGroupId());
        usuarioMeeticImpl.setCompanyId(usuarioMeetic.getCompanyId());
        usuarioMeeticImpl.setUserName(usuarioMeetic.getUserName());
        usuarioMeeticImpl.setCreateDate(usuarioMeetic.getCreateDate());
        usuarioMeeticImpl.setModifiedDate(usuarioMeetic.getModifiedDate());
        usuarioMeeticImpl.setAltura(usuarioMeetic.getAltura());

        return usuarioMeeticImpl;
    }

    /**
     * Returns the usuario meetic with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the usuario meetic
     * @return the usuario meetic
     * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioMeetic findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUsuarioMeeticException, SystemException {
        UsuarioMeetic usuarioMeetic = fetchByPrimaryKey(primaryKey);

        if (usuarioMeetic == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUsuarioMeeticException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return usuarioMeetic;
    }

    /**
     * Returns the usuario meetic with the primary key or throws a {@link com.meetic.NoSuchUsuarioMeeticException} if it could not be found.
     *
     * @param userId the primary key of the usuario meetic
     * @return the usuario meetic
     * @throws com.meetic.NoSuchUsuarioMeeticException if a usuario meetic with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioMeetic findByPrimaryKey(long userId)
        throws NoSuchUsuarioMeeticException, SystemException {
        return findByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns the usuario meetic with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the usuario meetic
     * @return the usuario meetic, or <code>null</code> if a usuario meetic with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioMeetic fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UsuarioMeetic usuarioMeetic = (UsuarioMeetic) EntityCacheUtil.getResult(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioMeeticImpl.class, primaryKey);

        if (usuarioMeetic == _nullUsuarioMeetic) {
            return null;
        }

        if (usuarioMeetic == null) {
            Session session = null;

            try {
                session = openSession();

                usuarioMeetic = (UsuarioMeetic) session.get(UsuarioMeeticImpl.class,
                        primaryKey);

                if (usuarioMeetic != null) {
                    cacheResult(usuarioMeetic);
                } else {
                    EntityCacheUtil.putResult(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioMeeticImpl.class, primaryKey, _nullUsuarioMeetic);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UsuarioMeeticModelImpl.ENTITY_CACHE_ENABLED,
                    UsuarioMeeticImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return usuarioMeetic;
    }

    /**
     * Returns the usuario meetic with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userId the primary key of the usuario meetic
     * @return the usuario meetic, or <code>null</code> if a usuario meetic with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioMeetic fetchByPrimaryKey(long userId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns all the usuario meetics.
     *
     * @return the usuario meetics
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioMeetic> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<UsuarioMeetic> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<UsuarioMeetic> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<UsuarioMeetic> list = (List<UsuarioMeetic>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USUARIOMEETIC);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USUARIOMEETIC;

                if (pagination) {
                    sql = sql.concat(UsuarioMeeticModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UsuarioMeetic>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UsuarioMeetic>(list);
                } else {
                    list = (List<UsuarioMeetic>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the usuario meetics from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UsuarioMeetic usuarioMeetic : findAll()) {
            remove(usuarioMeetic);
        }
    }

    /**
     * Returns the number of usuario meetics.
     *
     * @return the number of usuario meetics
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_USUARIOMEETIC);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the usuario meetic persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.meetic.model.UsuarioMeetic")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UsuarioMeetic>> listenersList = new ArrayList<ModelListener<UsuarioMeetic>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UsuarioMeetic>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UsuarioMeeticImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
