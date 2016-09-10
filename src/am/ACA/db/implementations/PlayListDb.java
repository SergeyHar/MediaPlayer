package am.ACA.db.implementations;

import am.ACA.db.interfaces.DB;

import java.util.List;

public class PlayListDb implements DB<PlayListDb> {
    @Override
    public void fileWriter(String path, PlayListDb playListDb) {

    }

    @Override
    public void removeFileArgument(String path, PlayListDb playListDb) {

    }

    @Override
    public void editFileArgument(String path, PlayListDb playListDb) {

    }

    @Override
    public List<PlayListDb> fileReader(String path) {
        return null;
    }

    @Override
    public void clearingFile(String path) {

    }
}
