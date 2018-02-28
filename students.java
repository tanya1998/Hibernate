package mypackage;
public class students {

		protected String email;
		protected String name;
		protected String pwd;
		protected String type;
		
		/**
		 * Constructor
		 * 
		 * @param e - Email id of user
		 * @param pwd - Password of user
		 * @param t - Type of user
		 */
		public students(String e, String pwd, String t) {
			email=e;
			this.pwd=pwd;
			type=t;
		}
		
		/**
		 * Getter Function
		 * 
		 * @return email
		 */
		public String getemail()
		{
			return email;
			
		}
		/**
		 * @return name of user
		 */
		public String getName()
		{
			return name;
		}
}
