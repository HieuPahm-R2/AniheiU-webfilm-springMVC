package vn.hust.AniheiU.service.implement;



import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import vn.hust.AniheiU.domain.Role;
import vn.hust.AniheiU.domain.dtos.RoleDTO;
import vn.hust.AniheiU.repository.RoleRepository;
import vn.hust.AniheiU.service.InRoleService;

public class RoleService implements InRoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ModelMapper modelMapper;
    public List<RoleDTO> getAll(){
        return roleRepository.findAll().stream().map(item -> modelMapper.map(item, RoleDTO.class)).toList();
    }
    @Override
    public RoleDTO getById(Long id) {
      return modelMapper.map(roleRepository.findById(id).orElseThrow(
        () -> new NoSuchElementException("Not Found any thing..")),RoleDTO.class);}

    @Override
    public void update(RoleDTO dto) {
       roleRepository.save(modelMapper.map(dto, Role.class));
    }
    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    @Override
    public RoleDTO insertForSave(RoleDTO dto) {
     return modelMapper.map(roleRepository.save(modelMapper.map(dto,Role.class)),RoleDTO.class);
    }
}
