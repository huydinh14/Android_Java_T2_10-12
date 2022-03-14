package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<SanPham> sanPhamList;
    private int positionSelect = -1;

    public CustomAdapter(Context context, int idLayout, List<SanPham> sanPhamList) {
        this.context = context;
        this.idLayout = idLayout;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        if (sanPhamList.size() != 0 && !sanPhamList.isEmpty()) {
            return sanPhamList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_custom_list_view4, null);
        }

        TextView txtTenSp = view.findViewById(R.id.tvTenSP);
        TextView txtTenShop = view.findViewById(R.id.tvTenShop);
        ImageView ivAnhSP = view.findViewById(R.id.imgAnhSp);

        SanPham sp = sanPhamList.get(i);

        //ivAnhSP.setImageResource(R.drawable.canaulau);
        txtTenSp.setText(sp.getTenSP().toString());
        txtTenShop.setText(sp.getTenShop().toString());
        int idSanpham = sp.getId();

            switch (idSanpham) {
                case 1:
                    ivAnhSP.setImageResource(R.drawable.canaulau);
                    break;
                case 2:
                    ivAnhSP.setImageResource(R.drawable.gabotoi);
                    break;
                case 3:
                    ivAnhSP.setImageResource(R.drawable.xecancau);
                    break;
                case 4:
                    ivAnhSP.setImageResource(R.drawable.dochoimophong);
                    break;
                case 5:
                    ivAnhSP.setImageResource(R.drawable.sach);
                    break;
                case 6:
                    ivAnhSP.setImageResource(R.drawable.sachday);
                    break;
                case 7:
                    ivAnhSP.setImageResource(R.drawable.trump);
                    break;
                default:
                    break;
            }
        return view;
    }
}
//        final LinearLayout linearLayout = view.findViewById(R.id.idCustomListView);
//        final SanPham sanPham = sanPhamList.get(positionSelect);
//
//        if (sanPhamList != null && !sanPhamList.isEmpty()) {
//            txtTenSp.setText(sanPham.getTenSP());
//            txtTenShop.setText(sanPham.getTenShop());
//            ImageView imageView = view.findViewById(R.id.imgAnhSp);
//            int idSanpham = sanPham.getId();
//
//            switch (idSanpham) {
//                case 1:
//                    imageView.setImageResource(R.drawable.canaulau);
//                    break;
//                case 2:
//                    imageView.setImageResource(R.drawable.gabotoi);
//                    break;
//                case 3:
//                    imageView.setImageResource(R.drawable.xecancau);
//                    break;
//                case 4:
//                    imageView.setImageResource(R.drawable.dochoimophong);
//                    break;
//                case 5:
//                    imageView.setImageResource(R.drawable.sach);
//                    break;
//                case 6:
//                    imageView.setImageResource(R.drawable.sachday);
//                    break;
//                case 7:
//                    imageView.setImageResource(R.drawable.trump);
//                    break;
//                default:
//                    break;
//            }
//        }
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, sanPham.getTenSP(), Toast.LENGTH_LONG).show();
//                // positionSelect = position;
//                notifyDataSetChanged();
//            }
//        });
//                return view;
//    }
//}
