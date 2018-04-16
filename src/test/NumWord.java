package test;


public class NumWord {
	
	String string;
	String a[]={"",
	"One",
	"Two",
	"Three",
	"Four",
	"Five",
	"Six",
	"Seven",
	"Eight",
	"Nine",
	};

	String b[]={
	"Hundred",
	"Thousand",
	"Lakh",
	"Crore",
	"Crore2",

	};

	String c[]={"Ten",
	"Eleven",
	"Twelve",
	"Thirteen",
	"Fourteen",
	"Fifteen",
	"Sixteen",
	"Seventeen",
	"Eighteen",
	"Nineteen",
	};

	String d[]={

	"Twenty",
	"Thirty",
	"Fourty",
	"Fifty",
	"Sixty",
	"Seventy",
	"Eighty",
	"Ninety"
	};



	public String convertNumToWord(long number){

	int c=1;
	long rm ;
	string="";
	while ( number != 0 )
	{
	switch ( c )
	{
	case 1 :
	rm = number % 100 ;
	pass ( rm ) ;
	if( number > 100 && number % 100 != 0 )
	{
	display ( "and " ) ;
	}
	number /= 100 ;

	break ;

	case 2 :
	rm = number % 10 ;
	if ( rm != 0 )
	{
	display ( " " ) ;
	display ( b[0] ) ;
	display ( " " ) ;
	pass ( rm ) ;
	}
	number /= 10 ;
	break ;

	case 3 :
	rm = number % 100 ;
	if ( rm != 0 )
	{
	display ( " " ) ;
	display ( b[1] ) ;
	display ( " " ) ;
	pass ( rm ) ;
	}
	number /= 100 ;
	break ;

	case 4 :
	rm = number % 100 ;
	if ( rm != 0 )
	{
	display ( " " ) ;
	display ( b[2] ) ;
	display ( " " ) ;
	pass ( rm ) ;
	}
	number /= 100 ;
	break ;

	case 5 :
	rm = number % 100 ;
	//if ( rm != 0 )
	//{
	display ( " " ) ;
	display ( b[3] ) ;
	display ( " " ) ;
	pass ( rm ) ;
	//}
	number /= 100 ;
	break ;

	case 6 :
		rm = number % 100 ;
		if ( rm != 0 )
		{
		display ( " " ) ;
		display ( b[0] ) ;
		display ( " " ) ;
		pass ( rm ) ;
		}
		number /= 100 ;
		break ;

	case 7 :
		rm = number % 100 ;
		if ( rm != 0 )
		{
		display ( " " ) ;
		display ( b[1] ) ;
		display ( " " ) ;
		pass ( rm ) ;
		}
		number /= 100 ;
		break ;

	}
	c++ ;
	}

	return string;
	}

	public void pass(long number)
	{
	long rm, q ;
	if ( number < 10 )
	{
	display ( a[(int) number] ) ;
	}

	if ( number > 9 && number < 20 )
	{
	display ( c[(int) (number-10)] ) ;
	}

	if ( number > 19 )
	{
	rm = number % 10 ;
	if ( rm == 0 )
	{
	q = number / 10 ;
	display ( d[(int) (q-2)] ) ;
	}
	else
	{
	q = number / 10 ;
	display ( a[(int) rm] ) ;
	display ( " " ) ;
	display ( d[(int) (q-2)] ) ;
	}
	}
	}

	public void display(String s)
	{
	String t ;
	t= string ;
	string= s ;
	string+= t ;
	}
	
	public static String displayWordAfterDecimal(String num){
	  	 String st1[] = { "zero", "one", "two", "three", "four", "five", "six", "seven",
	               "eight", "nine", };
	  	String amountInword="";
	  	char [] chars = num.toCharArray();
	      for(int i=0;i<chars.length;i++){
	      	switch(chars[i]){
	      	case '0':
	      	    amountInword = amountInword+st1[0]+" ";
	      	    break;
	      	case '1':
	      	    amountInword = amountInword+st1[1]+" ";
	      	    break;
	      	case '2':
	      	    amountInword = amountInword+st1[2]+" ";
	      	    break;
	      	case '3':
	      	    amountInword = amountInword+st1[3]+" ";
	      	    break;
	      	case '4':
	      	    amountInword = amountInword+st1[4]+" ";
	      	    break;
	      	case '5':
	      	    amountInword = amountInword+st1[5]+" ";
	      	    break;
	      	case '6':
	      	    amountInword = amountInword+st1[6]+" ";
	      	    break;
	      	case '7':
	      	    amountInword = amountInword+st1[7]+" ";
	      	    break;
	      	case '8':
	      	    amountInword = amountInword+st1[8]+" ";
	      	    break;
	      	case '9':
	      	    amountInword = amountInword+st1[9]+" ";
	      	    break;
	      	}
	      }
	      return amountInword;
	  }
}
