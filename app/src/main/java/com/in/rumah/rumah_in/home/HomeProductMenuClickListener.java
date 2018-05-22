package com.in.rumah.rumah_in.home;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.in.rumah.rumah_in.fivesteps.FiveStepsActivity;
import com.in.rumah.rumah_in.form.FormActivity;
import com.in.rumah.rumah_in.infokpr.InfoKprActivity;
import com.in.rumah.rumah_in.model.ProductMenu;
import com.in.rumah.rumah_in.search.SearchHomeActivity;

import java.util.List;

class HomeProductMenuClickListener implements View.OnClickListener {

    private List<ProductMenu> mProductMenus;
    private Activity mActivity;

    HomeProductMenuClickListener(Activity activity, List<ProductMenu> productMenus) {
        mProductMenus = productMenus;
        mActivity = activity;
    }

    @Override
    public void onClick(View v) {
        int selectedPosition = ((RecyclerView.ViewHolder) v.getTag()).getAdapterPosition();
        ProductMenu productMenu = mProductMenus.get(selectedPosition);
        switch (productMenu.getType()) {
            case ProductMenu.CARI_RUMAH:
                SearchHomeActivity.Companion.startToForm(mActivity);
                //Routing.Companion.navigateToFlightSearchRefund(mActivity);
                break;
            case ProductMenu.INFO_KPR:
                InfoKprActivity.Companion.startToForm(mActivity);
                break;
            case ProductMenu.FIVE_STEP:
                FiveStepsActivity.Companion.startToForm(mActivity);
                break;
            case ProductMenu.ISI_FORM:
                FormActivity.Companion.startToForm(mActivity);
                break;
        }
    }
}
