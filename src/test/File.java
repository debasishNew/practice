
package test;
import java.io.InputStream;


/**
 * 
 * @author Prudhvi
 *
 */
public class File {
	
	    
	
		private String fileId;

	
		/**
		 * this field represents the name of the file
		 */
		private String fileName;
		
		
		/**
		 * this field represents the data which is stored into the file
		 */
		private byte[] fileData;
		
		
		/**
		 * this field represents the path of file 
		 */
		private String filePath;
		
		
		/**
		 * this field represents reading streams of raw bytes in a particular file
		 */
		private InputStream inputStream;
		
		private boolean displayImage;
		
		
		
		/**
		 * Sets the fileName property  with the fileName that is being set to this object
		 * @param fileName
		 */
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		
		
		/**
		 * Returns the fileName that has been set to this object
		 * @return fileName
		 */
		public String getFileName() {
			return fileName;
		}
		
		
		/**
		 * Sets the fileData property with the fileData that is being set to this object
		 * @param fileData
		 */
		public void setFileData(byte[] fileData) {
			this.fileData = fileData;
		}
		
		
		/**
		 * Returns the fileData in the form of an array of bytes that has been set to this object
		 * @return fileData
		 */
		public byte[] getFileData() {
			return fileData;
		}
		
		
		/**
		 * Sets the filePath property with the filePath that is being set to this object
		 * @param filePath
		 */
		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}
		
		
		/**
		 * Returns the filePath that has been set to this object
		 * @return fileData
		 */
		public String getFilePath() {
			return filePath;
		}
		
		
		/**
		 * Sets the inputStream property with the inputStream that is being set to this object
		 * @param inputStream
		 */
		public void setInputStream(InputStream inputStream) {
			this.inputStream = inputStream;
		}
		
		
		/**
		 * Returns the inputStream that has been set to this object
		 * @return inputStream
		 */
		public InputStream getInputStream() {
			return inputStream;
		}


		public String getFileId() {
			return fileId;
		}


		public void setFileId(String fileId) {
			this.fileId = fileId;
		}


		public boolean isDisplayImage() {
			return displayImage;
		}


		public void setDisplayImage(boolean displayImage) {
			this.displayImage = displayImage;
		}
		
		
	
}
