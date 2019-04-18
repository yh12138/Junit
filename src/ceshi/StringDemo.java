package ceshi;

public class StringDemo {
	public StringDemo() {
	}
public String smallString(String str)// 字符串变小写
	{
		String temp = "error";
		if (str.equals("") || str == null) {
			return temp;
		}
		String s = str.toLowerCase();
		return s;
	}
}
