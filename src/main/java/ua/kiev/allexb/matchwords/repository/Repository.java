package ua.kiev.allexb.matchwords.repository;

import ua.kiev.allexb.matchwords.entity.models.Model;

import java.util.List;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
public interface Repository<T extends Model> {

    public List<T> getAll();

    public  T getById(Long id);

    public void add( T model);

    public void update(T model);

    public void remove(T model);
}
