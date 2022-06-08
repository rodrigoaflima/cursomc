package com.rodrigolima.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.rodrigolima.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obl);
	
	void sendEmail(SimpleMailMessage msg); 
}
