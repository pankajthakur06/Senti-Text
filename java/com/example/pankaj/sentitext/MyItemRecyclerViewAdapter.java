package com.example.pankaj.sentitext;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pankaj.sentitext.dummy.DummyContent;
import com.example.pankaj.sentitext.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified
 * TODO: Replace the implementation with code for your data type.
 */
/*public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<DummyItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyItemRecyclerViewAdapter(List<DummyItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).content);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public DummyItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
*/


public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {



    private final List<String> title;

    private final List<String> subTitle;

    private final Context context;



    public MyItemRecyclerViewAdapter(List<String> title, List<String> subTitle, Context context) {

        this.title = title;

        this.subTitle = subTitle;

        this.context = context;

    }





    /*Layout inflation*/

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext())

                .inflate(R.layout.fragment_item, parent, false);

        return new ViewHolder(layout);

    }



    /*Bind to widgets*/

    @Override

    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.mIdView.setText(title.get(position));

        holder.mContentView.setText(subTitle.get(position));



        holder.mView.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Toast.makeText(context, "Test", Toast.LENGTH_SHORT).show();

            }

        });

    }



    /*Looping items*/

    @Override

    public int getItemCount() {

        return title.size();

    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        public final TextView mIdView;

        public final TextView mContentView;



        public ViewHolder(View layout) {

            super(layout);

            mView = layout;

            mIdView = (TextView) layout.findViewById(R.id.id);

            mContentView = (TextView) layout.findViewById(R.id.content);

/*view.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View v) {

Toast.makeText(context, "Test", Toast.LENGTH_SHORT).show();

}

});*/

        }



    }

}

