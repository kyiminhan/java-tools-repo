package com.core.java.converter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AbstractConverter {

	private String loadGetMethodName(final String str) {
		final String GET = "get";
		final String name = new StringBuilder(str.substring(0, 1).toUpperCase()).append(str.substring(1)).toString();
		final String methodName = new StringBuilder(GET).append(name).toString();
		return methodName;
	}

	protected Object convert(final Object obj1, final Class<?> clazz, final Map<String, String> map) throws Exception {

		final Object object = clazz.newInstance();

		for (final Entry<String, String> entry : map.entrySet()) {
			final String getMethodName = this.loadGetMethodName(entry.getKey());
			final Method getMethod = obj1.getClass().getMethod(getMethodName);
			final Object getValue = getMethod.invoke(obj1);

			final Field setField = object.getClass().getDeclaredField(entry.getValue());
			setField.setAccessible(true);
			setField.set(object, getValue);

			// System.out.printf("%-50s%s%n", getMethodName, getValue);
		}
		return object;
	}
}