package cg;
import java.util.*;
import com.cg.bean.*;

public class Demo4 {
	
	public static void main(String args[])
	{
	Map<Integer,Account> acc=new TreeMap<Integer,Account>();
	Account ob1=new Account(101,956083,"Punit",250000.00);
	acc.put(ob1.getMobile(), ob1);
	
	Account ob2=new Account(108,956084,"Sumit",50000.00);
	acc.put(ob2.getMobile(), ob2);
	
	Account ob3=new Account(100,956085,"Ariz",550000.00);
	acc.put(ob3.getMobile(), ob3);
	
	Account ob4=new Account(104,956086,"Sid",20000.00);
	acc.put(ob4.getMobile(), ob4);
	
	System.out.println(acc);
	System.out.println(acc.keySet());
			System.out.println("==============================");
	Collection<Account> vc=acc.values();
	List<Account> acclist=new ArrayList<Account>(vc);
	
	Collections.sort(acclist);
	for(Account o:acclist)
	{
		System.out.println(o);
	}
	System.out.println("==========================sort by name");
	Comparator nc=new NameComparator();
	Collections.sort(acclist,nc);
	for(Account o:acclist)
	{
		System.out.println(o);
	}
	
	System.out.println("==========================sort by balance");
	Comparator bc=new BalanceComparator();
	Collections.sort(acclist,bc);
	for(Account o:acclist)
	{
		System.out.println(o);
	}
	
	/*Set<Account> aset=new TreeSet<Account>();
	aset.add(Account object);//compareTomethod
	aset.add(Account object);
	
	Set<Account> aset=new TreeSet<Account>();
	aset.add(Account object);//compare method of NameComparator
	aset.add(Account object);
	*/
	

}
}