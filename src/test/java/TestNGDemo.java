import org.testng.Assert;
import org.testng.annotations.Test;
import testng.User;

public class TestNGDemo {

    @Test
    public void createNewUserTest(){
        User firstUser = new User("John", 30);
        Assert.assertNotNull(firstUser);
    }

    @Test
    public void loginTest(){

    }
}
