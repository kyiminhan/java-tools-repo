package com.core.java.converter;

import java.util.HashMap;
import java.util.Map;

import com.core.java.model.User;
import com.core.java.model.UserDto;

public class UserConverterImpl extends AbstractConverter implements UserConverter {

	@Override
	public User convertUserDTOToUser(final UserDto userDTO) throws Exception {
		final Map<String, String> map = new HashMap<>();
		map.put("firstName", "firstName");
		map.put("lastName", "lastName");
		map.put("email", "email");
		map.put("password", "password");
		map.put("phone", "phone");
		map.put("age", "age");
		return (User) this.convert(userDTO, User.class, map);
	}

}
