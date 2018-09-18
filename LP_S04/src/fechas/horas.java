package fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2= new SimpleDateFormat("MMMM - YYYY");
		System.out.println(sdf2.format(d));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("HH:a");
		System.out.println(sdf3.format(d));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("'Nro. de semana ': w");
		System.out.println(sdf4.format(d));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("'El año ': Y 'termina en 'YY");
		System.out.println(sdf5.format(d));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("EEEE','dd 'de' MMMM 'del' y");
		System.out.println(sdf6.format(d));
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("'transcurridos' D 'dias del ' y");
		System.out.println(sdf7.format(d));
		
	}

}
