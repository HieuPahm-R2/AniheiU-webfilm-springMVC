package vn.hust.AniheiU.service.implement;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.AniheiU.domain.Episode;
import vn.hust.AniheiU.domain.dtos.EpisodeDTO;
import vn.hust.AniheiU.repository.EpisodeRepository;
import vn.hust.AniheiU.service.InEpisodeService;

@Service
public class EpisodeService implements InEpisodeService {
    @Autowired
    private EpisodeRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<EpisodeDTO> getAll() {
        return repository.findAll().stream().map(item -> modelMapper.map(item, EpisodeDTO.class)).toList();
    }

    @Override
    public EpisodeDTO getById(Long id) {
        return modelMapper.map(repository.findById(id).orElseThrow(
                () -> new NoSuchElementException("Not Found")), EpisodeDTO.class);
    }

    @Override
    public void update(EpisodeDTO dto) {
        repository.save(modelMapper.map(dto, Episode.class));
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public EpisodeDTO insertForSave(EpisodeDTO dto) {
        return modelMapper.map(
                repository.save(modelMapper.map(dto, Episode.class)), EpisodeDTO.class);
    }
}
