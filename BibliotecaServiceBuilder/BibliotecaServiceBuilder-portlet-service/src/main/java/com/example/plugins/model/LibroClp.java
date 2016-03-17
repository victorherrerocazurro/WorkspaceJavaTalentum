package com.example.plugins.model;

import com.example.plugins.service.ClpSerializer;
import com.example.plugins.service.LibroLocalServiceUtil;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ContainerModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LibroClp extends BaseModelImpl<Libro> implements Libro {
    private long _isbn;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _autor;
    private String _titulo;
    private int _numeroPaginas;
    private BaseModel<?> _libroRemoteModel;
    private Class<?> _clpSerializerClass = com.example.plugins.service.ClpSerializer.class;

    public LibroClp() {
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
    public long getPrimaryKey() {
        return _isbn;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIsbn(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _isbn;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getIsbn() {
        return _isbn;
    }

    @Override
    public void setIsbn(long isbn) {
        _isbn = isbn;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setIsbn", long.class);

                method.invoke(_libroRemoteModel, isbn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_libroRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_libroRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_libroRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_libroRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_libroRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_libroRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAutor() {
        return _autor;
    }

    @Override
    public void setAutor(String autor) {
        _autor = autor;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setAutor", String.class);

                method.invoke(_libroRemoteModel, autor);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitulo() {
        return _titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        _titulo = titulo;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setTitulo", String.class);

                method.invoke(_libroRemoteModel, titulo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNumeroPaginas() {
        return _numeroPaginas;
    }

    @Override
    public void setNumeroPaginas(int numeroPaginas) {
        _numeroPaginas = numeroPaginas;

        if (_libroRemoteModel != null) {
            try {
                Class<?> clazz = _libroRemoteModel.getClass();

                Method method = clazz.getMethod("setNumeroPaginas", int.class);

                method.invoke(_libroRemoteModel, numeroPaginas);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public TrashEntry getTrashEntry() throws PortalException, SystemException {
        if (!isInTrash()) {
            return null;
        }

        TrashEntry trashEntry = TrashEntryLocalServiceUtil.fetchEntry(getModelClassName(),
                getTrashEntryClassPK());

        if (trashEntry != null) {
            return trashEntry;
        }

        TrashHandler trashHandler = getTrashHandler();

        if (!Validator.isNull(trashHandler.getContainerModelClassName())) {
            ContainerModel containerModel = null;

            try {
                containerModel = trashHandler.getParentContainerModel(this);
            } catch (NoSuchModelException nsme) {
                return null;
            }

            while (containerModel != null) {
                if (containerModel instanceof TrashedModel) {
                    TrashedModel trashedModel = (TrashedModel) containerModel;

                    return trashedModel.getTrashEntry();
                }

                trashHandler = TrashHandlerRegistryUtil.getTrashHandler(trashHandler.getContainerModelClassName());

                if (trashHandler == null) {
                    return null;
                }

                containerModel = trashHandler.getContainerModel(containerModel.getParentContainerModelId());
            }
        }

        return null;
    }

    @Override
    public long getTrashEntryClassPK() {
        return getPrimaryKey();
    }

    @Override
    public TrashHandler getTrashHandler() {
        return TrashHandlerRegistryUtil.getTrashHandler(getModelClassName());
    }

    @Override
    public boolean isInTrash() {
        if (getStatus() == WorkflowConstants.STATUS_IN_TRASH) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isInTrashContainer() {
        TrashHandler trashHandler = getTrashHandler();

        if ((trashHandler == null) ||
                Validator.isNull(trashHandler.getContainerModelClassName())) {
            return false;
        }

        try {
            ContainerModel containerModel = trashHandler.getParentContainerModel(this);

            if (containerModel == null) {
                return false;
            }

            if (containerModel instanceof TrashedModel) {
                return ((TrashedModel) containerModel).isInTrash();
            }
        } catch (Exception e) {
        }

        return false;
    }

    public BaseModel<?> getLibroRemoteModel() {
        return _libroRemoteModel;
    }

    public void setLibroRemoteModel(BaseModel<?> libroRemoteModel) {
        _libroRemoteModel = libroRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _libroRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_libroRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LibroLocalServiceUtil.addLibro(this);
        } else {
            LibroLocalServiceUtil.updateLibro(this);
        }
    }

    @Override
    public Libro toEscapedModel() {
        return (Libro) ProxyUtil.newProxyInstance(Libro.class.getClassLoader(),
            new Class[] { Libro.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LibroClp clone = new LibroClp();

        clone.setIsbn(getIsbn());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setAutor(getAutor());
        clone.setTitulo(getTitulo());
        clone.setNumeroPaginas(getNumeroPaginas());

        return clone;
    }

    @Override
    public int compareTo(Libro libro) {
        int value = 0;

        value = getTitulo().compareTo(libro.getTitulo());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LibroClp)) {
            return false;
        }

        LibroClp libro = (LibroClp) obj;

        long primaryKey = libro.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{isbn=");
        sb.append(getIsbn());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", autor=");
        sb.append(getAutor());
        sb.append(", titulo=");
        sb.append(getTitulo());
        sb.append(", numeroPaginas=");
        sb.append(getNumeroPaginas());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.example.plugins.model.Libro");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>isbn</column-name><column-value><![CDATA[");
        sb.append(getIsbn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>autor</column-name><column-value><![CDATA[");
        sb.append(getAutor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>titulo</column-name><column-value><![CDATA[");
        sb.append(getTitulo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>numeroPaginas</column-name><column-value><![CDATA[");
        sb.append(getNumeroPaginas());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
