package am.ACA.db.implementations;

import am.ACA.db.interfaces.DB;

import java.util.List;


public class TrackDb implements DB<TrackDb> {
    @Override
    public void fileWriter(String path, TrackDb trackDb) {

    }

    @Override
    public void removeFileArgument(String path, TrackDb trackDb) {

    }

    @Override
    public void editFileArgument(String path, TrackDb trackDb) {

    }

    @Override
    public List<TrackDb> fileReader(String path) {
        return null;
    }

    @Override
    public void clearingFile(String path) {

    }
}
