package src.main.java.model;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class FormatWikitext
{

	
	public String wikitext;


	
	public FormatWikitext(){
		this.wikitext = new String();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Renvoie la prodction CSV correspondant au tableau de la page HTML sous forme CSV
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ProductionCSV ToCSV(FormatWikitext WikitextFormat) {
		// TODO implement me
		return null;
	}
	
	public FormatWikitext wikisplit() {
			String[] separateur = this.wikitext.split("title");
			FormatWikitext result = new FormatWikitext(separateur[1]);
			System.out.println("Texte à ajouter à l'URL:" + separateur[1]);
			return result;
			/*Url url = new Url("https://fr.wikipedia.org/w/index.php?title=" + result +"&action=edit&section=1");
			return url;*/
		}
	
	/*public FormatWikitext wikisplit2() {
		String[] separateur = this.wikitext.split("title");
		FormatWikitext result = new FormatWikitext(separateur[0]);
		System.out.println(separateur[0]);
		return result;
	}*/


}
