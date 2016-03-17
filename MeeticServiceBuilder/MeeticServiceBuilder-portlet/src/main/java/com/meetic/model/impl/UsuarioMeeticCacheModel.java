package com.meetic.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meetic.model.UsuarioMeetic;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UsuarioMeetic in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeetic
 * @generated
 */
public class UsuarioMeeticCacheModel implements CacheModel<UsuarioMeetic>,
    Externalizable {
    public long userId;
    public long groupId;
    public long companyId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public double altura;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", altura=");
        sb.append(altura);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UsuarioMeetic toEntityModel() {
        UsuarioMeeticImpl usuarioMeeticImpl = new UsuarioMeeticImpl();

        usuarioMeeticImpl.setUserId(userId);
        usuarioMeeticImpl.setGroupId(groupId);
        usuarioMeeticImpl.setCompanyId(companyId);

        if (userName == null) {
            usuarioMeeticImpl.setUserName(StringPool.BLANK);
        } else {
            usuarioMeeticImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            usuarioMeeticImpl.setCreateDate(null);
        } else {
            usuarioMeeticImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            usuarioMeeticImpl.setModifiedDate(null);
        } else {
            usuarioMeeticImpl.setModifiedDate(new Date(modifiedDate));
        }

        usuarioMeeticImpl.setAltura(altura);

        usuarioMeeticImpl.resetOriginalValues();

        return usuarioMeeticImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        altura = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeDouble(altura);
    }
}
