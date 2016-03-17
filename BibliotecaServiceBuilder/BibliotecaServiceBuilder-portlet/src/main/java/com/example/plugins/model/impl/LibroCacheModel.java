package com.example.plugins.model.impl;

import com.example.plugins.model.Libro;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Libro in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Libro
 * @generated
 */
public class LibroCacheModel implements CacheModel<Libro>, Externalizable {
    public long isbn;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String autor;
    public String titulo;
    public int numeroPaginas;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{isbn=");
        sb.append(isbn);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", autor=");
        sb.append(autor);
        sb.append(", titulo=");
        sb.append(titulo);
        sb.append(", numeroPaginas=");
        sb.append(numeroPaginas);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Libro toEntityModel() {
        LibroImpl libroImpl = new LibroImpl();

        libroImpl.setIsbn(isbn);
        libroImpl.setGroupId(groupId);
        libroImpl.setCompanyId(companyId);
        libroImpl.setUserId(userId);

        if (userName == null) {
            libroImpl.setUserName(StringPool.BLANK);
        } else {
            libroImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            libroImpl.setCreateDate(null);
        } else {
            libroImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            libroImpl.setModifiedDate(null);
        } else {
            libroImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (autor == null) {
            libroImpl.setAutor(StringPool.BLANK);
        } else {
            libroImpl.setAutor(autor);
        }

        if (titulo == null) {
            libroImpl.setTitulo(StringPool.BLANK);
        } else {
            libroImpl.setTitulo(titulo);
        }

        libroImpl.setNumeroPaginas(numeroPaginas);

        libroImpl.resetOriginalValues();

        return libroImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        isbn = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        autor = objectInput.readUTF();
        titulo = objectInput.readUTF();
        numeroPaginas = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(isbn);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (autor == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(autor);
        }

        if (titulo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(titulo);
        }

        objectOutput.writeInt(numeroPaginas);
    }
}
