package com.meetic.service.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.meetic.model.UsuarioMeetic;
import com.meetic.service.base.UsuarioMeeticLocalServiceBaseImpl;

/**
 * The implementation of the usuario meetic local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.meetic.service.UsuarioMeeticLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.meetic.service.base.UsuarioMeeticLocalServiceBaseImpl
 * @see com.meetic.service.UsuarioMeeticLocalServiceUtil
 */
public class UsuarioMeeticLocalServiceImpl extends UsuarioMeeticLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * com.meetic.service.UsuarioMeeticLocalServiceUtil} to access the usuario
	 * meetic local service.
	 */

	public Collection<UsuarioMeetic> buscarAfines(long idUser) throws PortalException, SystemException {

		Collection<UsuarioMeetic> afines = new HashSet<UsuarioMeetic>();

		// Este usuario es el que esta buscando a sus afines
		UsuarioMeetic elQueBusca = getUsuarioMeetic(idUser);

		List<UsuarioMeetic> candidatos = getUsuarioMeetics(QueryUtil.ALL_POS, 
																QueryUtil.ALL_POS);

		for (UsuarioMeetic candidato : candidatos) {
			// Se tiene que cumplir que
			if (Reglas.comprobarSiSonAfines(elQueBusca, candidato)) {
				afines.add(candidato);
			}
		}
		return afines;
	}

	public UsuarioMeetic buscarIdeal(long idUser) throws PortalException, SystemException {

		// Este usuario es el que esta buscando a sus afines
		UsuarioMeetic elQueBusca = getUsuarioMeetic(idUser);

		List<UsuarioMeetic> candidatos = getUsuarioMeetics(QueryUtil.ALL_POS, 
																QueryUtil.ALL_POS);
		for (UsuarioMeetic candidato : candidatos) {
			//Se tiene que cumplir que
			if(Reglas.comprobarSiSonIdeales(elQueBusca, candidato)){
				return candidato;
			}
		}
		
		return null;
	}

}
