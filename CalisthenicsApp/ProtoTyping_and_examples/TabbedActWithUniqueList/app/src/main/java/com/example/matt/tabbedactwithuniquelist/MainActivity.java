package com.example.matt.tabbedactwithuniquelist;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */


    private SectionsPagerAdapter mSectionsPagerAdapter;



    static String[] chestArray = {"dips", "Straight bar Dips", "Push-Up", "Explosive Push Up"};
    static String[] coreArray = {"Sit-ups", "Toe touches", "Leg Raises", "Crunches", "Knee Raises"};
    static String[] shouldersArray = {"Shoulder Press", "Pike Push-up", "Elevated Pike Push-up", "Straight Arm Plank"};
    static String[] backArray = {"Pull-up", "Australian Pull-up", "Assisted Pull-up", "Good Mornings"};
    static String[] armsArray = {"Bicep curl", "bar curl", "Chin-up",};
    static String[] legsArray = {"squats", "Lunges", "split-squats"};
    static String[] stretchingArray = {"Downward Dog", "Toe Touching"};

    static String[] ThisExerciseArray = chestArray;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                switch (position) {
                    case 0:
                        loadList(1);
                        break;
                    case 1:
                        loadList(2);
                        break;
                    case 2:
                        loadList(3);
                        break;
                    case 3:
                        loadList(4);
                        break;
                    case 4:
                        loadList(5);
                        break;
                    case 5:
                        loadList(6);
                        break;
                    case 6:
                        loadList(7);
                        break;
                }

                Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.tabs);
                if (currentFragment instanceof PlaceholderFragment) {
                    FragmentTransaction fragTransaction =   (getSupportFragmentManager().beginTransaction());
                    fragTransaction.detach(currentFragment);
                    fragTransaction.attach(currentFragment);
                    fragTransaction.commit();}
            }

            });
        }



    }


    public void loadList(int pos)
    {
        switch (pos) {
            case 1:
                ThisExerciseArray = chestArray;
                break;
            case 2:
                ThisExerciseArray = armsArray;
                break;
            case 3:
                ThisExerciseArray = coreArray;
                break;
            case 4:
                ThisExerciseArray = legsArray;
                break;
            case 5:
                ThisExerciseArray = shouldersArray;
                break;
            case 6:
                ThisExerciseArray = backArray;
                break;
            case 7:
                ThisExerciseArray = stretchingArray;
                break;
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    static public class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            /**
             * THIS PART BELOW WILL REQUIRE SOME EDITING TOMORROW TO MAKE THE LIST USED CHANGE DEPENDANT ON THE CURRENT FRAGMENT THAT IS LOADED*
             */


            ListAdapter myListAdapter = new CustomAdapter(this.getContext(), ThisExerciseArray);

            ListView newListView = (ListView) rootView.findViewById(R.id.myListView);

            newListView.setAdapter(myListAdapter);

            Button myButton = (Button) rootView.findViewById(R.id.myButton);


            return rootView;
        }

    }




    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 7 total pages.
            return 7;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Chest";
                case 1:
                    return "Arms";
                case 2:
                    return "Core";
                case 3:
                    return "Legs";
                case 4:
                    return "Shoulders";
                case 5:
                    return "Back";
                case 6:
                    return "Stretching";

            }
            return "Chest";
        }
    }
}
