package trap1.bhaleraoomkar.bankaccountrecycler;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestFragment extends Fragment {

    private List<BankAccount> bankAccountList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BankAccountsAdapter baAdapter;
    private View mRootView;


    public TestFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_test, container, false);

        Toolbar toolbar = mRootView.findViewById(R.id.toolbar);

        recyclerView = mRootView.findViewById(R.id.recyclerView);

        baAdapter = new BankAccountsAdapter(bankAccountList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mRootView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(baAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(mRootView.getContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                BankAccount ba = bankAccountList.get(position);
                Toast.makeText(mRootView.getContext(), "Bank account holder " + ba.getId() + ", whose name is " + ba.getName() + ", and has a balance of $" + ba.getMoney() +", is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareBankAccountData();
        return mRootView;
    }

    private void prepareBankAccountData() {
        BankAccount bankAccount = new BankAccount(0, "Jeff Jeff", 3526476);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(1, "Davis Carter", 37);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(2, "Daniel Daniel", 574468645);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(3, "Kal Lewis", 2463);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(4, "Juno Jefferis", 23456);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(5, "Julius Li", 589764);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(6, "Ria Maddur", 47468484);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(7, "Sid Smith", 96689);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(8, "Patrick Jones", 109485);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(9, "Yolanda Matthews", 6);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(10, "Sara Summer", 357357357);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(11, "Annie Lee", 858);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(12, "Ophelia Bethany", 214527468);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(13, "Allen Singh", 89785);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(14, "Wendy Wen", 784553333);
        bankAccountList.add(bankAccount);

        bankAccount = new BankAccount(15, "Jeff Lau", 8);
        bankAccountList.add(bankAccount);

        baAdapter.notifyDataSetChanged();
    }
}
