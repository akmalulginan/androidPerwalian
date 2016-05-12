package id.jajaka.perwalian.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.jajaka.perwalian.R;
import id.jajaka.perwalian.activity.DosenActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class DaftarMhsBlmSetujuiFragment extends Fragment {


    static DosenActivity dosenActivity;

    public static DaftarMhsBlmSetujuiFragment newInstance(DosenActivity activity) {
        DaftarMhsBlmSetujuiFragment daftarMhsBlmSetujuiFragment = new DaftarMhsBlmSetujuiFragment();
        dosenActivity = activity;
        return daftarMhsBlmSetujuiFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daftar_mhs_blm_setujui, container, false);
    }

}
