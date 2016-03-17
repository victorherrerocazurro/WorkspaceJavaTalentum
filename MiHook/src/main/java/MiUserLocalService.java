import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserLocalServiceWrapper;

public class MiUserLocalService extends UserLocalServiceWrapper {

	public MiUserLocalService(UserLocalService userLocalService) {
		super(userLocalService);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<User> getUsers(int start, int end) throws SystemException {
		
		if(end - start > 10 ){
			throw new SystemException();
		} else {
			return super.getUsers(start, end);
		}
	}
}
