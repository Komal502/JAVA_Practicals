class Student_MGT{
        public String name;
        public String branch;
        private byte age;
        static String regNo;
        private String DOB;
        public int year;
        public String bg;  
             	
        //Regular Students
        static int static_it_regular,static_cse_regular,static_extc_regular;
        static int static_ce_regular,static_mech_regular,static_prod_regular,static_elect_regular,static_inst_regular,static_civl_regular,static_txtl_regular;
       
        //DSY STUDENTS
 	static int static_it_dsy,static_cse_dsy,static_extc_dsy,static_ce_dsy,static_mech_dsy,static_prod_dsy;
 	static int static_elect_dsy,static_ce,static_inst_dsy,static_civl_dsy,static_txtl_dsy;
       
        byte getAge(String dob)
        { 
			return (byte)(2025-Integer.parseInt(dob.substring(6)));
        }
        Student_MGT(String name,String branch,int year,String bg,String dob)
        {
            this.age=getAge(dob);
            this.regNo=getRegNo(branch,year);
            this.name=name;
            this.year=year;
            this.bg=bg;
            this.DOB=dob; 
            this.branch=branch;
	    displayStudents();
			
        }    
		
        String getRegNo(String branch,int year){
            if(year==2023)
            {
				if(branch.equalsIgnoreCase("IT") || branch.equalsIgnoreCase("Information Technology"))
				{
				    this.regNo= year+"BIT"+(String.format("%03d",++static_it_regular));
				}else if(branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("computer Engineering")){
				    this.regNo= year+"BCS"+(String.format("%03d",++static_cse_regular));
				}else if(branch.equalsIgnoreCase("Extc")|| branch.equalsIgnoreCase("Electronics engineering")){
				    this.regNo= year+"BEC"+(String.format("%03d",++static_extc_regular));
				}else if(branch.equalsIgnoreCase("CE") || branch.equalsIgnoreCase("Chemical engineering")){
					this.regNo=year+"BCE"+(String.format("%03d",++static_ce_regular));
				}else if(branch.equalsIgnoreCase("INST")|| branch.equalsIgnoreCase("Instrument Engineering")){
					this.regNo=year+"INST"+(String.format("%03d",++static_inst_regular));
				}else if(branch.equalsIgnoreCase("prod")|| branch.equalsIgnoreCase("Production Engineering")){
					this.regNo=year+"PROD"+(String.format("%03d",++static_prod_regular));
				}else if(branch.equalsIgnoreCase("mech")|| branch.equalsIgnoreCase("Mechnical Engineering")){
					this.regNo=year+"MECH"+(String.format("%03d",++static_mech_regular));
				}else if(branch.equalsIgnoreCase("elect")|| branch.equalsIgnoreCase("Electrical Engineering")){
					this.regNo=year+"BEL"+(String.format("%03d",++static_elect_regular));
				}else if(branch.equalsIgnoreCase("txtl")|| branch.equalsIgnoreCase("Textile Engineering")){
					this.regNo=year+"TXTL"+(String.format("%03d",++static_txtl_regular));
				}else if(branch.equalsIgnoreCase("CIVL")|| branch.equalsIgnoreCase("CIVIL Engineering")){
					this.regNo=year+"CIVL"+(String.format("%03d",++static_civl_regular));
				}else{
                    			this.regNo= "not present this branch";
                }
            }
			if(year==2024)
			{
				if(branch.equalsIgnoreCase("IT")|| branch.equalsIgnoreCase("information Technology"))
				{
					this.regNo=year+"BIT"+(String.format("%03d",500+(++static_it_dsy)));
				}else if(branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("computer Engineering")){
                    			this.regNo= year+"BCS"+(String.format("%03d",500+(++static_cse_dsy)));
                		}else if(branch.equalsIgnoreCase("Extc")|| branch.equalsIgnoreCase("ELectronics engineering")){
                    			this.regNo= year+"bEx"+(String.format("%03d",500+(++static_extc_dsy)));
                			}else if(branch.equalsIgnoreCase("CE") || branch.equalsIgnoreCase("Chemical engineering")){
					this.regNo=year+"BCE"+(String.format("%03d",500+(++static_ce_dsy)));
				}else if(branch.equalsIgnoreCase("INST")|| branch.equalsIgnoreCase("Instrument Engineering")){
					this.regNo=year+"INST"+(String.format("%03d",500+(++static_inst_dsy)));
				}else if(branch.equalsIgnoreCase("prod")|| branch.equalsIgnoreCase("Production Engineering")){
					this.regNo=year+"PROD"+(String.format("%03d",500+(++static_prod_dsy)));
				}else if(branch.equalsIgnoreCase("mech")|| branch.equalsIgnoreCase("Mechnical Engineering")){
					this.regNo=year+"MECH"+(String.format("%03d",500+(++static_mech_dsy)));
				}else if(branch.equalsIgnoreCase("elect")|| branch.equalsIgnoreCase("Electrical Engineering")){
					this.regNo=year+"BEL"+(String.format("%03d",500+(++static_elect_dsy)));
				}else if(branch.equalsIgnoreCase("txtl")|| branch.equalsIgnoreCase("Textile Engineering")){
					this.regNo=year+"TXTL"+(String.format("%03d",++static_txtl_regular));
				}else if(branch.equalsIgnoreCase("CIVL")|| branch.equalsIgnoreCase("CIVIL Engineering")){
					this.regNo=year+"CIVL"+(String.format("%03d",500+(++static_civl_dsy)));
				}else{
                    			this.regNo= "not present this branch";
               			}
			} 
			return regNo;
		}
		
        	void displayStudents(){
		    System.out.println("Name"+name);
		    System.out.println("Branch="+branch);
		    System.out.println("Registration NO="+regNo);
		    System.out.println("Blood Group="+bg);
		    System.out.println(("Age="+age));    
		}
		public static void main(String args[])
		{
			Student_MGT obj=new Student_MGT("Komal","IT",2024,"A+","15-08-2006");
			Student_MGT obj2=new Student_MGT("Divya","IT",2023,"A+","13-08-2006");
			Student_MGT obj3=new Student_MGT("Shital","IT",2023,"B","17-02-2006");
		}
	}
