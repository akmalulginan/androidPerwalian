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
public class DaftarMhsPerwalianFragment extends Fragment {


    static DosenActivity dosenActivity;

    public static DaftarMhsPerwalianFragment newInstance(DosenActivity activity) {
        DaftarMhsPerwalianFragment daftarMhsPerwalianFragment = new DaftarMhsPerwalianFragment();
        dosenActivity = activity;
        return daftarMhsPerwalianFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daftar_mhs_perwalian, container, false);
    }

}
