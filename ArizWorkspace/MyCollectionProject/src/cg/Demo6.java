package cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.cg.bean.Account;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Account> acc=new TreeMap<Integer,Account>();
		Account ob1=new Account(101,956083,"Punit",250000.00);
		acc.put(ob1.getMobile(), ob1);
		
		Account ob2=new Account(108,956084,"Bumit",50000.00);
		acc.put(ob2.getMobile(), ob2);
		
		Account ob3=new Account(100,956085,"Ariz",550000.00);
		acc.put(ob3.getMobile(), ob3);
		
		Account ob4=new Account(104,956086,"Sid",20000.00);
		acc.put(ob4.getMobile(), ob4);
		
		Set<Account> aset=new TreeSet<Account>(acc.values());
		Account ob5=new Account(109,94545,"zinga",30000.00);
		Account ob6=new Account(110,94445,"Simba",35500.00);

		aset.add(ob5);//compareTomethod
		aset.add(ob6);
		System.out.println(aset);
		List<Account> l=new ArrayList<Account>(aset);
		Collections.sort(l,new NameComparator());
		for(Account o:l)
		{
			System.out.println(o);
		}
	}

}
