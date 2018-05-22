package com.in.rumah.rumah_in.services;

import android.content.Context;
import android.support.annotation.NonNull;

import com.in.rumah.rumah_in.model.BannerResponse;
import com.in.rumah.rumah_in.model.HighlightResponse;
import com.in.rumah.rumah_in.model.HomeDataSource;
import com.in.rumah.rumah_in.model.remoteservice.HomeRetrofitService;

import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by irwancannady on 8/27/17.
 */

public class RemoteDataSource implements HomeDataSource{

    private Context mContext;
    private static RemoteDataSource sInstance = null;

    private HomeRetrofitService mBannerService;

    public static RemoteDataSource getInstance(@NonNull Context context){
        if (sInstance == null){
            sInstance = new RemoteDataSource(context.getApplicationContext());
        }
        return sInstance;
    }

    private RemoteDataSource(Context context){
        mContext = context;
//        mServiceApi = RetrofitHelper.getInstance(context).provideRetrofit().create(LoginService.class);
        mBannerService = RetrofitHelper.getInstance(context).provideRetrofit().create(HomeRetrofitService.class);
    }

    @Override
    public Observable<List<BannerResponse.DataBanner>> getBanner() {
        return mBannerService.getBanner().map(new Func1<BannerResponse, List<BannerResponse.DataBanner>>() {
            @Override
            public List<BannerResponse.DataBanner> call(BannerResponse bannerResponse) {
                return bannerResponse.getData();
            }
        });
    }

    @Override
    public Observable<List<HighlightResponse.DataHighlight>> getHighLight() {
        return mBannerService.getHighLight().map(new Func1<HighlightResponse, List<HighlightResponse.DataHighlight>>() {
            @Override
            public List<HighlightResponse.DataHighlight> call(HighlightResponse highlightResponse) {
                return highlightResponse.getData();
            }
        });
    }
}
