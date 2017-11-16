package com.ptp.phamtanphat.youtubeplaylist1409.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ptp.phamtanphat.youtubeplaylist1409.Model.Item;
import com.ptp.phamtanphat.youtubeplaylist1409.Model.YoutubeAPI;
import com.ptp.phamtanphat.youtubeplaylist1409.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by KhoaPhamPC on 16/11/2017.
 */

public class YoutubeAPIAdapter extends ArrayAdapter<Item> {
    public YoutubeAPIAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
    }
    class ViewHolder{
        ImageView img;
        TextView txttitle,txtdescription;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.dong_youtube,null);
            viewHolder = new ViewHolder();
            viewHolder.img = convertView.findViewById(R.id.imageview);
            viewHolder.txtdescription = convertView.findViewById(R.id.textviewmota);
            viewHolder.txttitle = convertView.findViewById(R.id.textviewtitle);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Item item = getItem(position);
        viewHolder.txttitle.setText(item.getSnippet().getTitle());
        viewHolder.txtdescription.setText(item.getSnippet().getDescription());
        Picasso.with(getContext()).load(item.getSnippet().getThumbnails().getDefault().getUrl()).into(viewHolder.img);
        return convertView;
    }
}
