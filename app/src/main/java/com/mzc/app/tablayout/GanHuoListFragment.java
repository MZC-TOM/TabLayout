package com.mzc.app.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mzc on 2016/5/26.
 */
public class GanHuoListFragment extends BaseFragment {
    String type;
    TextView tv_name;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type = (String) getArguments().get("type");
        Toast.makeText(getActivity(),"位置:"+type,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void setUpView() {
        super.setUpView();
        tv_name = $(R.id.tv_name);
        tv_name.setText(type);
    }

    @Override
    protected int setLayoutResourceID() {
        return R.layout.item_rv_ganhuo;
    }
}
