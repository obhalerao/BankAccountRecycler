package trap1.bhaleraoomkar.bankaccountrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BankAccountsAdapter extends RecyclerView.Adapter<BankAccountsAdapter.MyViewHolder> {

    private List<BankAccount> bankAccountsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView id, name, money;

        public MyViewHolder(View view) {
            super(view);
            id = (TextView) view.findViewById(R.id.id);
            name = (TextView) view.findViewById(R.id.name);
            money = (TextView) view.findViewById(R.id.money);
        }
    }


    public BankAccountsAdapter(List<BankAccount> bankAccountsList) {
        this.bankAccountsList = bankAccountsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bank_account_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BankAccount ba = bankAccountsList.get(position);
        holder.id.setText("ID: "+ba.getId());
        holder.name.setText(ba.getName());
        holder.money.setText("$"+ba.getMoney());
    }

    @Override
    public int getItemCount() {
        return bankAccountsList.size();
    }
}