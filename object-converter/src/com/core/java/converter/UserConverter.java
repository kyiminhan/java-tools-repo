package com.core.java.converter;

import com.core.java.model.User;
import com.core.java.model.UserDto;

public interface UserConverter {
	User convertUserDTOToUser(final UserDto userDTO) throws Exception;
}