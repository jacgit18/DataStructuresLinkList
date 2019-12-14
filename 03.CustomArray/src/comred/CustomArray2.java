package comred;

import java.util.Arrays;

import edu.citytech.cst.datastructure.ICustomArray;

	/**
	 * Currently an Array does now allow changes in its size, unless a new array is
	 * created. Elements in an array cannot be deleted or inserted from an array.The
	 * custom array will support the following methods:
	 * 
	 * @author jac
	 *
	 */
	public class CustomArray2 implements ICustomArray {
		// the body of all the methods implemented from
		// ICustomArray are used and created in this class
		private String[] x;
		private String xy;

		/**
		 * add–allows developer to add data
		 */
		@Override
		public void add(String xy) {
			this.xy = xy;
			
		
//		        String[] copyTo = new String[7];
	//
//		        System.arraycopy(xy, 0, copyTo, 0, xy.length());
//		        System.out.println(copyTo);

		}

		/**
		 * delete–allows developer to delete the data based on the value
		 */
		@Override
		public int delete(String xy) {
			this.xy = xy;

//			String[] copyFrom =this.x;		
	//
//		    String[] copyTo = new String[5];
	//
//	        System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
//	        
//	        System.out.println(Arrays.toString(copyTo));

//	       this.x = [6];		
//			for (int i = 0; i < this.x; i++)
//			{
//			    if (xy[i].equals(stringToRemove))
//			    {
//			        xy[i] = null;
//			        break;
//			    }
//			} 
			return 0;
		}

		/**
		 * getAll–returns all the String from the StringCustomArray
		 */
		@Override
		public String[] getAll() {
			this.x = this.xy.split(" ");

			return x;
		}

		/**
		 * inserts–inserts many items in one method
		 */
		@Override
		public void inserts(String... xy) {

			for (String i : xy) {

				this.xy = this.xy + i;
			}

			String[] copyFrom = getAll();

			String[] copyTo = new String[copyFrom.length + 1];
	//
	//
//			 for (int j=0; j  < copyFrom.length; j++)
//				{
//					copyTo[j] = copyFrom[j];
//				}
//				
//				copyTo[copyFrom.length] = new String(this.xy);
//				copyFrom = copyTo;   
//				
//				
	//
	//
//		        
			System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);

			System.out.println(Arrays.toString(copyTo));
//			 String[] copyFrom =this.x;	
//			 String[] copyTo = new String[ copyFrom.length + 1 ];
//			 
//			for (int i=0; i  < copyFrom.length; i++)
//			{
//				copyTo[i] = copyFrom[i];
//			}
//			
//			copyTo[copyFrom.length] = " Ironman ";
//			copyFrom = copyTo;   
//			

//	        String[] copyFrom =this.x;		
	//
//	        String[] copyTo = new String[8];

//	        copyTo[7] = xy; 
//	        this.xy = this.x

//	        System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
//	        
//	        System.out.println(Arrays.toString(copyTo));

//	        String[] copyTo = java.util.Arrays.copyOfRange(this.x, 0, 7);
//	        for 

//	        copyTo[7] = xy;

//			for (Object xy :  array.getAll()) {
//				System.out.println(string);
//			}
//			xy = 
//			this.x  = [8];
		}

	}