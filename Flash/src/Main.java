public class Main {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Wittybrains\\Desktop\\chromedriver_win32\\chromedriver.exe");
		for(int a = 0; a < 1; a++) {
			LoadMi n = new LoadMi();
			Thread t = new Thread(n);
			t.start();
		}
		
	}
}
