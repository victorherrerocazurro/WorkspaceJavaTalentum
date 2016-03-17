package com.meetic.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UsuarioMeetic}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeetic
 * @generated
 */
public class UsuarioMeeticWrapper implements UsuarioMeetic,
    ModelWrapper<UsuarioMeetic> {
    private UsuarioMeetic _usuarioMeetic;

    public UsuarioMeeticWrapper(UsuarioMeetic usuarioMeetic) {
        _usuarioMeetic = usuarioMeetic;
    }

    @Override
    public Class<?> getModelClass() {
        return UsuarioMeetic.class;
    }

    @Override
    public String getModelClassName() {
        return UsuarioMeetic.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("altura", getAltura());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Double altura = (Double) attributes.get("altura");

        if (altura != null) {
            setAltura(altura);
        }
    }

    /**
    * Returns the primary key of this usuario meetic.
    *
    * @return the primary key of this usuario meetic
    */
    @Override
    public long getPrimaryKey() {
        return _usuarioMeetic.getPrimaryKey();
    }

    /**
    * Sets the primary key of this usuario meetic.
    *
    * @param primaryKey the primary key of this usuario meetic
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _usuarioMeetic.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the user ID of this usuario meetic.
    *
    * @return the user ID of this usuario meetic
    */
    @Override
    public long getUserId() {
        return _usuarioMeetic.getUserId();
    }

    /**
    * Sets the user ID of this usuario meetic.
    *
    * @param userId the user ID of this usuario meetic
    */
    @Override
    public void setUserId(long userId) {
        _usuarioMeetic.setUserId(userId);
    }

    /**
    * Returns the user uuid of this usuario meetic.
    *
    * @return the user uuid of this usuario meetic
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeetic.getUserUuid();
    }

    /**
    * Sets the user uuid of this usuario meetic.
    *
    * @param userUuid the user uuid of this usuario meetic
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _usuarioMeetic.setUserUuid(userUuid);
    }

    /**
    * Returns the group ID of this usuario meetic.
    *
    * @return the group ID of this usuario meetic
    */
    @Override
    public long getGroupId() {
        return _usuarioMeetic.getGroupId();
    }

    /**
    * Sets the group ID of this usuario meetic.
    *
    * @param groupId the group ID of this usuario meetic
    */
    @Override
    public void setGroupId(long groupId) {
        _usuarioMeetic.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this usuario meetic.
    *
    * @return the company ID of this usuario meetic
    */
    @Override
    public long getCompanyId() {
        return _usuarioMeetic.getCompanyId();
    }

    /**
    * Sets the company ID of this usuario meetic.
    *
    * @param companyId the company ID of this usuario meetic
    */
    @Override
    public void setCompanyId(long companyId) {
        _usuarioMeetic.setCompanyId(companyId);
    }

    /**
    * Returns the user name of this usuario meetic.
    *
    * @return the user name of this usuario meetic
    */
    @Override
    public java.lang.String getUserName() {
        return _usuarioMeetic.getUserName();
    }

    /**
    * Sets the user name of this usuario meetic.
    *
    * @param userName the user name of this usuario meetic
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _usuarioMeetic.setUserName(userName);
    }

    /**
    * Returns the create date of this usuario meetic.
    *
    * @return the create date of this usuario meetic
    */
    @Override
    public java.util.Date getCreateDate() {
        return _usuarioMeetic.getCreateDate();
    }

    /**
    * Sets the create date of this usuario meetic.
    *
    * @param createDate the create date of this usuario meetic
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _usuarioMeetic.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this usuario meetic.
    *
    * @return the modified date of this usuario meetic
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _usuarioMeetic.getModifiedDate();
    }

    /**
    * Sets the modified date of this usuario meetic.
    *
    * @param modifiedDate the modified date of this usuario meetic
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _usuarioMeetic.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the altura of this usuario meetic.
    *
    * @return the altura of this usuario meetic
    */
    @Override
    public double getAltura() {
        return _usuarioMeetic.getAltura();
    }

    /**
    * Sets the altura of this usuario meetic.
    *
    * @param altura the altura of this usuario meetic
    */
    @Override
    public void setAltura(double altura) {
        _usuarioMeetic.setAltura(altura);
    }

    @Override
    public boolean isNew() {
        return _usuarioMeetic.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _usuarioMeetic.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _usuarioMeetic.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _usuarioMeetic.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _usuarioMeetic.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _usuarioMeetic.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _usuarioMeetic.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _usuarioMeetic.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _usuarioMeetic.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _usuarioMeetic.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _usuarioMeetic.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UsuarioMeeticWrapper((UsuarioMeetic) _usuarioMeetic.clone());
    }

    @Override
    public int compareTo(com.meetic.model.UsuarioMeetic usuarioMeetic) {
        return _usuarioMeetic.compareTo(usuarioMeetic);
    }

    @Override
    public int hashCode() {
        return _usuarioMeetic.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.meetic.model.UsuarioMeetic> toCacheModel() {
        return _usuarioMeetic.toCacheModel();
    }

    @Override
    public com.meetic.model.UsuarioMeetic toEscapedModel() {
        return new UsuarioMeeticWrapper(_usuarioMeetic.toEscapedModel());
    }

    @Override
    public com.meetic.model.UsuarioMeetic toUnescapedModel() {
        return new UsuarioMeeticWrapper(_usuarioMeetic.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _usuarioMeetic.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _usuarioMeetic.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _usuarioMeetic.persist();
    }

    @Override
    public com.liferay.portal.model.User getUserPortal()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioMeetic.getUserPortal();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UsuarioMeeticWrapper)) {
            return false;
        }

        UsuarioMeeticWrapper usuarioMeeticWrapper = (UsuarioMeeticWrapper) obj;

        if (Validator.equals(_usuarioMeetic, usuarioMeeticWrapper._usuarioMeetic)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UsuarioMeetic getWrappedUsuarioMeetic() {
        return _usuarioMeetic;
    }

    @Override
    public UsuarioMeetic getWrappedModel() {
        return _usuarioMeetic;
    }

    @Override
    public void resetOriginalValues() {
        _usuarioMeetic.resetOriginalValues();
    }
}
