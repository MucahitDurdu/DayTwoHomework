public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)",
				"Engin Demirog",0);
		Courses course2 = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)",
				"Engin Demirog",0);
		Courses course3 = new Courses(3,"Programlamaya Giri� i�in Temel Kurs",
				"Engin Demirog",0);
		
		Courses[] courses= {course1,course2,course3};

		for (Courses course : courses) {
			System.out.println(course.courseId+". kurs;");
			System.out.println("Kursun ad� = "+course.courseName);
			System.out.println("Kursun e�itmeni = "+course.instructorName);
			System.out.println("Kursun fiyat� = "+course.coursePrice+" TL\r");
		}
		Category category1 = new Category(1,"T�m�",3);
		Category category2 = new Category(2,"Programlama",3);
		
		Category[]categories = {category1,category2};
		for (Category category : categories) {
			System.out.println(category.categoryId+". Kategori");
			System.out.println("Kategorinin ad� = "+category.categoryName);
			System.out.println("Kategori kurs say�s� = "+category.numberOfContent+"\r\n");
		}
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.signUpCourse(course1);
		coursesManager.deleteSignUpCourse(course3);
	}

}
