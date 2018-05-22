package com.in.rumah.rumah_in.model.remoteservice;

import com.in.rumah.rumah_in.model.BannerResponse;
import com.in.rumah.rumah_in.model.HighlightResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface HomeRetrofitService {

    @GET("api/get/banner")
    Observable<BannerResponse> getBanner();

    @GET("api/get/house")
    Observable<HighlightResponse> getHighLight();
}
