package id.jajaka.perwalian.fragment;

import android.net.Uri;
import android.support.v4.app.Fragment;

import id.jajaka.perwalian.activity.DosenActivity;


public class RiwayatNilaiFragment extends Fragment {
    static DosenActivity dosenActivity;

    public static RiwayatNilaiFragment newInstance(DosenActivity activity) {
        RiwayatNilaiFragment riwayatNilaiFragment = new RiwayatNilaiFragment();
        dosenActivity = activity;
        return riwayatNilaiFragment;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
