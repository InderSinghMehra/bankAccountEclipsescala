object Account {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(44); 
	val acct = new BankAccount;System.out.println("""acct  : BankAccount = """ + $show(acct ));$skip(17); 
	acct deposit 50;$skip(19); val res$0 = 
	acct withdrawn 20;System.out.println("""res0: Int = """ + $show(res$0));$skip(20); val res$1 = 
	acct withdrawn(15);System.out.println("""res1: Int = """ + $show(res$1))}
}
