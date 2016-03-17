package com.example.plugins.service.base;

import com.example.plugins.service.LibroServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LibroServiceClpInvoker {
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;

    public LibroServiceClpInvoker() {
        _methodName18 = "getBeanIdentifier";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "setBeanIdentifier";

        _methodParameterTypes19 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return LibroServiceUtil.getBeanIdentifier();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            LibroServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
