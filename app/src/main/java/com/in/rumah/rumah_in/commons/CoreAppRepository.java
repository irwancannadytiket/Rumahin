package com.in.rumah.rumah_in.commons;

import android.support.annotation.NonNull;

import com.in.rumah.rumah_in.model.BannerResponse;
import com.in.rumah.rumah_in.model.HighlightResponse;
import com.in.rumah.rumah_in.model.HomeDataSource;
import com.in.rumah.rumah_in.services.RemoteDataSource;

import java.util.List;

import rx.Observable;

/**
 * Created by irwancannady on 8/27/17.
 */

public class CoreAppRepository implements HomeDataSource{

    private static CoreAppRepository sInstance = null;

    private final RemoteDataSource mRemoteDataSource;

    public CoreAppRepository(@NonNull RemoteDataSource mRemoteDataSource) {
        this.mRemoteDataSource = mRemoteDataSource;
    }

    public static CoreAppRepository getInstance(@NonNull RemoteDataSource remoteDataSource){
        if (sInstance == null){
            sInstance = new CoreAppRepository(remoteDataSource);
        }
        return sInstance;
    }

    @Override
    public Observable<List<BannerResponse.DataBanner>> getBanner() {
        return mRemoteDataSource.getBanner();
    }

    @Override
    public Observable<List<HighlightResponse.DataHighlight>> getHighLight() {
        return mRemoteDataSource.getHighLight();
    }
}
