package Fack_Test_double_without_mockito.Dummy;

import Unit_testing_Mockito.Dummy.EmailService;

public class DummyEmailService implements EmailService{

	@Override
	public void sendEmail(String message) {
    throw new AssertionError("Method not be implemented");
	}

}
