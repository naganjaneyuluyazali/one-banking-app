package com.banking;

import com.banking.repository.ATMRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpenBankingApplicationTests {

	@Autowired
	ATMRepository atmRepository;
	@Test
	void contextLoads() {

		Object first = new Object();
		Object second = new Object();

		Mockito.when(atmRepository.findByEmail(Mockito.any(String.class))).thenReturn(first, second);
	}

}
