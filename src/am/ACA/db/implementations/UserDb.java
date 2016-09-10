package am.ACA.db.implementations;

import am.ACA.db.interfaces.DB;

import java.util.List;


public class UserDb implements DB<UserDb> {

    @Override
    public void fileWriter(String path, UserDb userDb) {

    }

    @Override
    public void removeFileArgument(String path, UserDb userDb) {

    }

    @Override
    public void editFileArgument(String path, UserDb userDb) {

    }

    @Override
    public List<UserDb> fileReader(String path) {
        return null;
    }

    @Override
    public void clearingFile(String path) {

    }
}
