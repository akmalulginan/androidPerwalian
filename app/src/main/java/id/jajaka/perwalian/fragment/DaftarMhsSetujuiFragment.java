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
public class DaftarMhsSetujuiFragment extends Fragment {


    static DosenActivity dosenActivity;

    public static DaftarMhsSetujuiFragment newInstance(DosenActivity activity) {
        DaftarMhsSetujuiFragment daftarMhsSetujuiFragment = new DaftarMhsSetujuiFragment();
        dosenActivity = activity;
        return daftarMhsSetujuiFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daftar_mhs_setujui, container, false);
    }

}
