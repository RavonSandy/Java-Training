package actionss;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelData {

	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub
		Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("C:\\Users\\santhoshg\\Desktop\\Selenium\\Test.xlsx");
       String strQuery="Select * from Sheet1 where Id=12";
       Recordset recordset=connection.executeQuery(strQuery);
       while(recordset.next()){
        System.out.println(recordset.getField("Name"));
        } 
        
        String strQuery1="INSERT INTO sheet1(ID,Name,Country,Age) VALUES(13,'Test1','UK',23)";
        connection.executeUpdate(strQuery1);
        
        String strQuery2="Update Sheet1 Set Country='UAE' where ID=12 ";
        connection.executeUpdate(strQuery2);
        
        recordset.close();
        connection.close();

	}

}
