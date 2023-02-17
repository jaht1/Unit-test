import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getFriendList() {
        String[] names = User.getFriendList("facebook.com/user/testUser");
        assertNotEquals(null, names);
    }

    @Test
    void nameIsNotEmpty() {
        String[] names = User.getFriendList("facebook.com/user/testUser");
        assertTrue(names.length > 0);
    }

    @Test
    void nameIsEmpty() {
        String[] names = User.getFriendList("facebook.com/user/testUser");
        assertFalse(names.length < 0);
    }
}