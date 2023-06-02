package homework;

public class TestService {
   private TestDTO dto = new TestDTO();
   
   public void Power(String power) {
      dto.setPower(power);
   }
   public void control(int control) {
      dto.setControl(control);
   }
   public void timer(int timer) {
      dto.setTimer(timer);
   }
   public TestDTO getTest() {
      return dto;
   }
}
