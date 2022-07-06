package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		// 2022-07-05
		
		// MM대문자는 month, mm소문자는 minute
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm");
		System.out.println(format.format(date));
		
		// LocalDateTime으로 변경
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh:mm")));
		
	}
}
