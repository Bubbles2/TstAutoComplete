package matcom.dcf.tstautocomplete;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter extends ArrayAdapter {

    String[] social = {"Facebook ", "Twitter", "Google", "Pintrest"};
    int[] images = {R.drawable.google,
            R.drawable.twitter,
            R.drawable.facebook,
            R.drawable.pintrest};
    private Context context;

    public MyAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
        this.context = context;
    }

    @Override
    public Filter getFilter() {

        return super.getFilter();
    }

    @Override
    public int getCount() {

        return social.length;
    }

    @Override
    public Object getItem(int position) {

        return social[position];
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=null;
        if (convertView == null) {
            LayoutInflater inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.customrow,parent,false);

        } else {
            row = convertView;

        }
        ImageView img =  (ImageView) row.findViewById(R.id.imageView2);
        TextView tv = (TextView) row.findViewById(R.id.textView3);
        //
        tv.setText(social[position]);
        img.setImageResource(images[position]);
        return row;
    }
}