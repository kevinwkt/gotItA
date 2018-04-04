package mx.itesm.wkt.gotita;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.

 */
public class WallFrag extends Fragment {
    private RecyclerView rvPosts;

    public WallFrag() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_personal, container, false);
        rvPosts = v.findViewById(R.id.rvPosts);
        String[] arrT = {"Se vente", "La Mega"};
        String[] arrD = {"Carro", "Concha"};
        AdapterRv adapterRv = new AdapterRv(arrT, arrD);
        rvPosts.setAdapter(adapterRv);
        rvPosts.setLayoutManager(new LinearLayoutManager(getContext()));
        Toast.makeText(getActivity(), "Muro", Toast.LENGTH_SHORT).show();

        return v;
    }
}