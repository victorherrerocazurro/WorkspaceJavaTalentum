package com.meetic.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the UsuarioMeetic service. Represents a row in the &quot;MeeticServiceBuilder_UsuarioMeetic&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioMeeticModel
 * @see com.meetic.model.impl.UsuarioMeeticImpl
 * @see com.meetic.model.impl.UsuarioMeeticModelImpl
 * @generated
 */
public interface UsuarioMeetic extends UsuarioMeeticModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.meetic.model.impl.UsuarioMeeticImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.User getUserPortal()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
