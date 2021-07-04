//package com.example.finalspace;
//
//import android.content.Context;
//import android.widget.ArrayAdapter;
//
//public class FindArrayAdapter extends ArrayAdapter {
//    private Context mContext;
//    private String[] mSeasons;
//    private String[] mEpisodes;
//
//    public FindArrayAdapter(Context mContext, int resources, String[] mSeasons, String[] mEpisodes){
//        super(mContext, resources);
//        this.mContext = mContext;
//        this.mSeasons = mSeasons;
//        this.mEpisodes = mEpisodes;
//    }
//
//    @Override
//    public Object getItem(int position){
//        String seasons = mSeasons[position];
//        String episodes = mEpisodes[position];
//        return String.format("%s \nServes great : %s", seasons, episodes);
//    }
//    @Override
//    public int getCount(){
//        return mSeasons.length;
//    }
//
//}
