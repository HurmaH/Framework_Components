package ExcelData;

import java.io.IOException;
import java.util.ArrayList;

public class TestData {
	public static void main(String[] args) throws IOException {
		
		dataDriven data = new dataDriven();
		ArrayList dataList = data.getData("Delete Profile");
		
		for (int i=0; i<dataList.size(); i++) {
			System.out.println(dataList.get(i));
		}
	}

}
