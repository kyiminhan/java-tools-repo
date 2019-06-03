package com.core.java.converter;

import java.util.HashMap;
import java.util.Map;

import com.core.java.model.User;
import com.core.java.model.UserDto;

public class UserDtoConverterImpl extends AbstractConverter implements UserDtoConverter {

	@Override
	public UserDto convertUserToUserDTO(final User user) throws Exception {
		final Map<String, String> map = new HashMap<>();
		map.put("firstName", "firstName");
		map.put("lastName", "lastName");
		map.put("email", "email");
		map.put("password", "password");
		map.put("phone", "phone");
		map.put("age", "age");
		return (UserDto) this.convert(user, UserDto.class, map);
	}

}