public class FieldTester{
	
	public static void main(String[] args){
		
		System.out.println("invoked main");
		
		System.out.println("print details of FieldCurrent:");

		System.out.println("detailsInBill:"+FieldCurrent.detailsInBill);
		System.out.println("tax:"+FieldCurrent.tax);
		System.out.println("billAmount:"+FieldCurrent.billAmount);
		System.out.println("billHasPhoneNumber:"+FieldCurrent.billHasPhoneNumber);
		System.out.println("billingName:"+FieldCurrent.billingName);
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("print details of FieldTennis : ");
		
		System.out.println("noOfPlayers:"+FieldTennis.noOfPlayers);
		System.out.println("playerName:"+FieldTennis.playerName);
		System.out.println("playerFrom:"+FieldTennis.playerFrom);
		System.out.println("age:"+FieldTennis.age);
		System.out.println("statement:"+FieldTennis.statement);
		
		System.out.println("---------------------------------------------------------------");
		
	    System.out.println("print details of FieldTv : ");

		System.out.println("availableChannels:"+FieldTv.availableChannels);
		System.out.println("channelNo:"+FieldTv.channelNo);
		System.out.println("channelName:"+FieldTv.channelName);
		System.out.println("totalChannels:"+FieldTv.totalChannels);
		System.out.println("search:"+FieldTv.search);
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("print details of FieldContact : ");

		System.out.println("totalContacts:"+FieldContact.totalContacts);
		System.out.println("contactNo:"+FieldContact.contactNo);
		System.out.println("contactName:"+FieldContact.contactName);
		System.out.println("yearOfBirth:"+FieldContact.yearOfBirth);
		System.out.println("emailID:"+FieldContact.emailID);
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("print details of FieldApp : ");
		
		System.out.println("microsoftAppsInPhone:"+FieldApp.microsoftAppsInPhone);
		System.out.println("totalAppsInPhone:"+FieldApp.totalAppsInPhone);
		System.out.println("MicrosoftAppName:"+FieldApp.MicrosoftAppName);
		System.out.println("appsInStore:"+FieldApp.appsInStore);
		System.out.println("canLaunchMicrosoftInPhone:"+FieldApp.canLaunchMicrosoftInPhone);
	}
}