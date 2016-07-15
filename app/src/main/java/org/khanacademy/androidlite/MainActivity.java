package org.khanacademy.androidlite;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assemble the data.
        final Bundle arguments = new Bundle();
        arguments.putString(NodesFragment.Keys.PARENT_SLUG, null);

        // Build the fragment.
        final NodesFragment fragment = new NodesFragment();
        fragment.setArguments(arguments);

        // Add it to the activity.
        final FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.activity_main, fragment);
        fragmentTransaction.commit();
    }
}