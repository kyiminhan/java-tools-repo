package com.core.java;

import com.core.java.converter.UserConverter;
import com.core.java.converter.UserConverterImpl;
import com.core.java.converter.UserDtoConverter;
import com.core.java.converter.UserDtoConverterImpl;
import com.core.java.model.User;
import com.core.java.model.UserDto;

public class App {

	public static void main(final String[] args) {
		try {

			final UserConverter converter = new UserConverterImpl();
			final UserDto userDTO = new UserDto();
			userDTO.setFirstName("Kyi Min");
			userDTO.setLastName("Han");
			userDTO.setEmail("kyiminhan@gmail.com");
			userDTO.setPassword("p@$$w0rd");
			userDTO.setPhone("09-1234567890");
			userDTO.setAge(40);
			final User user = converter.convertUserDTOToUser(userDTO);
			System.out.println(user);

			final UserDtoConverter userDtoConverter = new UserDtoConverterImpl();
			user.setFirstName("USER-DTO");
			final UserDto dto = userDtoConverter.convertUserToUserDTO(user);
			System.out.println(dto);

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}