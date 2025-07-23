package raisetech.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		// localhost:8080
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	// localhost:8080をWebサイトのURLを部分に入力したことによりエラーが返された。
	// それだけだと嫌なので　25:15～
	// 下記のを入力したらもう一回再実行をかけて、ブラウザに戻ってlocalhost:8080helloト入力してみる
	@GetMapping("/hello")
	public String hello() {
		return "Hello World！！";
	}

}
