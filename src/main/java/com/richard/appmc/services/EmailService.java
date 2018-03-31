package com.richard.appmc.services;

import com.richard.appmc.domain.Cliente;
import com.richard.appmc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
