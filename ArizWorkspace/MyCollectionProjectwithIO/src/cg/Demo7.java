package cg;
import java.util.*;
import com.cg.bean.*;
import java.io.*;
import com.cg.service.*;
public class Demo7 {
	
	public static void main(String args[]) throws IOException
	{
	Map<Long,Account> acc=new TreeMap<Long,Account>();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String choice="";
	while(true)
	{
	System.out.println("Menu");
	System.out.println("=====");
	System.out.println("1 Create new Account");
	System.out.println("2 Print all accounts");
	System.out.println("3 Exit");
	System.out.println("Enter your choice");
	choice=br.readLine();
	switch(choice)
	{
	case "1":	int id=0;
				long mb=0L;
				String ah="";
				double bal=0.0;
				//Accepting and validating input for account number
				System.out.println("Enter account number");
				while(true)
				{
					String s_id=br.readLine();
					boolean ch1=Validator.validatedata(s_id,Validator.aidpattern);
					if(ch1==true)
					{
						try {
							id=Integer.parseInt(s_id);
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Account Number must be numeric.Re Enter");
						}
					}
					else
					{
						System.out.println("Re Enter Account Number in 3 digits");
					}
				}//End of Account number while
				
				//Accepting and validating input for mobile number
				
				System.out.println("Enter mobile number");
				while(true)
				{
					String s_mb=br.readLine();
					boolean ch1=Validator.validatedata(s_mb,Validator.mobilepattern);
					if(ch1==true)
					{
						try {
							mb=Long.parseLong(s_mb);
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Mobile Number must be numeric.Re Enter");
						}
					}
					else
					{
						System.out.println("Re Enter Mobile Number in 10 digits");
					}
				}//End of Mobile number while
				
				//Accepting and validating input for account holder name
				System.out.println("Enter account holder name");
				while(true)
				{
					String s_ah=br.readLine();
					boolean ch1=Validator.validatedata(s_ah,Validator.ahpattern);
					if(ch1==true)
					{
						try {
							ah=s_ah;
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Name must be alphabet.Re Enter");
						}
					}
					else
					{
						System.out.println("Re Enter name in alphabets");
					}
				}//End of account holder while
				//Accepting and validating input for account balance
				System.out.println("Enter balance");
				while(true)
				{
					String s_bal=br.readLine();
					boolean ch1=Validator.validatedata(s_bal,Validator.balpattern);
					if(ch1==true)
					{
						try {
							bal=Double.parseDouble(s_bal);
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Balance must be numeric.Re Enter");
						}
					}
					else
					{
						System.out.println("Re Enter balance in numeric");
					}
				}//End of account balance while
				
				Account ob=new Account(id,mb,ah,bal);
				acc.put(ob.getMobile(),ob);

				break;
	case "2":	
				Collection<Account> vc=acc.values();
				List<Account> acclist=new ArrayList(vc);
				Collections.sort(acclist);
				for(Account o:acclist)
				{
					System.out.println(o);
					//serviceprintstatement
				}
				break;
	case "3":
				System.out.println("Exiting Program");
				System.exit(0);
	default:	System.out.println("Invalid Choice");
	}
	}//end of menu



	
	
	
	
	
	
	
	
	/*System.out.println(acc);
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