package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		// 2022-07-05
		
		// MM대문자는 month, mm소문자는 minute
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm");
		System.out.println(format.format(date));
		
		//Calendar 싱글톤
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int dayOfMonth = calendar.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + dayOfMonth + "일");
		
		
		// LocalDateTime으로 변경
		//method chaining 방식
		String format2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 e요일 hh:mm"));
		LocalDateTime now = LocalDateTime.now();
		
		
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh:mm")));
		
	}
}
