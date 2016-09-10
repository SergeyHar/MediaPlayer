package am.ACA.repository.implementations;

import am.ACA.model.Util.Exceptions.InvalidArgumentException;
import am.ACA.repository.interfaces.RepositoryInt;

import java.util.List;

public class PlayListRepository implements RepositoryInt<PlayListRepository> {
    @Override
    public void add(PlayListRepository playListRepository) throws InvalidArgumentException {

    }

    @Override
    public PlayListRepository edit(PlayListRepository playListRepository) throws InvalidArgumentException {
        return null;
    }

    @Override
    public void delete(PlayListRepository playListRepository) throws InvalidArgumentException {

    }

    @Override
    public List<PlayListRepository> getList() throws InvalidArgumentException {
        return null;
    }

    @Override
    public Boolean existingObjectCheckup(PlayListRepository playListRepository) throws InvalidArgumentException {
        return null;
    }
}