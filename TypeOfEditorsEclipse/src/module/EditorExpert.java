package module;

import java.util.*;

public class EditorExpert {
	
	public List getTypes(String favouriteLiterature) {
		
		List typeOfEditorsList = new ArrayList();
		if (favouriteLiterature.equals("different")) {
			typeOfEditorsList.add("you are unique");
		} else if (favouriteLiterature.equals("science")) {
			typeOfEditorsList.add("scientific editor");
			typeOfEditorsList.add("popular science");
		} else if (favouriteLiterature.equals("fiction")) {
			typeOfEditorsList.add("fiction literature");
			typeOfEditorsList.add("children's literature");
			typeOfEditorsList.add("children's literature");
			typeOfEditorsList.add("applied literatyre");
		}
		return typeOfEditorsList;
	}
	

}
