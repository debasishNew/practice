package test;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class HeaderFooter extends PdfPageEventHelper {

	  /*public void onStartPage(PdfWriter writer, Document document) {
	        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Top Left"), 30, 800, 0);
	        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Top Right"), 550, 800, 0);
	    }*/

	    public void onEndPage(PdfWriter writer, Document document) {
	        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(" \u00A9 2017 BOB"), 110, 30, 0);
	        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("page " + document.getPageNumber()), 550, 30, 0);
	    }

}
