package cn.hassan.spi;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/7/17 8:46
 * Description:
 */
public class BadPrinter implements Printer {
	@Override
	public void print() {
		System.out.println("this is bad printer");
	}
}
