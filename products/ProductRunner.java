
public class ProductRunner {
	

		public static void main(String args[]){

		String query="SELECT product_name,product_price From product_table WHERE product_price=?;
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue,ConnectionData.USERNAME.getValue,ConnectionData.PASSWORD.getValue));
		PreparedStatement preparedStatement=connection. preparedStatement()){
		preparedStatement.setInt(1,100);
		 ResultSet rows=preparedStatement.resultSet();    
		preparedStatement.excecuteUpdate();

		while(rows.Next()){
		system.out.println(rows.setString(1)+""+rows.setInt(2));
		}
		catch(SQLException e){
		e.printStackTrace();
		}
		}
		}


}
