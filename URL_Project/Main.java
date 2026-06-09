package URL_Project;

public class Main {
  
	public static void main(String[] args) {
		
		url_shortner obj = new url_shortner();
		
		String longurl = "https://chatgpt.com/?utm_source=google&utm_medium=paid_search&utm_campaign=GOOG_C_SEM_GBR_Core_CHT_BAU_ACQ_PER_MIX_ALL_APAC_IN_EN_032525&c_id=22370388714&c_agid=177344203135&c_crid=741704613486&c_kwid=kwd-1927227100722&c_ims=&c_pms=9062127&c_nw=g&c_dvc=c&gad_source=1&gad_campaignid=22370388714&gbraid=0AAAAA-I0E5cEL7PnmvwzGS_gL9rKNa_Qx&gclid=EAIaIQobChMIhP3ovdr6lAMV3ZhmAh3DSzuDEAAYASAAEgK7pPD_BwE";
		String shorturl = obj.encode(longurl);
		
		System.out.println("shorturl "+shorturl);
		
		String url = obj.decode(shorturl);
		System.out.println("longurl "+url);	
		
		String lurl = "https://chatgpt.com/?utm_source=google&utm_medium=paid_search&utm_campaign=GOOG_C_SEM_GBR_Core_CHT_BAU_ACQ_PER_MIX_ALL_APAC_IN_EN_032525&c_id=22370388714&c_agid=177344203135&c_crid=741704613486&c_kwid=kwd-1927227100722&c_ims=&c_pms=9062127&c_nw=g&c_dvc=c&gad_source=1&gad_campaignid=22370388714&gbraid=0AAAAA-I0E5cEL7PnmvwzGS_gL9rKNa_Qx&gclid=EAIaIQobChMIhP3ovdr6lAMV3ZhmAh3DSzuDEAAYASAAEgK7pPD_BwE";
		String surl = obj.encode(lurl);
		
		System.out.println("shorturl "+surl);
		
		String durl = obj.decode(shorturl);
		System.out.println("longurl "+durl);
	}
}
