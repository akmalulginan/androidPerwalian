package id.jajaka.perwalian.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.jajaka.perwalian.R;
import id.jajaka.perwalian.activity.DosenActivity;


public class DetailMhsFragment extends Fragment {
    static DosenActivity dosenActivity;

    public static DetailMhsFragment newInstance(DosenActivity activity) {
        DetailMhsFragment detailMhsFragment = new DetailMhsFragment();
        dosenActivity = activity;
        return detailMhsFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_mhs, container, false);
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
