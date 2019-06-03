package com.core.java.converter;

import com.core.java.model.User;
import com.core.java.model.UserDto;

public interface UserDtoConverter {
	UserDto convertUserToUserDTO(final User user) throws Exception;
}