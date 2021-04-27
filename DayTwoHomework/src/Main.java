public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",
				"Engin Demirog",0);
		Courses course2 = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",
				"Engin Demirog",0);
		Courses course3 = new Courses(3,"Programlamaya Giriþ için Temel Kurs",
				"Engin Demirog",0);
		
		Courses[] courses= {course1,course2,course3};

		for (Courses course : courses) {
			System.out.println(course.courseId+". kurs;");
			System.out.println("Kursun adý = "+course.courseName);
			System.out.println("Kursun eðitmeni = "+course.instructorName);
			System.out.println("Kursun fiyatý = "+course.coursePrice+" TL\r");
		}
		Category category1 = new Category(1,"Tümü",3);
		Category category2 = new Category(2,"Programlama",3);
		
		Category[]categories = {category1,category2};
		for (Category category : categories) {
			System.out.println(category.categoryId+". Kategori");
			System.out.println("Kategorinin adý = "+category.categoryName);
			System.out.println("Kategori kurs sayýsý = "+category.numberOfContent+"\r\n");
		}
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.signUpCourse(course1);
		coursesManager.deleteSignUpCourse(course3);
	}

}
