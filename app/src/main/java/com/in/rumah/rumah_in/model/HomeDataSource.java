package com.in.rumah.rumah_in.model;


import java.util.List;

import rx.Observable;

public interface HomeDataSource {

   Observable<List<BannerResponse.DataBanner>> getBanner();
   Observable<List<HighlightResponse.DataHighlight>> getHighLight();
}
