package am.ACA.repository.interfaces;

import am.ACA.model.bean.Music;


public interface TrackRepositoryInt {
    Music play(int musicId);
    Music pause(int musicId);
    void stop (int musicId);

}
