package am.ACA.repository.implementations;

import am.ACA.model.Util.Exceptions.InvalidArgumentException;
import am.ACA.repository.interfaces.RepositoryInt;

import java.util.List;


public class AlbumRepository implements RepositoryInt<AlbumRepository> {

    @Override
    public void add(AlbumRepository albumRepository) throws InvalidArgumentException {

    }

    @Override
    public AlbumRepository edit(AlbumRepository albumRepository) throws InvalidArgumentException {
        return null;
    }

    @Override
    public void delete(AlbumRepository albumRepository) throws InvalidArgumentException {

    }

    @Override
    public List<AlbumRepository> getList() throws InvalidArgumentException {
        return null;
    }

    @Override
    public Boolean existingObjectCheckup(AlbumRepository albumRepository) throws InvalidArgumentException {
        return null;
    }
}