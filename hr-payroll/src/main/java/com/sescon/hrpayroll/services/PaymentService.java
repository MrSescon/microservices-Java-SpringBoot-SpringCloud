package com.sescon.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.sescon.hrpayroll.entitities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
