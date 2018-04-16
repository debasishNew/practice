package test;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class AmountInWord {
	
	
	
	public String getAmountInWords(double price){
		String amountInWords = "";
		int fractionDigit =2;
		
		 double valForConversionToString = price ;
			long dollars = (long)Math.floor( valForConversionToString ) ;
			BigDecimal b = null;
			if(fractionDigit==0){				
				 b = new BigDecimal(valForConversionToString - dollars).setScale(0, RoundingMode.HALF_EVEN) ;
			}else if(fractionDigit==1){
				 b = new BigDecimal(valForConversionToString - dollars).setScale(1, RoundingMode.HALF_EVEN) ;
			}else if(fractionDigit==2){
				 b = new BigDecimal(valForConversionToString - dollars).setScale(2, RoundingMode.HALF_EVEN) ;
			}else if(fractionDigit==3){
				 b = new BigDecimal(valForConversionToString - dollars).setScale(3, RoundingMode.HALF_EVEN);
			}else if(fractionDigit==4){
				 b = new BigDecimal(valForConversionToString - dollars).setScale(4, RoundingMode.HALF_EVEN) ;
			}else if(fractionDigit==5){
				 b = new BigDecimal(valForConversionToString - dollars).setScale(5, RoundingMode.HALF_EVEN) ;
			}else if(fractionDigit==6){
				b = new BigDecimal(valForConversionToString - dollars).setScale(6, RoundingMode.HALF_EVEN) ;
			}else{
				b = new BigDecimal(valForConversionToString - dollars).setScale(0, RoundingMode.HALF_EVEN) ;
			}
			String[] s = b.toString().split("[.]");
			
			String paisa="0";
			
			if(s.length>1){
				paisa = s[1];
			}
			
			
				
				NumWord numWord  = new NumWord();
				try{
				amountInWords=Long.valueOf(paisa)>0?(dollars>0?"" + numWord.convertNumToWord( dollars )+" Rupees" + " and "
							+ NumWord.displayWordAfterDecimal(paisa) + " paise /-":""+ NumWord.displayWordAfterDecimal(paisa) + " paise /-"):""
							+ numWord.convertNumToWord( dollars )+" Rupees";
				}catch(Exception e){
					e.printStackTrace();
					
				}
			
			return amountInWords;
	}
}
