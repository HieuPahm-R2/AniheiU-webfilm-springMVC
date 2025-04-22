package vn.hust.AniheiU.service.implement;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.AniheiU.domain.Season;
import vn.hust.AniheiU.domain.dtos.SeasonDTO;
import vn.hust.AniheiU.repository.SeasonRepository;
import vn.hust.AniheiU.service.InSeasonService;

@Service
public class SeasonService implements InSeasonService {
    @Autowired
    private SeasonRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<SeasonDTO> getAll() {
        return repository.findAll().stream().map(item -> modelMapper.map(item, SeasonDTO.class)).toList();
    }

    @Override
    public SeasonDTO getById(Long id) {
        return modelMapper.map(repository.findById(id).orElseThrow(
                () -> new NoSuchElementException("Not Found")), SeasonDTO.class);
    }

    @Override
    public void update(SeasonDTO dto) {
        repository.save(modelMapper.map(dto, Season.class));
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public SeasonDTO insertForSave(SeasonDTO dto) {
        return modelMapper.map(repository.save(modelMapper.map(dto, Season.class)), SeasonDTO.class);
    }
}
