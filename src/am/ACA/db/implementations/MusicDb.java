package am.ACA.db.implementations;

import am.ACA.db.interfaces.DB;

import java.util.List;

public class MusicDb implements DB<MusicDb> {
    @Override
    public void fileWriter(String path, MusicDb musicDb) {

    }

    @Override
    public void removeFileArgument(String path, MusicDb musicDb) {

    }

    @Override
    public void editFileArgument(String path, MusicDb musicDb) {

    }

    @Override
    public List<MusicDb> fileReader(String path) {
        return null;
    }

    @Override
    public void clearingFile(String path) {

    }
}
