package ru.dzolotarev.springbootapi.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.dzolotarev.springbootapi.dto.UserDTO;
import ru.dzolotarev.springbootapi.entity.UserEntity;
import ru.dzolotarev.springbootapi.mapper.UserMapper;
import ru.dzolotarev.springbootapi.repository.UserRepository;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private static UserDTO userDTO;
    private static UserEntity userEntity;

    @Mock
    private UserMapper userMapper;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void init() {
        userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("Terminator");
        userEntity.setAge(150);

        userDTO = new UserDTO();
        userDTO.setName("Terminator");
        userDTO.setAge(150);
    }

    @Test
    void getAll_thenUsersExist_ReturnUsers() {
        List<UserDTO> expected = List.of(userDTO);
        when(userRepository.findAll()).thenReturn(List.of(userEntity));
        when(userMapper.toUserDTOs(List.of(userEntity))).thenReturn(List.of(userDTO));

        List<UserDTO> actual = userService.getAll();

        Assertions.assertIterableEquals(expected, actual);
    }
}