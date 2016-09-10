package am.ACA.repository.implementations;

import am.ACA.model.Util.Exceptions.InvalidArgumentException;
import am.ACA.repository.interfaces.RepositoryInt;

import java.util.List;


public class MusicRepository implements RepositoryInt<MusicRepository> {

    @Override
    public void add(MusicRepository musicRepository) throws InvalidArgumentException {

    }

    @Override
    public MusicRepository edit(MusicRepository musicRepository) throws InvalidArgumentException {
        return null;
    }

    @Override
    public void delete(MusicRepository musicRepository) throws InvalidArgumentException {

    }

    @Override
    public List<MusicRepository> getList() throws InvalidArgumentException {
        return null;
    }

    @Override
    public Boolean existingObjectCheckup(MusicRepository musicRepository) throws InvalidArgumentException {
        return null;
    }
}