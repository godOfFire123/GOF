package com.glong.proxy.dynamicproxy;

import com.glong.proxy.dynamicproxy.Star;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("RealStar.confer()...");

	}

	@Override
	public void signContract() {
		System.out.println("RealStar.singnContract()...");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()...");

	}

	@Override
	public void sing() {
		System.out.println("RealStar.sing(ÖÜ½ÜÂ×)...");

	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()...");

	}


}
