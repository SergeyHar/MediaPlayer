package am.ACA.db.implementations;

import am.ACA.db.interfaces.DB;

import java.util.List;


public class AlbumDb implements  DB<AlbumDb>{


    @Override
    public void fileWriter(String path, AlbumDb albumDb) {

    }

    @Override
    public void removeFileArgument(String path, AlbumDb albumDb) {

    }

    @Override
    public void editFileArgument(String path, AlbumDb albumDb) {

    }

    @Override
    public List<AlbumDb> fileReader(String path) {
        return null;
    }

    @Override
    public void clearingFile(String path) {

    }
}
