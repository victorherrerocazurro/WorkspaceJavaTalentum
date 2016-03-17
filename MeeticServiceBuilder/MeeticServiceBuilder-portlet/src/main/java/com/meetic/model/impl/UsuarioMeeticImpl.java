package com.meetic.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The extended model implementation for the UsuarioMeetic service. Represents a row in the &quot;MeeticServiceBuilder_UsuarioMeetic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.meetic.model.UsuarioMeetic} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class UsuarioMeeticImpl extends UsuarioMeeticBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a usuario meetic model instance should use the {@link com.meetic.model.UsuarioMeetic} interface instead.
     */
    public UsuarioMeeticImpl() {
    }
    
    public User getUserPortal() throws PortalException, SystemException{
    	return UserLocalServiceUtil.getUser(getUserId());
    }
}
