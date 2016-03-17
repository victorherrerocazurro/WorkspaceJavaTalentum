package com.example.plugins.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.example.plugins.service.http.LibroServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.http.LibroServiceSoap
 * @generated
 */
public class LibroSoap implements Serializable {
    private long _isbn;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _autor;
    private String _titulo;
    private int _numeroPaginas;

    public LibroSoap() {
    }

    public static LibroSoap toSoapModel(Libro model) {
        LibroSoap soapModel = new LibroSoap();

        soapModel.setIsbn(model.getIsbn());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setAutor(model.getAutor());
        soapModel.setTitulo(model.getTitulo());
        soapModel.setNumeroPaginas(model.getNumeroPaginas());

        return soapModel;
    }

    public static LibroSoap[] toSoapModels(Libro[] models) {
        LibroSoap[] soapModels = new LibroSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LibroSoap[][] toSoapModels(Libro[][] models) {
        LibroSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LibroSoap[models.length][models[0].length];
        } else {
            soapModels = new LibroSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LibroSoap[] toSoapModels(List<Libro> models) {
        List<LibroSoap> soapModels = new ArrayList<LibroSoap>(models.size());

        for (Libro model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LibroSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _isbn;
    }

    public void setPrimaryKey(long pk) {
        setIsbn(pk);
    }

    public long getIsbn() {
        return _isbn;
    }

    public void setIsbn(long isbn) {
        _isbn = isbn;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String autor) {
        _autor = autor;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String titulo) {
        _titulo = titulo;
    }

    public int getNumeroPaginas() {
        return _numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        _numeroPaginas = numeroPaginas;
    }
}
