package package_inheritance;
class softwareTesting
{
	void syllabus()
	{
		System.out.println("Software testing details");
		System.out.println("Manual testing,Core Java,Selenium Webdriver,Jira(Project Management,Mysql(Database) ");
		System.out.println("50,000 ");
		
	}
}
class Manual extends softwareTesting
{
	void manual_testing()
	{
		super.syllabus();
		System.out.println("if it is manual testing only\n then it includes manual testing concepts,Jirs,My Sql,Postman and the fees is 30,000 ");;
	}
}
class Automation extends softwareTesting
{
	void automation_testing()
	{
		super.syllabus();
		System.out.println("if it is Autamation only\ntesting only then it includes Core java,Selenium Webdriver,Jira(Project Management,Mysql(Databas) and fees is 20,000 ");
	}
}

class Java_selenium {

	public static void main(String[] args) 
	{
		System.out.println("*******Manual testing course details********");
		Manual mn=new Manual();
		mn.manual_testing();
		System.out.println("*******Automation testing course details*****");
		Automation auto=new Automation();
		auto.automation_testing();
	}

}
