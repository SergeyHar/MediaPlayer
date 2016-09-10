package am.ACA.repository.interfaces;

import am.ACA.model.Util.Exceptions.InvalidArgumentException;

import java.util.List;

public interface RepositoryInt <T> {

    void add(T t) throws InvalidArgumentException;

    T edit(T t) throws InvalidArgumentException;

    void delete(T t) throws InvalidArgumentException;

    List<T> getList() throws InvalidArgumentException;

    //stuguma trvac Objecti arkayutyun@
    Boolean existingObjectCheckup(T t) throws InvalidArgumentException;


}
