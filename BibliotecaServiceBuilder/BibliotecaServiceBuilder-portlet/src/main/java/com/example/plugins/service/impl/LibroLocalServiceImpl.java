package com.example.plugins.service.impl;

import java.util.Collection;
import java.util.List;

import com.example.plugins.model.Libro;
import com.example.plugins.service.base.LibroLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the libro local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.example.plugins.service.LibroLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.base.LibroLocalServiceBaseImpl
 * @see com.example.plugins.service.LibroLocalServiceUtil
 */
public class LibroLocalServiceImpl extends LibroLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.example.plugins.service.LibroLocalServiceUtil} to access the libro local service.
     */
	
	public Collection<Libro> buscaPorTitulo(String titulo) throws SystemException{
		return libroPersistence.findBytitulo(titulo);
	}
}
