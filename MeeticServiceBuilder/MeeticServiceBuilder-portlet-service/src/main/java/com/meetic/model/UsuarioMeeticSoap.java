package com.meetic.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.meetic.service.http.UsuarioMeeticServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.meetic.service.http.UsuarioMeeticServiceSoap
 * @generated
 */
public class UsuarioMeeticSoap implements Serializable {
    private long _userId;
    private long _groupId;
    private long _companyId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private double _altura;

    public UsuarioMeeticSoap() {
    }

    public static UsuarioMeeticSoap toSoapModel(UsuarioMeetic model) {
        UsuarioMeeticSoap soapModel = new UsuarioMeeticSoap();

        soapModel.setUserId(model.getUserId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setAltura(model.getAltura());

        return soapModel;
    }

    public static UsuarioMeeticSoap[] toSoapModels(UsuarioMeetic[] models) {
        UsuarioMeeticSoap[] soapModels = new UsuarioMeeticSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UsuarioMeeticSoap[][] toSoapModels(UsuarioMeetic[][] models) {
        UsuarioMeeticSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UsuarioMeeticSoap[models.length][models[0].length];
        } else {
            soapModels = new UsuarioMeeticSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UsuarioMeeticSoap[] toSoapModels(List<UsuarioMeetic> models) {
        List<UsuarioMeeticSoap> soapModels = new ArrayList<UsuarioMeeticSoap>(models.size());

        for (UsuarioMeetic model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UsuarioMeeticSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _userId;
    }

    public void setPrimaryKey(long pk) {
        setUserId(pk);
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
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

    public double getAltura() {
        return _altura;
    }

    public void setAltura(double altura) {
        _altura = altura;
    }
}
