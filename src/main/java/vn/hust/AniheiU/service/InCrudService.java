package vn.hust.AniheiU.service;

import java.util.List;

public interface InCrudService <T, K> {
    public List<T> getAll();
    public T getById(K id);
    public void update(T dto);
    public void delete(K id);
    public T insertForSave(T dto);
}
