package etec.pcii.newproject;



import java.sql.Connection;

import persistencia.Conexao;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Connection conn = new Conexao().getMysqlConnection();
    	System.out.println(conn);
    }
}
