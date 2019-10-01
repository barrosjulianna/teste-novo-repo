package coursequatro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Datee {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//DATA COM HORÁRIO ATUAL
		Date x1 = new Date();
		Date x2= new Date(System.currentTimeMillis());
		
		Date x3= new Date(0L); //desde a meia noite do dia 1 de janeiro de 1970
		Date x4 = new Date(1000L * 60L * 60L* 5L); //imprimir as 5 da manha do 1 jan
		
			Date y1 = sdf1.parse("25/06/2018");
			Date y2=sdf2.parse("25/06/2018 15:42:07");
			//Formatado
			System.out.println("Y1: "+sdf2.format(y1));
			System.out.println("y2: " +y2);
			//DATA ATUAL
			System.out.println("data atual x1: "+sdf2.format(x1));
			System.out.println("data atual x2: "+sdf2.format(x2));
			System.out.println("data atual x3: "+sdf2.format(x3));
			System.out.println("data atual x4: "+sdf2.format(x4));
			
			Date y3=Date.from(Instant.parse("2018-06-25T15:42:07Z"));
			System.out.println("Y3: "+sdf2.format(y3));
			
			System.out.println("---------------");
			
			System.out.println("Y1: "+sdf2.format(y1));
			System.out.println("y2: " +y2);
			//DATA ATUAL
			System.out.println("data atual x1: "+sdf3.format(x1));
			System.out.println("data atual x2: "+sdf3.format(x2));
			System.out.println("data atual x3: "+sdf3.format(x3));
			System.out.println("data atual x4: "+sdf3.format(x4));
			System.out.println("sem formatação"+x4);
			System.out.println("Y3: "+sdf2.format(y3));
			//UTILIZANDO CALENDAR
			
			Date d= Date.from(Instant.parse("2018-06-25T15:42:07Z"));
			System.out.println(sdf3.format(d));
			//acresentar 4h na data
			Calendar cal = Calendar.getInstance(); //isntanciar calender
			cal.setTime(d);
			cal.add(Calendar.HOUR_OF_DAY, 4); //ACRESCEBTAR 4 HORAS NA HORA DO CAL
			d=cal.getTime(); //receber o cal no d
			System.out.println(sdf3.format(d));
			//PEGAR QUANTOS MINUTOS OU UNIDADE DE TEMPO TEM DENTRO DA VARIAVEL
			
			int minutes= cal.get(Calendar.MINUTE);
			System.out.println("Minutes: "+ minutes);
			int seg=cal.get(Calendar.SECOND);
			System.out.println("Second: "+ seg);
			int month =1+ cal.get(Calendar.MONTH); //ACRESCENTAR O 1 POIS O MES COMEÇA NO 0
			System.out.println("Month: "+ month);
			
			
			

	}

}
