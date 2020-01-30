object account {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(29); 
  var acct = new BankAccount;System.out.println("""acct  : BankAccount = """ + $show(acct ));$skip(17); val res$0 = 
  acct deposit 0;System.out.println("""res0: Int = """ + $show(res$0));$skip(20); val res$1 = 
  acct deposit(550);System.out.println("""res1: Int = """ + $show(res$1));$skip(19); val res$2 = 
  acct deposit 500;System.out.println("""res2: Int = """ + $show(res$2));$skip(20); val res$3 = 
  acct withdraw 400;System.out.println("""res3: Int = """ + $show(res$3))}
  
  
  
  
	}
