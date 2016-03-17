package com.example.plugins.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Libro}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Libro
 * @generated
 */
public class LibroWrapper implements Libro, ModelWrapper<Libro> {
    private Libro _libro;

    public LibroWrapper(Libro libro) {
        _libro = libro;
    }

    @Override
    public Class<?> getModelClass() {
        return Libro.class;
    }

    @Override
    public String getModelClassName() {
        return Libro.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("isbn", getIsbn());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("autor", getAutor());
        attributes.put("titulo", getTitulo());
        attributes.put("numeroPaginas", getNumeroPaginas());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long isbn = (Long) attributes.get("isbn");

        if (isbn != null) {
            setIsbn(isbn);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
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

        String autor = (String) attributes.get("autor");

        if (autor != null) {
            setAutor(autor);
        }

        String titulo = (String) attributes.get("titulo");

        if (titulo != null) {
            setTitulo(titulo);
        }

        Integer numeroPaginas = (Integer) attributes.get("numeroPaginas");

        if (numeroPaginas != null) {
            setNumeroPaginas(numeroPaginas);
        }
    }

    /**
    * Returns the primary key of this libro.
    *
    * @return the primary key of this libro
    */
    @Override
    public long getPrimaryKey() {
        return _libro.getPrimaryKey();
    }

    /**
    * Sets the primary key of this libro.
    *
    * @param primaryKey the primary key of this libro
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _libro.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the isbn of this libro.
    *
    * @return the isbn of this libro
    */
    @Override
    public long getIsbn() {
        return _libro.getIsbn();
    }

    /**
    * Sets the isbn of this libro.
    *
    * @param isbn the isbn of this libro
    */
    @Override
    public void setIsbn(long isbn) {
        _libro.setIsbn(isbn);
    }

    /**
    * Returns the group ID of this libro.
    *
    * @return the group ID of this libro
    */
    @Override
    public long getGroupId() {
        return _libro.getGroupId();
    }

    /**
    * Sets the group ID of this libro.
    *
    * @param groupId the group ID of this libro
    */
    @Override
    public void setGroupId(long groupId) {
        _libro.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this libro.
    *
    * @return the company ID of this libro
    */
    @Override
    public long getCompanyId() {
        return _libro.getCompanyId();
    }

    /**
    * Sets the company ID of this libro.
    *
    * @param companyId the company ID of this libro
    */
    @Override
    public void setCompanyId(long companyId) {
        _libro.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this libro.
    *
    * @return the user ID of this libro
    */
    @Override
    public long getUserId() {
        return _libro.getUserId();
    }

    /**
    * Sets the user ID of this libro.
    *
    * @param userId the user ID of this libro
    */
    @Override
    public void setUserId(long userId) {
        _libro.setUserId(userId);
    }

    /**
    * Returns the user uuid of this libro.
    *
    * @return the user uuid of this libro
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _libro.getUserUuid();
    }

    /**
    * Sets the user uuid of this libro.
    *
    * @param userUuid the user uuid of this libro
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _libro.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this libro.
    *
    * @return the user name of this libro
    */
    @Override
    public java.lang.String getUserName() {
        return _libro.getUserName();
    }

    /**
    * Sets the user name of this libro.
    *
    * @param userName the user name of this libro
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _libro.setUserName(userName);
    }

    /**
    * Returns the create date of this libro.
    *
    * @return the create date of this libro
    */
    @Override
    public java.util.Date getCreateDate() {
        return _libro.getCreateDate();
    }

    /**
    * Sets the create date of this libro.
    *
    * @param createDate the create date of this libro
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _libro.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this libro.
    *
    * @return the modified date of this libro
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _libro.getModifiedDate();
    }

    /**
    * Sets the modified date of this libro.
    *
    * @param modifiedDate the modified date of this libro
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _libro.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the autor of this libro.
    *
    * @return the autor of this libro
    */
    @Override
    public java.lang.String getAutor() {
        return _libro.getAutor();
    }

    /**
    * Sets the autor of this libro.
    *
    * @param autor the autor of this libro
    */
    @Override
    public void setAutor(java.lang.String autor) {
        _libro.setAutor(autor);
    }

    /**
    * Returns the titulo of this libro.
    *
    * @return the titulo of this libro
    */
    @Override
    public java.lang.String getTitulo() {
        return _libro.getTitulo();
    }

    /**
    * Sets the titulo of this libro.
    *
    * @param titulo the titulo of this libro
    */
    @Override
    public void setTitulo(java.lang.String titulo) {
        _libro.setTitulo(titulo);
    }

    /**
    * Returns the numero paginas of this libro.
    *
    * @return the numero paginas of this libro
    */
    @Override
    public int getNumeroPaginas() {
        return _libro.getNumeroPaginas();
    }

    /**
    * Sets the numero paginas of this libro.
    *
    * @param numeroPaginas the numero paginas of this libro
    */
    @Override
    public void setNumeroPaginas(int numeroPaginas) {
        _libro.setNumeroPaginas(numeroPaginas);
    }

    /**
    * Returns the status of this libro.
    *
    * @return the status of this libro
    */
    @Override
    public int getStatus() {
        return _libro.getStatus();
    }

    /**
    * Returns the trash entry created when this libro was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this libro.
    *
    * @return the trash entry created when this libro was moved to the Recycle Bin
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _libro.getTrashEntry();
    }

    /**
    * Returns the class primary key of the trash entry for this libro.
    *
    * @return the class primary key of the trash entry for this libro
    */
    @Override
    public long getTrashEntryClassPK() {
        return _libro.getTrashEntryClassPK();
    }

    /**
    * Returns the trash handler for this libro.
    *
    * @return the trash handler for this libro
    */
    @Override
    public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
        return _libro.getTrashHandler();
    }

    /**
    * Returns <code>true</code> if this libro is in the Recycle Bin.
    *
    * @return <code>true</code> if this libro is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _libro.isInTrash();
    }

    /**
    * Returns <code>true</code> if the parent of this libro is in the Recycle Bin.
    *
    * @return <code>true</code> if the parent of this libro is in the Recycle Bin; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean isInTrashContainer() {
        return _libro.isInTrashContainer();
    }

    @Override
    public boolean isNew() {
        return _libro.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _libro.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _libro.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _libro.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _libro.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _libro.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _libro.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _libro.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _libro.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _libro.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _libro.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LibroWrapper((Libro) _libro.clone());
    }

    @Override
    public int compareTo(com.example.plugins.model.Libro libro) {
        return _libro.compareTo(libro);
    }

    @Override
    public int hashCode() {
        return _libro.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.plugins.model.Libro> toCacheModel() {
        return _libro.toCacheModel();
    }

    @Override
    public com.example.plugins.model.Libro toEscapedModel() {
        return new LibroWrapper(_libro.toEscapedModel());
    }

    @Override
    public com.example.plugins.model.Libro toUnescapedModel() {
        return new LibroWrapper(_libro.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _libro.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _libro.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _libro.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LibroWrapper)) {
            return false;
        }

        LibroWrapper libroWrapper = (LibroWrapper) obj;

        if (Validator.equals(_libro, libroWrapper._libro)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Libro getWrappedLibro() {
        return _libro;
    }

    @Override
    public Libro getWrappedModel() {
        return _libro;
    }

    @Override
    public void resetOriginalValues() {
        _libro.resetOriginalValues();
    }
}
