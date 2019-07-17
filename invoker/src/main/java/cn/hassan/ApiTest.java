package cn.hassan;

import cn.hassan.spi.Printer;

import java.util.ServiceLoader;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/7/17 9:10
 * Description:
 */
public class ApiTest {
	public static void main(String[] args) {
		ServiceLoader<Printer> printers = ServiceLoader.load(Printer.class);
		for (Printer printer : printers) {
			printer.print();
		}
	}
}
