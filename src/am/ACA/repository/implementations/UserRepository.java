package am.ACA.repository.implementations;

import am.ACA.model.Util.Exceptions.InvalidArgumentException;
import am.ACA.repository.interfaces.RepositoryInt;

import java.util.List;

public class UserRepository implements RepositoryInt<UserRepository> {

    @Override
    public void add(UserRepository userRepository) throws InvalidArgumentException {

    }

    @Override
    public UserRepository edit(UserRepository userRepository) throws InvalidArgumentException {
        return null;
    }

    @Override
    public void delete(UserRepository userRepository) throws InvalidArgumentException {

    }

    @Override
    public List<UserRepository> getList() throws InvalidArgumentException {
        return null;
    }

    @Override
    public Boolean existingObjectCheckup(UserRepository userRepository) throws InvalidArgumentException {
        return null;
    }
}