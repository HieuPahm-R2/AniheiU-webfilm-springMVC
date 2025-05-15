package vn.hust.AniheiU.service.implement;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.AniheiU.domain.User;
import vn.hust.AniheiU.domain.dtos.UserDTO;
import vn.hust.AniheiU.repository.UserRepository;
import vn.hust.AniheiU.service.InUserService;

@Service
public class UserService implements InUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<UserDTO> getAll() {
        return userRepository.findAll().stream().map(item -> modelMapper.map(item, UserDTO.class)).toList();
    }
    @Override
    public UserDTO getById(Long id) {
        return modelMapper.map(userRepository.findById(id).orElseThrow(
                () -> new NoSuchElementException("Not Found any thing..")), UserDTO.class);
    }
    @Override
    public void update(UserDTO dto) {
        // TODO Auto-generated method stub
        userRepository.save(modelMapper.map(dto, User.class));
    }
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public UserDTO insertForSave(UserDTO dto) {
        return modelMapper.map(userRepository.save(modelMapper.map(dto, User.class)), UserDTO.class);
    }
   
    
}
