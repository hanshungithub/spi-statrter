package cn.hassan.spi;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/7/17 8:48
 * Description:
 */
public class GoodPrinter implements Printer {
	@Override
	public void print() {
		System.out.println("this is good printer");
	}
}
